package com.occupytheserver.demo.hazelcast.repository;

import org.springframework.stereotype.Repository;

import com.occupytheserver.demo.hazelcast.object.MarketDataPrice;

@Repository
public class MarketDataPriceRepositoryHibernate extends GenericRepositoryHibernate<String, MarketDataPrice> implements MarketDataPriceRepository {

}
