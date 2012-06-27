package com.codemkr.etrm.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.codemkr.etrm.object.Trade;
import com.codemkr.etrm.service.TradeService;

public class TradeServiceTest extends AbstractServiceTest {
	
	@Autowired
	TradeService tradeService;
	
	@Test
	public void testInsert(){
		Trade object = new Trade();
		object.setComments("Testing Comments " + System.currentTimeMillis());
		tradeService.save(object);
		try { Thread.sleep(6000); } catch (InterruptedException e) {}
	}
	
	@Test
	public void testUpdate(){
		Trade object1 = new Trade();
		object1.setComments("Testing Comments " + System.currentTimeMillis());
		object1 = tradeService.save(object1);
		object1.setComments("Testing New Comments " + System.currentTimeMillis());
		object1 = tradeService.save(object1);
		try { Thread.sleep(6000); } catch (InterruptedException e) {}
	}

}
