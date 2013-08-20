package com.occupytheserver.demo.hazelcast.test;

import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.occupytheserver.demo.hazelcast.computation.MarketDataPriceAverageCallable;
import com.occupytheserver.demo.hazelcast.computation.MarketDataPriceAverageRunnable;


public class DistributedExecution extends AbstractClientExamples {
	
	public static void main(String[] args) {
		DistributedExecution de = new DistributedExecution();
		try {
			de.runCallable();
			de.runRunnable();
			System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	public void runCallable() throws InterruptedException, ExecutionException {
		Future<BigDecimal> result = getHazelcastClient().getExecutorService().submit(new MarketDataPriceAverageCallable("CL"));
		System.out.println(result.get());
	}
	
	public void runRunnable() throws InterruptedException, ExecutionException {
		getHazelcastClient().getExecutorService().submit(new MarketDataPriceAverageRunnable("CL"));
	}

}
