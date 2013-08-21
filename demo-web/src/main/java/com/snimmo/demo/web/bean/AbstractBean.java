package com.snimmo.demo.web.bean;

import javax.faces.context.FacesContext;

import com.snimmo.demo.web.filter.SessionVariables;
import com.snimmo.demo.web.model.User;


public abstract class AbstractBean {
	
	public User getCurrentUser(){
		return (User) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(SessionVariables.CURRENT_USER);
	}
	
	public void setCurrentUser(User user){
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(SessionVariables.CURRENT_USER, user);
	}
	
}
