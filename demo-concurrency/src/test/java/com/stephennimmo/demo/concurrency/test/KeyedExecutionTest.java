package com.stephennimmo.demo.concurrency.test;

import java.util.UUID;


import org.junit.Test;

import com.stephennimmo.demo.concurrency.KeyedExecutorService;
import com.stephennimmo.demo.concurrency.example.StringPrinter;

public class KeyedExecutionTest {
	
	@Test
	public void runKeyedExecutionTest(){
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
	}

}
