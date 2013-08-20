package com.occupytheserver.demo.etrm.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hazelcast.core.HazelcastInstance;
import com.occupytheserver.demo.etrm.object.domain.Trade;

public class TradeServiceHazelcast extends AbstractService {
	
	@Autowired
	HazelcastInstance hazelcastInstance;
	
	Map<Long, Trade> localTradeMap;
	
	public Trade findById(long tradeId){
		return null;
	}

}
