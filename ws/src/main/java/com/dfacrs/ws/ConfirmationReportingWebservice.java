package com.dfacrs.ws;

import java.util.Collection;

import javax.jws.WebService;

import org.joda.time.DateTime;

import com.dfacrs.object.Trade;
import com.dfacrs.object.TradeValuation;

@WebService
public interface ConfirmationReportingWebservice {

	Trade handleTradeExecution(Trade trade);
	
	Trade handleTradeConfirmation(Trade trade);
	
	TradeValuation handleTradeValuation(TradeValuation tradeValuation);
	
	Trade findByTradeId(String tradeId);

	Collection<Trade> findByDateRange(DateTime startDateTime, DateTime endDateTime);

}