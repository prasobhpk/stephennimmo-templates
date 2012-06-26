package com.codemkr.etrm.core.repository;

import org.springframework.data.repository.CrudRepository;

import com.codemkr.etrm.core.object.Trade;

public interface TradeRepository extends CrudRepository<Trade, Long> {
	
}
