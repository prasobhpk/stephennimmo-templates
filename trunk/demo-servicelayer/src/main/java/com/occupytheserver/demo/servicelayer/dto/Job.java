package com.occupytheserver.demo.servicelayer.dto;

import java.io.Serializable;

public class Job implements Serializable {
	
	Long jobId;
	Person person;
	String jobName;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}
	
	public Job(Long jobId, String jobName) {
		this.jobId = jobId;
		this.jobName = jobName;
	}
	
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	

}
