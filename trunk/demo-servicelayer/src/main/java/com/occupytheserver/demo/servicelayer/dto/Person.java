package com.occupytheserver.demo.servicelayer.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Person implements Serializable {

	private static final long serialVersionUID = 7551571505080242075L;
	
	private Long personId;
	private String firstName;
	private String lastName;
	private Set<Job> jobs = new HashSet<Job>();
	
	public Person() {}
	
	public Person(Long personId, String firstName, String lastName) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Set<Job> getJobs() {
		return jobs;
	}
	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}
	
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
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
