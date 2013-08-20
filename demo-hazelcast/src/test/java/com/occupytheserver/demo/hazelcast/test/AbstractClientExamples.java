package com.occupytheserver.demo.hazelcast.test;

import com.hazelcast.client.HazelcastClient;

public abstract class AbstractClientExamples {
	
	HazelcastClient hazelcastClient;
	
	public HazelcastClient getHazelcastClient() {
		if (hazelcastClient == null){
			hazelcastClient = HazelcastClient.newHazelcastClient("test", "test", "127.0.0.1:5701", "127.0.0.1:5702");
		}
		return hazelcastClient;
	}

}
