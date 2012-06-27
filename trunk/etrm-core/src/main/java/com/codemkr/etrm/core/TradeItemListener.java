package com.codemkr.etrm.core;

import com.codemkr.etrm.object.Trade;
import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;

public class TradeItemListener implements EntryListener<Long, Trade> {

	@Override
	public void entryAdded(EntryEvent<Long, Trade> event) {

	}

	@Override
	public void entryEvicted(EntryEvent<Long, Trade> event) {

	}

	@Override
	public void entryRemoved(EntryEvent<Long, Trade> event) {

	}

	@Override
	public void entryUpdated(EntryEvent<Long, Trade> event) {

	}
}
