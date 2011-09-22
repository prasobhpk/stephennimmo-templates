package nimmo.template.hazelcast;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import nimmo.template.hazelcast.computation.MarketDataPriceAverage;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class MarketDataDistributedExecutorClient {
	
	public static void main(String[] args) {
		MarketDataDistributedExecutorClient client = new MarketDataDistributedExecutorClient();
		try {
			client.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start() throws InterruptedException, ExecutionException {
		HazelcastClient hazelcastClient = HazelcastClientHelper.getClient();
		Future<Float> result = hazelcastClient.getExecutorService().submit(new MarketDataPriceAverage());
		System.out.println(result.get());
	}

}
