package com.stephennimmo.demo.concurrency;

public interface KeyedRunnable<T> extends Runnable {
	
	T getKey();
	
	T getDependentKey();

}
