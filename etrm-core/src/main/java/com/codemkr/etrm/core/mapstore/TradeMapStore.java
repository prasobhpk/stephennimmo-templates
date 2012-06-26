package com.codemkr.etrm.core.mapstore;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codemkr.etrm.core.object.Trade;
import com.codemkr.etrm.core.repository.TradeRepository;
import com.hazelcast.core.MapStore;

@Component
public class TradeMapStore implements MapStore<Long, Trade> {
	
	@Autowired
	TradeRepository repository;
	
	@Override
	public Trade load(Long key) {
		return repository.findOne(key);
	}

	@Override
	public Map<Long, Trade> loadAll(Collection<Long> keys) {
		Map<Long, Trade> map = new HashMap<>();
		for (Long key : keys) {
			Trade object = repository.findOne(key);
			map.put(object.getTradeUid(), object);
		}
		return map;
	}

	@Override
	public Set<Long> loadAllKeys() {
		Long maxKey = new Long(0);
		Set<Long> set = new HashSet<>();
		Iterable<Trade> objects = repository.findAll();
		for (Trade object : objects) {
			set.add(object.getTradeUid());
			if (object.getTradeUid().compareTo(maxKey) > 0){
				maxKey = object.getTradeUid();
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
	public void store(Long key, Trade value) {
		repository.save(value);
	}

	@Override
	public void storeAll(Map<Long, Trade> map) {
		for (Trade value : map.values()) {
			repository.save(value);
		} 
	}

}
