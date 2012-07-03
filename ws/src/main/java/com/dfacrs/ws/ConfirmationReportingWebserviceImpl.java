package com.dfacrs.ws;

import java.util.Collection;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dfacrs.object.Destination;
import com.dfacrs.object.Trade;
import com.dfacrs.object.TradeValuation;
import com.dfacrs.service.ConfirmationReportingService;
import com.dfacrs.service.TradeService;

@WebService(endpointInterface = "com.dfacrs.ws.ConfirmationReportingWebservice")
public class ConfirmationReportingWebserviceImpl implements ConfirmationReportingWebservice {
	
	@Resource
	@Qualifier("confirmationReportingServiceMap")
	Map<Destination, ConfirmationReportingService> confirmationReportingServiceMap;
	
	@Resource
	TradeService tradeService;
	
	public Trade handleTradeExecution(Trade trade){
		ConfirmationReportingService confirmationReportingService = confirmationReportingServiceMap.get(trade.getDestination());
		trade = confirmationReportingService.handleTradeExecution(trade);
		return trade;
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
	
	@Override
	public Trade findByTradeId(String tradeId) {
		return tradeService.findByTradeId(tradeId);
	}
	
	@Override
	public Collection<Trade> findByDateRange(DateTime startDateTime, DateTime endDateTime) {
		return tradeService.findByDateRange(startDateTime, endDateTime);
	}

}
