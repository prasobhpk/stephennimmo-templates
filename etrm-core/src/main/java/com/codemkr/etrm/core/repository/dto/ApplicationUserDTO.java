package com.codemkr.etrm.core.repository.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.codemkr.etrm.object.ApplicationUser;

@Entity(name="APPLICATION_USER")
public class ApplicationUserDTO extends AbstractDTO {

	private static final long serialVersionUID = -7666394574571962335L;
	
	@Id
	@Column(name = "APPLICATION_USER_UID")
	private long applicationUserUid;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	public ApplicationUserDTO() {}
	
	public ApplicationUserDTO(ApplicationUser dom) {
		this.applicationUserUid = dom.getApplicationUserUid();
		this.login = dom.getLogin();
		this.password = dom.getPassword();
		this.firstName = dom.getFirstName();
		this.lastName = dom.getLastName();
	}
	
	public ApplicationUser convertToDomain(){
		ApplicationUser dom = new ApplicationUser();
		dom.setApplicationUserUid(applicationUserUid);
		dom.setLogin(login);
		dom.setPassword(password);
		dom.setFirstName(firstName);
		dom.setLastName(lastName);
		return dom;
	}
	
	
	public String getDisplayName(){
		return lastName + ", " + firstName;
	}
	
	public long getApplicationUserUid() {
		return applicationUserUid;
	}
	public void setApplicationUserUid(long applicationUserUid) {
		this.applicationUserUid = applicationUserUid;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
