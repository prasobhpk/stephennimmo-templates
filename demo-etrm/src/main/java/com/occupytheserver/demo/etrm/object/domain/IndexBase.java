package com.occupytheserver.demo.etrm.object.domain;

import java.math.BigDecimal;

import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.HazelcastInstanceAware;
import com.hazelcast.core.IMap;

public class IndexBase extends AbstractDomainObject implements Index, EntryListener<String, BigDecimal> {
	
	private String indexId;
	private BigDecimal value;
	
	public IndexBase(String indexId, BigDecimal value) {
		this.indexId = indexId;
		this.value = value;
	}

	@Override
	public String getIndexId() {
		return indexId;
	}
	
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Override
	public BigDecimal getValue() {
		return value;
	}

	@Override
	public void entryAdded(EntryEvent<String, BigDecimal> event) {
		
	}

	@Override
	public void entryEvicted(EntryEvent<String, BigDecimal> event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entryRemoved(EntryEvent<String, BigDecimal> event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entryUpdated(EntryEvent<String, BigDecimal> event) {
		// TODO Auto-generated method stub
		
	}
}
