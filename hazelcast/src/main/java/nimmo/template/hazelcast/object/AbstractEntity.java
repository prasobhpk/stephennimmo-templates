package nimmo.template.hazelcast.object;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class AbstractEntity implements Entity<Serializable> {
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Entity){
			return this.getKey().equals(((Entity)obj).getKey());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getKey().hashCode();
	}

}
