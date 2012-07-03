package com.dfacrs.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="TRADE")
public class Trade extends AbstractDomainObject {
	
	private static final long serialVersionUID = 3400081890269639746L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRADE_UID")
	private Long tradeUid;
	
	@Column(name = "TRADE_ID")
	private String tradeId;
	
	@Column(name = "SOURCE_SYSTEM")
	private String sourceSystem;
	
	@Column(name = "DESTINATION")
	private Destination destination;

	@Column(name = "USI")
	private String usi;

	public Long getTradeUid() {
		return tradeUid;
	}
	public void setTradeUid(Long tradeUid) {
		this.tradeUid = tradeUid;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public String getUsi() {
		return usi;
	}
	public void setUsi(String usi) {
		this.usi = usi;
	}
	

}
