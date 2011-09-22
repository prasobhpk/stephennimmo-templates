package nimmo.template.hazelcast;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MarketDataServer {
	
	private static ApplicationContext applicationContext;
	
	public void start(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-hazelcast.xml");
	}
	
	public static Object getBean(String name){
		return applicationContext.getBean(name);
	}
	
	public static void main(String[] args) {
		MarketDataServer mds = new MarketDataServer();
		mds.start();
	}

}
