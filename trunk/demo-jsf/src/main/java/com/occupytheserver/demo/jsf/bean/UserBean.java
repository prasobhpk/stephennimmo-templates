package com.occupytheserver.demo.jsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.occupytheserver.demo.jpa.object.User;
import com.occupytheserver.demo.jpa.repository.UserRepository;

@ManagedBean
@SessionScoped
@Component
public class UserBean extends AbstractBean {
	
	@Autowired UserRepository userRepository;
	
	private String searchFirstName;
	
	private List<User> users = new ArrayList<>();
	private User selectedUser;
	
	private Long userUid;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	
	public void searchUsers(){
		List<User> searchResults = userRepository.search(searchFirstName);
		users = searchResults;
	}
	
	public void saveUser(){
		User newUser = new User();
		newUser.setUserName(userName);
		newUser.setPassword(password);
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser = userRepository.save(newUser);
		users.add(newUser);
		clearEditForm();
		addInfoMessage("User Successfully Added", newUser.getLastName());
	}

	public List<User> getUsers() {
		if (users == null || users.size() == 0){
			users = userRepository.findAll();
		}
		return users;
	}
	
	private void clearEditForm(){
		userUid = null;
		userName = null;
		password = null;
		firstName = null;
		lastName = null;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public String getSearchFirstName() {
		return searchFirstName;
	}
	public void setSearchFirstName(String searchFirstName) {
		this.searchFirstName = searchFirstName;
	}
	public User getSelectedUser() {
		return selectedUser;
	}
	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
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
	public Long getUserUid() {
		return userUid;
	}
	public void setUserUid(Long userUid) {
		this.userUid = userUid;
	}
	

}
