package nimmo.template.hazelcast;

import java.util.List;

import nimmo.template.hazelcast.object.MarketDataPrice;
import nimmo.template.hazelcast.service.MarketDataServiceICE;

import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.ITopic;
import com.hazelcast.core.MessageListener;

public class EventListeners extends AbstractClientExamples implements MessageListener<MarketDataPrice>, EntryListener<String, MarketDataPrice> {
	
	public static void main(String[] args) {
		EventListeners mdec = new EventListeners();
		mdec.messageListener();
	}

	public void messageListener(){
		List<String> symbols = MarketDataServiceICE.getSymbols();
		for (String symbol : symbols) {
			ITopic<MarketDataPrice> mdpTopic = getHazelcastClient().getTopic(symbol);
			mdpTopic.addMessageListener(this);
		}
	}
	
	public void onMessage(MarketDataPrice mdp) {
		System.out.println(mdp);
	}
	
	public void entryAdded(EntryEvent<String, MarketDataPrice> entryEvent) {
		entryEvent.getOldValue();
		entryEvent.getValue();
		System.out.println(entryEvent);
	}

	public void entryEvicted(EntryEvent<String, MarketDataPrice> entryEvent) {
		System.out.println(entryEvent);
	}

	public void entryRemoved(EntryEvent<String, MarketDataPrice> entryEvent) {
		System.out.println(entryEvent);
	}

	public void entryUpdated(EntryEvent<String, MarketDataPrice> entryEvent) {
		System.out.println(entryEvent);
	}
	
}
