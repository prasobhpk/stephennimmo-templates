package com.codemkr.etrm.object;

public class Trade extends AbstractDomainObject {
	
	private static final long serialVersionUID = -2062160938269110010L;

	private Long tradeUid;
	private Product product;
	private String comments;

	public Long getTradeUid() {
		return tradeUid;
	}
	public void setTradeUid(Long tradeUid) {
		this.tradeUid = tradeUid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

}
