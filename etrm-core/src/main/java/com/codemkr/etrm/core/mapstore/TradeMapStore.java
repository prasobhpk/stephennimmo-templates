package com.codemkr.etrm.core.mapstore;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codemkr.etrm.core.repository.TradeRepository;
import com.codemkr.etrm.core.repository.dto.TradeDTO;
import com.codemkr.etrm.object.Trade;
import com.hazelcast.core.MapStore;

@Component
public class TradeMapStore implements MapStore<Long, Trade> {
	
	@Autowired
	TradeRepository repository;
	
	@Override
	public Trade load(Long key) {
		TradeDTO dto = repository.findOne(key);
		return dto == null ? null : dto.convertToDomain();
	}

	@Override
	public Map<Long, Trade> loadAll(Collection<Long> keys) {
		Map<Long, Trade> map = new HashMap<>();
		for (Long key : keys) {
			Trade object = repository.findOne(key).convertToDomain();
			map.put(object.getTradeUid(), object);
		}
		return map;
	}

	@Override
	public Set<Long> loadAllKeys() {
		Set<Long> set = new HashSet<>();
		Iterable<TradeDTO> objects = repository.findAll();
		for (TradeDTO object : objects) {
			set.add(object.getTradeUid());
		}
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
		repository.save(new TradeDTO(value));
	}

	@Override
	public void storeAll(Map<Long, Trade> map) {
		for (Trade value : map.values()) {
			repository.save(new TradeDTO(value));
		} 
	}

}
