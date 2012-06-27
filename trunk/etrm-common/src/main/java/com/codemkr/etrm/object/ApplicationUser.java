package com.codemkr.etrm.object;

public class ApplicationUser extends AbstractDomainObject {

	private static final long serialVersionUID = -7666394574571962335L;
	
	private long applicationUserUid;
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	
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
