package com.dfacrs.service.ice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import org.joda.time.DateTime;

@XmlRootElement(name="Response")
public class AuthResponse {
	
	private String status;
	private String code;
	private String type;
	private String description;
	private DateTime statusDate;
	
	public String getStatus() {
		return status;
	}
	@XmlElement(name="Status")
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	@XmlElements(@XmlElement(name="Code"))
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	@XmlElement(name="Type")
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	@XmlElement(name="Description")
	public void setDescription(String description) {
		this.description = description;
	}
	public DateTime getStatusDate() {
		return statusDate;
	}
	@XmlElement(name="StatusDate")
	public void setStatusDate(DateTime statusDate) {
		this.statusDate = statusDate;
	}

}
