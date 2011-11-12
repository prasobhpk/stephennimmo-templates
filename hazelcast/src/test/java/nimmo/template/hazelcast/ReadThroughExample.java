package nimmo.template.hazelcast;

import java.util.Collection;
import java.util.Set;

import nimmo.template.hazelcast.object.MarketDataPrice;

import com.hazelcast.core.IMap;
import com.hazelcast.query.SqlPredicate;

public class ReadThroughExample extends AbstractClientExamples {
	
	public static void main(String[] args) {
		ReadThroughExample mdsml = new ReadThroughExample();
		mdsml.keyLookup();
		System.exit(0);
	}
	
	public void keyLookup(){
		IMap<String, MarketDataPrice> clPriceMap = getHazelcastClient().getMap("MarketDataPrice|CL");
		Set<String> keys = clPriceMap.keySet();
		for (String key : keys) {
			System.out.println("Existing Keyset: " + key);
		}
		if (clPriceMap.get("ZZZ11") != null){
			System.out.println("Loaded Price: " + clPriceMap.get("ZZZ11").getPrice());
		}
		clPriceMap = getHazelcastClient().getMap("MarketDataPrice|CL");
		for (String key : keys) {
			System.out.println("New Keyset: " + key);
		}
		
	}

}
