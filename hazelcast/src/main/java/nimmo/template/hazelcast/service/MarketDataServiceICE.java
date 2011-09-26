package nimmo.template.hazelcast.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import nimmo.template.hazelcast.object.MarketDataPrice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.core.ITopic;
import com.hazelcast.core.MessageListener;

@Service
public class MarketDataServiceICE implements MarketDataService, InitializingBean, MessageListener<MarketDataPrice> {
	
	public static Logger logger = LoggerFactory.getLogger(MarketDataServiceICE.class);
	
	@Autowired HazelcastInstance hazelcastInstance;
	
	IMap<String, MarketDataPrice> marketDataPriceMap;
	List<String> symbols;
	
	Random random = new Random();
	BigDecimal initialValue = new BigDecimal("90.0");
	BigDecimal tick = new BigDecimal(".01");
	
	private void init(){
		marketDataPriceMap = hazelcastInstance.getMap("MarketDataPrice|CL");
		symbols = getSymbols();
		for (String symbol : symbols) {
			ITopic<MarketDataPrice> marketDataPriceTopic = hazelcastInstance.getTopic(symbol);
			marketDataPriceTopic.addMessageListener(this);
			MarketDataPrice mdp = new MarketDataPrice(symbol, initialValue, Calendar.getInstance());
			marketDataPriceTopic.publish(mdp);
		}
	}
	
	public void start() {
		MarketDataPrice mdp;
		while (true){
			mdp = marketDataPriceMap.get(symbols.get(random.nextInt(symbols.size())));
			if (mdp == null){
				continue;
			}
			mdp.setCalendar(Calendar.getInstance());
			if (random.nextBoolean() == true){
				mdp.setPrice(mdp.getPrice().add(tick));
			} else {
				mdp.setPrice(mdp.getPrice().subtract(tick));
			}
			ITopic<MarketDataPrice> marketDataPriceTopic = hazelcastInstance.getTopic(mdp.getSymbol());
			marketDataPriceTopic.publish(mdp);
			logger.debug("New Price: " + mdp);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void afterPropertiesSet() throws Exception {
		init();
		start();
	}
	
	public void onMessage(MarketDataPrice marketDataPrice) {
		marketDataPriceMap.put(marketDataPrice.getSymbol(), marketDataPrice);
	}
	
	public static List<String> getSymbols(){
		List<String> symbols = new ArrayList<String>();
		symbols.add("CLV11");
		symbols.add("CLX11");
		symbols.add("CLZ11");
		symbols.add("CLF11");
		symbols.add("CLG11");
		symbols.add("CLH11");
		return symbols;
	}

}
