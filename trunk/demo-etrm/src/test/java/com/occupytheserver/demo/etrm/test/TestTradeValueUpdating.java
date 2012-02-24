package com.occupytheserver.demo.etrm.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hazelcast.core.HazelcastInstance;
import com.occupytheserver.demo.etrm.object.domain.Index;
import com.occupytheserver.demo.etrm.object.domain.IndexBase;
import com.occupytheserver.demo.etrm.object.domain.Side;
import com.occupytheserver.demo.etrm.object.domain.Trade;
import com.occupytheserver.demo.etrm.object.domain.TradeIndexed;
import com.occupytheserver.demo.etrm.service.IndexService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-demo-etrm.xml")
public class TestTradeValueUpdating {
	
	@Autowired HazelcastInstance hazelcastInstance;
	
	@Test
	public void testIndexUpdateValue(){
		
		hazelcastInstance.getCluster();
		
		
		
		
		
		/*
		Index index1 = indexService.put("NYMEX", new BigDecimal("3.00"));
		Index index2 = indexService.put("NYMEX", new BigDecimal("3.00"));
		Index index3 = indexService.find("NYMEX");
		Index index4 = indexService.find("NYMEX");
		Assert.assertTrue(index1 == index2);
		Assert.assertTrue(index2 == index3);
		Assert.assertTrue(index3 == index4);
		
		List<Index> indexes = new ArrayList<>();
		for (int i = 0; i < 5000; i++) {
			Index index = indexService.put("NYMEX", new BigDecimal("3.00"));
			indexes.add(index);
		}	
		Index indexpow = indexService.put("NYMEX", new BigDecimal("2.65"));
		for (Index index : indexes) {
			Assert.assertEquals(new BigDecimal("2.65"), index.getValue());
		}
		*/
	}

}
