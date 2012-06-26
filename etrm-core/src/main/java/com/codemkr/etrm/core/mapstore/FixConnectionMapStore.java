package com.codemkr.etrm.core.mapstore;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codemkr.etrm.core.object.FixConnection;
import com.codemkr.etrm.core.repository.FixConnectionRepository;
import com.hazelcast.core.IdGenerator;
import com.hazelcast.core.MapStore;

@Component
public class FixConnectionMapStore implements MapStore<Long, FixConnection> {
	
	@Autowired
	FixConnectionRepository repository;

	@Override
	public FixConnection load(Long key) {
		return repository.findOne(key);
	}

	@Override
	public Map<Long, FixConnection> loadAll(Collection<Long> keys) {
		Map<Long, FixConnection> map = new HashMap<>();
		for (Long key : keys) {
			FixConnection object = repository.findOne(key);
			map.put(object.getFixConnectionUid(), object);
		}
		return map;
	}

	@Override
	public Set<Long> loadAllKeys() {
		Long maxKey = new Long(0);
		Set<Long> set = new HashSet<>();
		Iterable<FixConnection> objects = repository.findAll();
		for (FixConnection object : objects) {
			set.add(object.getFixConnectionUid());
			if (object.getFixConnectionUid().compareTo(maxKey) > 0){
				maxKey = object.getFixConnectionUid();
			}
		}
		//while (idGenerator.newId() < maxKey) {}
		return set;
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
	}

	@Override
	public void deleteAll(Collection<Long> keys) {
		for (Long key : keys) {
			repository.delete(key);
		}
	}

	@Override
	public void store(Long key, FixConnection value) {
		repository.save(value);
	}

	@Override
	public void storeAll(Map<Long, FixConnection> map) {
		for (FixConnection value : map.values()) {
			repository.save(value);
		} 
	}

}
