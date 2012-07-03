package com.dfacrs.ws;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.dfacrs.object.Destination;
import com.dfacrs.object.Trade;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-dfacrs-ws-test.xml")
public class ConfirmationReportingWebserviceTest {
	
	@Autowired
	ConfirmationReportingWebservice ws;
	
	@Test
	public void testInsert(){
		Trade trade = new Trade();
		trade.setTradeId(UUID.randomUUID().toString());
		trade.setDestination(Destination.ICE);
		trade.setSourceSystem("ALIGNE");
		trade = ws.handleTradeExecution(trade);
		Assert.notNull(trade);
		Assert.notNull(trade.getTradeUid());
	}

}
