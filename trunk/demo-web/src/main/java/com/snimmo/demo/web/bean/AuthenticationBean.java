package com.snimmo.demo.web.bean;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import com.snimmo.demo.web.model.User;
import com.snimmo.demo.web.service.UserService;

@SuppressWarnings("serial")
@ManagedBean(eager = true)
@SessionScoped
public class AuthenticationBean extends AbstractBean implements Serializable {

	private String userName;
	private String password;
	
	@Inject
	private UserService userService;

	public void login(ActionEvent actionEvent) throws IOException {
		User user = userService.find(userName, password);
		if (user == null) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		}
		setCurrentUser(user);
		FacesContext.getCurrentInstance().getExternalContext().redirect("home.html");
	}
	
	public void logout() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		FacesContext.getCurrentInstance().getExternalContext().redirect("home.html");
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
