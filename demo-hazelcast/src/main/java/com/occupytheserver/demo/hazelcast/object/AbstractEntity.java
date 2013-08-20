package com.occupytheserver.demo.hazelcast.object;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

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
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
