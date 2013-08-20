package com.occupytheserver.demo.hazelcast.mapstore;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.core.MapStore;
import com.occupytheserver.demo.hazelcast.object.MarketDataPrice;
import com.occupytheserver.demo.hazelcast.repository.MarketDataPriceRepository;

@Service
public class MarketDataPriceMapStore implements MapStore<String, MarketDataPrice> {
	
	@Autowired MarketDataPriceRepository marketDataPriceRepository;

	public MarketDataPrice load(String id) {
		return marketDataPriceRepository.findById(id);
	}

	public Map<String, MarketDataPrice> loadAll(Collection<String> keys) {
		Map<String, MarketDataPrice> map = new HashMap<String, MarketDataPrice>();
		List<MarketDataPrice> persons = marketDataPriceRepository.findByIds(keys);
		for (MarketDataPrice person : persons) {
			map.put(person.getSymbol(), person);
		}
		return map;
	}

	public Set<String> loadAllKeys() {
		Set<String> keys = new HashSet<String>();
		List<MarketDataPrice> persons = marketDataPriceRepository.findAll();
		for (MarketDataPrice person : persons) {
			keys.add(person.getSymbol());
		}
		return keys;
	}

	public void delete(String key) {
		marketDataPriceRepository.delete(key);
	}

	public void deleteAll(Collection<String> keys) {
		for (String key : keys) {
			marketDataPriceRepository.delete(key);
		}
	}

	public void store(String key, MarketDataPrice person) {
		marketDataPriceRepository.saveOrUpdate(person);
	}

	public void storeAll(Map<String, MarketDataPrice> map) {
		Collection<MarketDataPrice> persons = map.values();
		for (MarketDataPrice person : persons) {
			marketDataPriceRepository.saveOrUpdate(person);
		}
	}
}
