package nimmo.template.hazelcast.service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import nimmo.template.hazelcast.object.Entity;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.core.Transaction;

public class GenericServiceHazelcast<KEY extends Serializable, ENTITY extends Entity> implements GenericService<KEY, ENTITY> {

	@Autowired HazelcastInstance instance;
	private Class<ENTITY> persistentClass;
	private IMap<KEY, ENTITY> map;

	@SuppressWarnings("unchecked")
	public GenericServiceHazelcast() {
		this.persistentClass = (Class<ENTITY>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	public Transaction getTransaction(){
		return instance.getTransaction();
	}
	
	private IMap<KEY, ENTITY> getMap() {
		if (map == null){
			this.map = instance.getMap(persistentClass.getSimpleName());
		}
		return map;
	}
	
	public Collection<ENTITY> getAll(){
		Set<KEY> keys = getMap().keySet();
		return getMap().getAll(keys).values();
	}
	
	public ENTITY get(KEY key){
		return getMap().get(key);
	}
	
	@SuppressWarnings("unchecked")
	public void put(ENTITY entity){
		getMap().put((KEY) entity.getKey(), entity);
	}

}
