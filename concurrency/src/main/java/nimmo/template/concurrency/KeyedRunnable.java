package nimmo.template.concurrency;

public interface KeyedRunnable<T> extends Runnable {
	
	T getKey();
	
	T getDependentKey();

}
