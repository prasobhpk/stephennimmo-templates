package com.codemkr.etrm.core.repository;

import org.springframework.data.repository.CrudRepository;

import com.codemkr.etrm.core.repository.dto.TradeDTO;

public interface TradeRepository extends CrudRepository<TradeDTO, Long> {
	
}
