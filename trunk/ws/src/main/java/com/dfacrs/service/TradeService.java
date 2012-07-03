package com.dfacrs.service;

import java.util.Collection;

import org.joda.time.DateTime;

import com.dfacrs.object.Trade;

public interface TradeService {

	Trade save(Trade trade);

	Trade findByTradeId(String tradeId);

	Collection<Trade> findByDateRange(DateTime startDateTime, DateTime endDateTime);

}