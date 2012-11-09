package com.stephennimmo.demo.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class KeyedExecutorService<T> {

	private int numberOfExecutors;
	private Random random = new Random();
	private ExecutorService unorderedExecutorService;
	private ConcurrentMap<T, UUID> uuidMap = new ConcurrentHashMap<T, UUID>();
	private ConcurrentMap<UUID, KeyedThreadPoolExecutor<T>> threadPoolExecutorMap = new ConcurrentHashMap<UUID, KeyedThreadPoolExecutor<T>>();

	public KeyedExecutorService(int numberOfExecutors) {
		unorderedExecutorService = Executors.newCachedThreadPool();
		this.numberOfExecutors = numberOfExecutors;
		for (int i = 0; i < numberOfExecutors; i++) {
			UUID uuid = UUID.randomUUID();
			KeyedThreadPoolExecutor<T> threadPoolExecutor = new KeyedThreadPoolExecutor<T>(uuidMap, 1, 1, Long.MAX_VALUE, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
			threadPoolExecutorMap.put(uuid, threadPoolExecutor);
		}
	}

	public void execute(KeyedRunnable<T> command) {
		if (command.getKey() == null && command.getDependentKey() == null){
			unorderedExecutorService.execute(command);
		}
		synchronized (uuidMap) {
			if (command.getDependentKey() == null){
				System.out.println("No Dependent Key, sending to least used");
				executeInLeastActivePool(command);
			} else {
				if (uuidMap.containsKey(command.getDependentKey())){
					UUID uuid = uuidMap.get(command.getDependentKey());
					uuidMap.put(command.getKey(), uuid);
					System.out.println("Dependent Key Found, sending to " + uuid);
					threadPoolExecutorMap.get(uuid).execute(command);
				} else {
					System.out.println("No Dependent Key Found, sending to least used");
					executeInLeastActivePool(command);
				}
			}
		}
	}
	
	private void executeInLeastActivePool(KeyedRunnable<T> command){
		Set<Entry<UUID, KeyedThreadPoolExecutor<T>>> entrySet = threadPoolExecutorMap.entrySet();
		for (Entry<UUID, KeyedThreadPoolExecutor<T>> entry : entrySet) {
			if (entry.getValue().getQueue().size() == 0) {
				uuidMap.put(command.getKey(), entry.getKey());
				entry.getValue().execute(command);
				return;
			}
		}
		List<UUID> uuidList = new ArrayList<UUID>(threadPoolExecutorMap.keySet());
		UUID uuid = uuidList.get(random.nextInt(numberOfExecutors));
		uuidMap.put(command.getKey(), uuid);
		threadPoolExecutorMap.get(uuid).execute(command);
	}
	
	public void shutdown(){
		unorderedExecutorService.shutdown();
		for (Iterator<UUID> iterator = threadPoolExecutorMap.keySet().iterator(); iterator.hasNext();) {
			threadPoolExecutorMap.get(iterator.next()).shutdown();
		}
	}

}
