package com.dfacrs.service;

import java.util.Collection;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfacrs.object.Trade;
import com.dfacrs.repository.TradeRepository;

@Service
public class TradeServiceImpl implements TradeService {
	
	@Autowired
	TradeRepository tradeRepository;
	
	public Trade save(Trade trade){
		return tradeRepository.save(trade);
	}
	
	public Trade findByTradeId(String tradeId){
		return null;
	}
	
	public Collection<Trade> findByDateRange(DateTime startDateTime, DateTime endDateTime){
		return null;
	}

}
