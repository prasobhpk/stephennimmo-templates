package com.codemkr.etrm.web.bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.codemkr.etrm.core.object.User;

public abstract class AbstractBean {
	
	public static final String SESSION_USER = "user";
	
	protected User getCurrentUser(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		return (User)externalContext.getSessionMap().get(SESSION_USER);
	}
	
	protected void putCurrentUser(User user){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.getSessionMap().put(SESSION_USER, user);
	}
	
	protected void addGrowl(String summary, String detail){
		FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage(summary, detail));  
	}
	
	protected void addInfo(String summary, String detail){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail)); 
	}

	protected void addWarn(String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail)); 
	}

	protected void addError(String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail)); 
	}

	protected void addFatal(String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, summary, detail)); 
	}

}
