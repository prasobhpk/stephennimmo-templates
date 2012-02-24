package com.occupytheserver.demo.etrm.object.domain;

import java.math.BigDecimal;

public interface Trade {
	
	int getTradeId();
	
	Side getSide();
	
	BigDecimal getTradeValue();

}
