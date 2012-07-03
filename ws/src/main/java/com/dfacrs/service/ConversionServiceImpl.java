package com.dfacrs.service;

import org.springframework.stereotype.Service;

import com.dfacrs.object.Trade;
import com.dfacrs.service.ice.EConfirmRequest;

@Service
public class ConversionServiceImpl implements ConversionService {
	
	public EConfirmRequest convert(Trade trade){
		EConfirmRequest tradeIce = new EConfirmRequest();
		tradeIce.geteConfirmTrade().setSenderTradeRefId(trade.getTradeId());
		return tradeIce;
	}

}
