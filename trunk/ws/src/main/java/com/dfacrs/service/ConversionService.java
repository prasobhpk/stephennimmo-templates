package com.dfacrs.service;

import com.dfacrs.object.Trade;
import com.dfacrs.service.ice.EConfirmRequest;

public interface ConversionService {

	EConfirmRequest convert(Trade trade);

}