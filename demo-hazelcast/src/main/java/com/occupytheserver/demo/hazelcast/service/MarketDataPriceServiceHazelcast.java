package com.occupytheserver.demo.hazelcast.service;

import org.springframework.stereotype.Service;

import com.occupytheserver.demo.hazelcast.object.MarketDataPrice;

@Service
public class MarketDataPriceServiceHazelcast extends GenericServiceHazelcast<String, MarketDataPrice> implements MarketDataPriceService {

}
