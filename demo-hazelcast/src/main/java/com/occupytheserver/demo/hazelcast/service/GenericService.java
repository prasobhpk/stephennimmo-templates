package com.occupytheserver.demo.hazelcast.service;

import java.io.Serializable;
import java.util.Collection;

import com.hazelcast.core.Transaction;
import com.occupytheserver.demo.hazelcast.object.Entity;


public interface GenericService<KEY extends Serializable, ENTITY extends Entity> {
	
	Transaction getTransaction();

	Collection<ENTITY> getAll();
	
	ENTITY get(KEY key);

	void put(ENTITY entity);

}