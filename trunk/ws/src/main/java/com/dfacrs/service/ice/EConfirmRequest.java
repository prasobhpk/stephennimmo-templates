package com.dfacrs.service.ice;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class EConfirmRequest {
	
	private String batchId;
	private EConfirmTrade eConfirmTrade = new EConfirmTrade();
	
	public String getBatchId() {
		return batchId;
	}
	@XmlAttribute(name="BatchId")
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public EConfirmTrade geteConfirmTrade() {
		return eConfirmTrade;
	}
	@XmlElement(name="EConfirmTrade")
	public void seteConfirmTrade(EConfirmTrade eConfirmTrade) {
		this.eConfirmTrade = eConfirmTrade;
	}
	
	public class EConfirmTrade {
		
		private String senderTradeRefId;
		
		public String getSenderTradeRefId() {
			return senderTradeRefId;
		}
		@XmlElement(name="SenderTradeRefId")
		public void setSenderTradeRefId(String senderTradeRefId) {
			this.senderTradeRefId = senderTradeRefId;
		}
		
	}
}
