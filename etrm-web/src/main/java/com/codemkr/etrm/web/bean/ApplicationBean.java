package com.codemkr.etrm.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;

import com.codemkr.etrm.object.ApplicationUser;

@ManagedBean
@SessionScoped
@Component
public class ApplicationBean extends AbstractBean {
	
	private ApplicationUser user;
	
	private String login = "snimmo";
	private String password = "password";

	public String login() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.getFlash().setKeepMessages(true);
		user = new ApplicationUser();
		if (user == null){
			addError("Invalid Login and/or Password.", "Please try again or contact customer support");
			return "login";
		}
		externalContext.getSessionMap().put("user", user);
		addGrowl("User Logged In", "User " + " TODO is logged in.");
		return "home?faces-redirect=true";
	}
	
	public ApplicationUser getUser() {
		return user;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
