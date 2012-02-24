package com.occupytheserver.demo.etrm.repository.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.occupytheserver.demo.etrm.repository.CommodityTypeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-demo-etrm.xml")
public class TestCommodityTypeRepository {
	
	@Autowired CommodityTypeRepository commodityTypeRepository;
	
	@Test
	public void testFindAll(){
		
		commodityTypeRepository.findAll();
		
	}

}
