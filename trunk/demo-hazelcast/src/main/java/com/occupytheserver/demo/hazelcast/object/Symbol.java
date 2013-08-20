package com.occupytheserver.demo.hazelcast.object;

import java.io.Serializable;

public class Symbol extends AbstractEntity {
	
	private static final long serialVersionUID = -5849759193205976750L;
	
	private String value;

	public Serializable getKey() {
		return value;
	}
	
	public String getValue() {
		return value;
	}

}
