package com.occupytheserver.demo.hazelcast.test;

import java.util.Collection;
import java.util.Set;


import com.hazelcast.core.IMap;
import com.hazelcast.query.SqlPredicate;
import com.occupytheserver.demo.hazelcast.object.MarketDataPrice;

public class QueryingTheGrid extends AbstractClientExamples {
	
	public static void main(String[] args) {
		QueryingTheGrid mdsml = new QueryingTheGrid();
		mdsml.keyLookup();
		mdsml.valueQuery();
		System.exit(0);
	}
	
	public void keyLookup(){
		IMap<String, MarketDataPrice> clPriceMap = getHazelcastClient().getMap("MarketDataPrice|CL");
		System.out.println(clPriceMap.get("CLZ11").getPrice());
	}
	
	public void valueQuery(){
		IMap<String, MarketDataPrice> clPriceMap = getHazelcastClient().getMap("MarketDataPrice|CL");
		Collection<MarketDataPrice> prices = (Collection<MarketDataPrice>) clPriceMap.values(new SqlPredicate("symbol LIKE %V%"));
		for (MarketDataPrice marketDataPrice : prices) {
			System.out.println(marketDataPrice.getSymbol() + " " + marketDataPrice.getPrice());
		}
	}

}
