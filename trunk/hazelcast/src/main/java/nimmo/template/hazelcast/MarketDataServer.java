package nimmo.template.hazelcast;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MarketDataServer {
	
	ApplicationContext applicationContext;
	
	public void start(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-hazelcast.xml");
	}
	
	public static void main(String[] args) {
		MarketDataServer mds = new MarketDataServer();
		mds.start();
	}

}
