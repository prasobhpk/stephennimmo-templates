package nimmo.template.concurrency.example;

import nimmo.template.concurrency.KeyedRunnable;

public class StringPrinter implements KeyedRunnable<String> {
	
	private String key;
	private String dependentKey;
	private String aString;
	
	public StringPrinter(String key, String dependentKey, String aString) {
		this.key = key;
		this.dependentKey = dependentKey;
		this.aString = aString;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + aString);
	}
	
	@Override
	public String getKey() {
		return key;
	}
	
	@Override
	public String getDependentKey() {
		return dependentKey;
	}

}
