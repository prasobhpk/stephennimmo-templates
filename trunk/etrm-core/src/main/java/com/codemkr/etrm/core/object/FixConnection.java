package com.codemkr.etrm.core.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="FIX_CONNECTION")
public class FixConnection extends AbstractDomainObject {
	
	private static final long serialVersionUID = -7370077416843059238L;
	
	@Id
	@Column(name="FIX_CONNECTION_UID")
	private Long fixConnectionUid;
	
	@Column(name="CONNECTION_TYPE")
	private String connectionType;
	
	@Column(name="FIX_VERSION")
	private String fixVersion;
	
	@Column(name="SENDER_COMP_ID")
	private String senderCompId;
	
	@Column(name="TARGET_COMP_ID")
	private String targetCompId;
	
	@Column(name="ACCEPT_ADDRESS")
	private String acceptAddress;
	
	@Column(name="PORT")
	private Long port;
	
	@Column(name="HEARTBEAT_INTERVAL")
	private Long heartbeatInterval;
	
	@Column(name="RECONNECT_INTERVAL")
	private Long reconnectInterval;
	
	@Transient
	private Status status;
	
	public Long getFixConnectionUid() {
		return fixConnectionUid;
	}
	public void setFixConnectionUid(Long fixConnectionUid) {
		this.fixConnectionUid = fixConnectionUid;
	}
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public String getFixVersion() {
		return fixVersion;
	}
	public void setFixVersion(String fixVersion) {
		this.fixVersion = fixVersion;
	}
	public String getSenderCompId() {
		return senderCompId;
	}
	public void setSenderCompId(String senderCompId) {
		this.senderCompId = senderCompId;
	}
	public String getTargetCompId() {
		return targetCompId;
	}
	public void setTargetCompId(String targetCompId) {
		this.targetCompId = targetCompId;
	}
	public String getAcceptAddress() {
		return acceptAddress;
	}
	public void setAcceptAddress(String acceptAddress) {
		this.acceptAddress = acceptAddress;
	}
	public Long getPort() {
		return port;
	} 
	public void setPort(Long port) {
		this.port = port;
	}
	public Long getHeartbeatInterval() {
		return heartbeatInterval;
	}
	public void setHeartbeatInterval(Long heartbeatInterval) {
		this.heartbeatInterval = heartbeatInterval;
	}
	public Long getReconnectInterval() {
		return reconnectInterval;
	}
	public void setReconnectInterval(Long reconnectInterval) {
		this.reconnectInterval = reconnectInterval;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
