package nimmo.template.hazelcast.computation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import java.util.concurrent.Callable;

import nimmo.template.hazelcast.object.MarketDataPrice;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.HazelcastInstanceAware;
import com.hazelcast.core.IMap;

public class MarketDataPriceAverageCallable implements Callable<BigDecimal>, Serializable, HazelcastInstanceAware {
	
	private static final long serialVersionUID = 7351850221098104785L;
	
	HazelcastInstance hazelcastInstance;
	private String productType;
	
	public MarketDataPriceAverageCallable(String productType) {
		this.productType = productType;
	}
	
	public void setHazelcastInstance(HazelcastInstance hazelcastInstance) {
		this.hazelcastInstance = hazelcastInstance;
	}
	
	public BigDecimal call() throws Exception {
		BigDecimal sum = new BigDecimal("0.0");
		IMap<String, MarketDataPrice> mdpMap = hazelcastInstance.getMap("MarketDataPrice|" + productType);
		Set<String> keys = mdpMap.keySet();
		for (String key : keys) {
			System.out.println(key + " " + mdpMap.get(key).getPrice());
			sum.add(mdpMap.get(key).getPrice());
		}
		return sum.equals(new BigDecimal("0.0")) ? sum : sum.divide(new BigDecimal(keys.size()));
	}

}
