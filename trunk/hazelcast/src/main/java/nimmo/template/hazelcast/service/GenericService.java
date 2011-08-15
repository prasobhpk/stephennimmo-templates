package nimmo.template.hazelcast.service;

import java.io.Serializable;
import java.util.Collection;

import com.hazelcast.core.Transaction;

import nimmo.template.hazelcast.object.Entity;

public interface GenericService<KEY extends Serializable, ENTITY extends Entity> {
	
	Transaction getTransaction();

	Collection<ENTITY> getAll();
	
	ENTITY get(KEY key);

	void put(ENTITY entity);

}