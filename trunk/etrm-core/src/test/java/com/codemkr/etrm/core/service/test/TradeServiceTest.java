package com.codemkr.etrm.core.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.codemkr.etrm.core.object.Trade;
import com.codemkr.etrm.core.service.TradeService;

public class TradeServiceTest extends AbstractDataTest {
	
	@Autowired
	TradeService tradeService;
	
	@Test
	public void testInsert(){
		Trade object = new Trade();
		object.setComments("Testing Comments " + System.currentTimeMillis());
		tradeService.save(object);
		try { Thread.sleep(6000); } catch (InterruptedException e) {}
	}

}
