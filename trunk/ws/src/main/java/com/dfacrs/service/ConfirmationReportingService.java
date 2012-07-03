package com.dfacrs.service;

import com.dfacrs.object.Trade;
import com.dfacrs.object.TradeValuation;

public interface ConfirmationReportingService {
	
	Trade handleTradeExecution(Trade trade);
	
	Trade handleTradeConfirmation(Trade trade);
	
	TradeValuation handleTradeValuation(TradeValuation tradeValuation);

}