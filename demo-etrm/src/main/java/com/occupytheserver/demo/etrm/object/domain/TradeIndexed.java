package com.occupytheserver.demo.etrm.object.domain;

import java.math.BigDecimal;

public class TradeIndexed extends AbstractDomainObject implements Trade {
	
	private int tradeId;
	private Side side;
	private Index index;
	private BigDecimal quantity;
	
	public TradeIndexed(int tradeId, Side side, Index index, BigDecimal quantity) {
		this.tradeId = tradeId;
		this.side = side;
		this.index = index;
		this.quantity = quantity;
	}
	
	@Override
	public BigDecimal getTradeValue() {
		return quantity.multiply(index.getValue());
	}

	@Override
	public int getTradeId() {
		return tradeId;
	}
	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public Index getIndex() {
		return index;
	}
	public void setIndex(Index index) {
		this.index = index;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
}
