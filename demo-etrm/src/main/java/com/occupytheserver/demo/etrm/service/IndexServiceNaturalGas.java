package com.occupytheserver.demo.etrm.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.jws.Oneway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.occupytheserver.demo.etrm.object.cache.IndexCO;
import com.occupytheserver.demo.etrm.object.domain.Index;
import com.occupytheserver.demo.etrm.object.domain.IndexBase;

@Service
public class IndexServiceNaturalGas extends AbstractService  {
	/*
	@Autowired HazelcastInstance hazelcastInstance;
	
	private IMap<String, IndexCO> distributedMap;
	private Map<String, Index> localMap = new HashMap<String, Index>();
	
	@PostConstruct
	public void init(){
		distributedMap = hazelcastInstance.getMap(Index.class.getSimpleName());
	}
	
	public synchronized Index put(String indexId, BigDecimal value) {
		IndexBase index;
		if (localMap.containsKey(indexId)){
			//index = localMap.get(indexId);
			index.setValue(value);
		} else {
			index = new IndexBase(indexId, value);
			//distributedMap.addEntryListener(index, indexId, true);
			localMap.put(indexId, index);
		}
		//distributedMap.put(indexId, value);
		return index;
	}
	
	public synchronized Index find(String indexId){
		if (localMap.containsKey(indexId)){
			return localMap.get(indexId);
		} else {
		//	BigDecimal value = distributedMap.get(indexId);
			//IndexBase index = new IndexBase(indexId, value);
		//	distributedMap.addEntryListener(index, indexId, true);
		//	localMap.put(indexId, index);
			//return index;
		}
		return null;
	}*/

}
