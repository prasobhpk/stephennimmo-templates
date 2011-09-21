package nimmo.template.hazelcast;

public class TestNanoTiming {
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println((System.nanoTime() - start)/(1000000));
	}

}
