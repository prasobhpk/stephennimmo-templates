package nimmo.template.hazelcast.repository;

import nimmo.template.hazelcast.object.MarketDataPrice;
import org.springframework.stereotype.Repository;

@Repository
public class MarketDataPriceRepositoryHibernate extends GenericRepositoryHibernate<String, MarketDataPrice> implements MarketDataPriceRepository {

}
