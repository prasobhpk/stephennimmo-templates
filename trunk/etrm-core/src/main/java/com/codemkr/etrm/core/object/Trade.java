package com.codemkr.etrm.core.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="TRADE")
public class Trade extends AbstractDomainObject {
	
	private static final long serialVersionUID = -2062160938269110010L;

	@Id
	@Column(name="TRADE_UID")
	private Long tradeUid;
	
	@Column(name="COMMENTS")
	private String comments;

	public Long getTradeUid() {
		return tradeUid;
	}
	public void setTradeUid(Long tradeUid) {
		this.tradeUid = tradeUid;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

}
