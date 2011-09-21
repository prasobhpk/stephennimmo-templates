package nimmo.template.hazelcast.service;

import nimmo.template.hazelcast.object.MarketDataPrice;
import org.springframework.stereotype.Service;

@Service
public class MarketDataPriceServiceHazelcast extends GenericServiceHazelcast<String, MarketDataPrice> implements MarketDataPriceService {

}
