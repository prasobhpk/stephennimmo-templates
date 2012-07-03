package com.dfacrs.service.ice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Response")
public class EConfirmResponse {
	
	private String status;
	private String traceId;
	
	public String getStatus() {
		return status;
	}
	@XmlElement(name="Status")
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTraceId() {
		return traceId;
	}
	@XmlElement(name="TraceId")
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
