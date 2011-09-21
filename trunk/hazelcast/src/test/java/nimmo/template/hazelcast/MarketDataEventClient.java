package nimmo.template.hazelcast;

import nimmo.template.hazelcast.object.MarketDataPrice;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class MarketDataEventClient implements EntryListener<String, MarketDataPrice> {

	public void start(){
		HazelcastInstance client = HazelcastClient.newHazelcastClient("test", "test", "10.112.199.53:5701");
		IMap<String, MarketDataPrice> marketDataPriceMap = client.getMap("MarketDataPrice");
		marketDataPriceMap.addEntryListener(this, true);
	}
	
	public void entryAdded(EntryEvent<String, MarketDataPrice> arg0) {
		System.out.println(arg0);
	}
	
	public void entryEvicted(EntryEvent<String, MarketDataPrice> arg0) {
		System.out.println(arg0);
	}
	
	public void entryRemoved(EntryEvent<String, MarketDataPrice> arg0) {
		System.out.println(arg0);
	}
	
	public void entryUpdated(EntryEvent<String, MarketDataPrice> arg0) {
		System.out.println(arg0);
	}
	
	public static void main(String[] args) {
		MarketDataEventClient mdec = new MarketDataEventClient();
		mdec.start();
	}

}
