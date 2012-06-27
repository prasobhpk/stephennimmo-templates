package com.codemkr.etrm.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CoreApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-etrm-core.xml");
		CoreApplication coreApplication = applicationContext.getBean("coreApplication", CoreApplication.class);
		coreApplication.start();
	}
	
	public void start(){
		
	}
	
	public void stop(){
		
		
	}

}
