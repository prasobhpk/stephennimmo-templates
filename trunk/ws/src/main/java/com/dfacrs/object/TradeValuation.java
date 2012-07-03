package com.dfacrs.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="TRADE_VALUATION")
public class TradeValuation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRADE_VALUATION_UID")
	private Long tradeValuationUid;
	
	@Column(name = "TRADE_ID")
	private String tradeId;

	public Long getTradeValuationUid() {
		return tradeValuationUid;
	}
	public void setTradeValuationUid(Long tradeValuationUid) {
		this.tradeValuationUid = tradeValuationUid;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	
}
