package com.stephennimmo.demo.activemq;

import java.io.Serializable;

public class TestMessage implements Serializable {

	private static final long serialVersionUID = 1158101965606051807L;
	
	private String uuid;
	private String dateTime;
	
	public TestMessage(String uuid, String dateTime) {
		this.uuid = uuid;
		this.dateTime = dateTime;
	}
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}