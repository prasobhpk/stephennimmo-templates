package com.stephennimmo.demo.activemq;

import java.util.UUID;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class JMSProducer implements Runnable {
	
	@Autowired
	private JmsTemplate jmsTemplate;
    
    public void init() {
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		while (true){
			jmsTemplate.send("test", new MessageCreator() {
				public Message createMessage(Session session) throws JMSException {
					return session.createObjectMessage(new TestMessage(UUID.randomUUID().toString(), (new DateTime()).toString()));
				}
			});
			System.out.println("Message Sent");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
