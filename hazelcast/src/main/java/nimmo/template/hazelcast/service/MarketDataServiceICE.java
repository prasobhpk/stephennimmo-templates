package nimmo.template.hazelcast.service;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nimmo.template.hazelcast.object.MarketDataPrice;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

@Service
public class MarketDataServiceICE implements MarketDataService, InitializingBean {
	
	public static Logger logger = LoggerFactory.getLogger(MarketDataServiceICE.class);
	
	@Autowired HazelcastInstance hazelcastInstance;
	
	private String symbol = "CLX11";
	
	public void start() {
		IMap<String, MarketDataPrice> marketDataPriceMap = hazelcastInstance.getMap("MarketDataPrice");
		//Hardcoded Data Service to simulate ticks
		Random r = new Random();
		BigDecimal initialValue = new BigDecimal("90.0");
		BigDecimal tick = new BigDecimal(".01");
		MarketDataPrice mdp = new MarketDataPrice(symbol, initialValue, Calendar.getInstance());
		marketDataPriceMap.put(mdp.getSymbol(), mdp);
		logger.debug("Initial Price: " + mdp);
		while (true){
			mdp = marketDataPriceMap.get(symbol);
			mdp.setCalendar(Calendar.getInstance());
			if (r.nextBoolean() == true){
				mdp.setPrice(mdp.getPrice().add(tick));
			} else {
				mdp.setPrice(mdp.getPrice().subtract(tick));
			}
			marketDataPriceMap.put(mdp.getSymbol(), mdp);
			logger.debug("New Price: " + mdp);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void afterPropertiesSet() throws Exception {
		start();
	}

}
