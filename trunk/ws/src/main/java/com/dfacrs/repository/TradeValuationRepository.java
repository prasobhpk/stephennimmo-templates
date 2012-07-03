package com.dfacrs.repository;

import org.springframework.data.repository.CrudRepository;

import com.dfacrs.object.Trade;

public interface TradeValuationRepository extends CrudRepository<Trade, Long> {
	
}
