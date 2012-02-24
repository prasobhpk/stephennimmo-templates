package com.occupytheserver.demo.etrm.service;

import java.math.BigDecimal;

import com.occupytheserver.demo.etrm.object.domain.Index;

public interface IndexService {

	Index put(String indexId, BigDecimal value);

	Index find(String indexId);

}