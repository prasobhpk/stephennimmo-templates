package nimmo.template.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastClientHelper {
	
	public static HazelcastClient getClient(){
		HazelcastClient client = HazelcastClient.newHazelcastClient("test", "test", "127.0.0.1:5701");
		return client;
	}

}
