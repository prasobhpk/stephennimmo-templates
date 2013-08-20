package com.occupytheserver.demo.hazelcast.object;

import java.io.Serializable;

public interface Entity<T> extends Serializable {
	
	T getKey();

}
