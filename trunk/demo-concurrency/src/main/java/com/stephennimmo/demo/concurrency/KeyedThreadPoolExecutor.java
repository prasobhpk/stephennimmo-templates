package com.stephennimmo.demo.concurrency;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class KeyedThreadPoolExecutor<T> extends ThreadPoolExecutor {
	
	private ConcurrentMap<T, UUID> uuidMap;

	public KeyedThreadPoolExecutor(ConcurrentMap<T, UUID> uuidMap, int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
		this.uuidMap = uuidMap;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void afterExecute(Runnable command, Throwable t) {
		super.afterExecute(command, t);
		if (command instanceof KeyedRunnable<?>){
			KeyedRunnable<T> keyedRunnable = (KeyedRunnable<T>)command;
			if (keyedRunnable.getKey() == null && keyedRunnable.getDependentKey() == null){
				return;
			}
			synchronized (uuidMap) {
				uuidMap.remove(keyedRunnable.getKey());
			}
		}
		
	}
	

}
