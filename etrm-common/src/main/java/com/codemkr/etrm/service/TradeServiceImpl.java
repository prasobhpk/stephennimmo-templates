package com.codemkr.etrm.service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.codemkr.etrm.object.Trade;
import com.hazelcast.core.IMap;
import com.hazelcast.core.IdGenerator;

@Service
public class TradeServiceImpl implements TradeService {
	
	private static Logger logger = LoggerFactory.getLogger(TradeServiceImpl.class);
	
	@Resource
	IMap<Long, Trade> tradeMap;
	
	@Resource
	IdGenerator tradeIdGenerator;
	
	public Trade save(Trade trade){
		if (trade.getTradeUid() == null){
			trade.setTradeUid(tradeIdGenerator.newId());
		}
		tradeMap.put(trade.getTradeUid(), trade);
		logger.debug("Saving " + trade);
		return trade;
	}
	
	@PostConstruct
	public void initialize(){
		if (tradeIdGenerator.newId() == 1){
			long maxKey = 0;
			for (Long key : tradeMap.keySet()) {
				if (maxKey < key){
					maxKey = key;
				}
			} 
			while (tradeIdGenerator.newId() < maxKey){}
			logger.debug("TradeIdGenerator set to " + maxKey);
		}
	}

}
