package com.codemkr.etrm.core.repository;

import org.springframework.data.repository.CrudRepository;

import com.codemkr.etrm.core.repository.dto.ApplicationUserDTO;
import com.codemkr.etrm.core.repository.dto.TradeDTO;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUserDTO, Long> {
	
}
