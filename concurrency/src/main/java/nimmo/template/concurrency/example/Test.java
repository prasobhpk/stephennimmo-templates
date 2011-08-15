package nimmo.template.concurrency.example;

import java.util.UUID;

import nimmo.template.concurrency.KeyedExecutorService;

public class Test {
	
	public static void main(String[] args) {
		KeyedExecutorService<String> threadMultipoolExecutor = new KeyedExecutorService<String>(10);
		int total = 0;
		for (int i = 1; i < 100000; i++) {
			for (int j = 1; j < 100; j++) {
				String aString = UUID.randomUUID().toString();
				StringPrinter sp = new StringPrinter(Integer.toString(j), Integer.toString(j - 1), aString);
				threadMultipoolExecutor.execute(sp);
				total++;
			}
		}
		System.out.println("Done " + total);
		threadMultipoolExecutor.shutdown();
		/*
		String string1 = "test1";
		StringPrinter sp1 = new StringPrinter("1", string1);
		String string2 = "test2";
		StringPrinter sp2 = new StringPrinter("2", string2);
		
		MultiExecutorService<String> threadMultipoolExecutor = new MultiExecutorService<String>(10);
		threadMultipoolExecutor.execute(sp1);
		threadMultipoolExecutor.execute(sp2);
		
		BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<Runnable>();
		ExecutorService executorService = new ThreadPoolExecutor(1, 1, 100L, TimeUnit.SECONDS, blockingQueue);
		executorService.hashCode();
		blockingQueue.offer(sp2);
		executorService.execute(sp1);
		blockingQueue.offer(sp2);
		System.out.print(true);
		*/
	}

}
