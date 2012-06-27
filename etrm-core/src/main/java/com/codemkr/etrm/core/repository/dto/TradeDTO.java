package com.codemkr.etrm.core.repository.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.codemkr.etrm.object.Trade;

@Entity(name="TRADE")
public class TradeDTO extends AbstractDTO {
	
	private static final long serialVersionUID = 7106448935764841183L;
	
	@Id
	@Column(name = "TRADE_UID")
	private Long tradeUid;
	
	@Column(name = "COMMENTS")
	private String comments;
	
	public TradeDTO() {}
	
	public TradeDTO(Trade trade) {
		this.tradeUid = trade.getTradeUid();
		this.comments = trade.getComments();
	}

	public Trade convertToDomain(){
		Trade domain = new Trade();
		domain.setTradeUid(tradeUid);
		domain.setComments(comments);
		return domain;
	}

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
