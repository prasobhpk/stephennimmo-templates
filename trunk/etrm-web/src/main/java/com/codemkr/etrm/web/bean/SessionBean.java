package com.codemkr.etrm.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codemkr.etrm.core.object.User;
import com.codemkr.etrm.core.service.AdministrationService;

@ManagedBean
@SessionScoped
@Component
public class SessionBean extends AbstractBean {

	@Autowired AdministrationService administrationService;
	
	private User user;
	
	private String login = "snimmo";
	private String password = "password";

	public String login() {
		user = administrationService.findUser(login, password); 
		if (user == null){
			addError("Invalid Login and/or Password.", "Please try again or contact customer support");
			return "login";
		}
		putCurrentUser(user);
		addGrowl("User Logged In", "User " + user.getDisplayName() + " is logged in.");
		return "home";
	}
	
	public User getUser() {
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
