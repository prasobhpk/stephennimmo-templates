package nimmo.template.hazelcast;

import java.util.List;

import nimmo.template.hazelcast.object.MarketDataPrice;
import nimmo.template.hazelcast.service.MarketDataServiceICE;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.core.ITopic;
import com.hazelcast.core.MessageListener;

public class MarketDataEventClient implements MessageListener<MarketDataPrice> {

	public void start(){
		HazelcastInstance client = HazelcastClient.newHazelcastClient("test", "test", "127.0.0.1:5701");
		List<String> symbols = MarketDataServiceICE.getSymbols();
		for (String symbol : symbols) {
			ITopic<MarketDataPrice> mdpTopic = client.getTopic(symbol);
			mdpTopic.addMessageListener(this);
		}
		
	}
	
	public void onMessage(MarketDataPrice mdp) {
		System.out.println(mdp);
	}
	
	public static void main(String[] args) {
		MarketDataEventClient mdec = new MarketDataEventClient();
		mdec.start();
	}

}
