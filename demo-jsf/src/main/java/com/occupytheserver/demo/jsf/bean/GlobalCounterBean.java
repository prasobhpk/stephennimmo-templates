package com.occupytheserver.demo.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.joda.time.DateTime;
import org.primefaces.context.RequestContext;
import org.springframework.stereotype.Component;

@ManagedBean
@SessionScoped
@Component
public class GlobalCounterBean extends AbstractBean {

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public synchronized void increment() {
		count++;
        RequestContext.getCurrentInstance().push("counter", count);
	}
}
                    