package com.dfacrs.service.cme;

import org.springframework.stereotype.Service;

import com.dfacrs.object.Trade;
import com.dfacrs.object.TradeValuation;
import com.dfacrs.service.ConfirmationReportingService;

@Service("CME")
public class ConfirmationReportingServiceCME implements ConfirmationReportingService {
	
	@Override
	public Trade handleTradeExecution(Trade trade) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Trade handleTradeConfirmation(Trade trade) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TradeValuation handleTradeValuation(TradeValuation tradeValuation) {
		// TODO Auto-generated method stub
		return null;
	}

}
