package nimmo.template.hazelcast.computation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import java.util.concurrent.Callable;

import nimmo.template.hazelcast.MarketDataServer;
import nimmo.template.hazelcast.object.MarketDataPrice;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.HazelcastInstanceAware;
import com.hazelcast.core.IMap;

public class MarketDataPriceAverage implements Callable<Float>, Serializable, HazelcastInstanceAware {
	
	HazelcastInstance hazelcastInstance;
	
	public void setHazelcastInstance(HazelcastInstance hazelcastInstance) {
		this.hazelcastInstance = hazelcastInstance;
	}
	
	public Float call() throws Exception {
		float sum = 0.0F;
		IMap<String, MarketDataPrice> mdpMap = hazelcastInstance.getMap("MarketDataPrice");
		Set<String> keys = mdpMap.keySet();
		for (String key : keys) {
			sum += mdpMap.get(key).getPrice().floatValue();
		}
		return sum <= 0 ? sum : sum/keys.size();
	}

}
