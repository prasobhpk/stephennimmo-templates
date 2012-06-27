package com.codemkr.etrm.object;

public enum AssetClass {

	CRUDE ("Crude");
	
	private String value;
	
	private AssetClass(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
