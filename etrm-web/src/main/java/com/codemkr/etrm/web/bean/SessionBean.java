package com.codemkr.etrm.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codemkr.etrm.object.ApplicationUser;
import com.codemkr.etrm.service.AdministrationService;

@ManagedBean
@SessionScoped
@Component
public class SessionBean extends AbstractBean {

	@Autowired 
	AdministrationService administrationService;
	
	private ApplicationUser applicationUser;
	
	private String login = "snimmo";
	private String password = "password";

	public String login() {
		applicationUser = administrationService.findUser(login, password); 
		if (applicationUser == null){
			addError("Invalid Login and/or Password.", "Please try again or contact customer support");
			return "login";
		}
		putCurrentUser(applicationUser);
		addGrowl("User Logged In", "User is logged in.");
		return "home?faces-redirect=true";
	}
	
	public ApplicationUser getApplicationUser() {
		return applicationUser;
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
