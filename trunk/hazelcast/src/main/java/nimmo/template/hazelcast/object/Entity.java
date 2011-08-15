package nimmo.template.hazelcast.object;

import java.io.Serializable;

public interface Entity<T> extends Serializable {
	
	T getKey();

}
