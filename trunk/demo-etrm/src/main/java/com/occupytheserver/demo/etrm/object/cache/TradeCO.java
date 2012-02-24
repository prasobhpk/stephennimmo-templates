package com.occupytheserver.demo.etrm.object.cache;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class TradeCO extends AbstractCO {
	
	private long tradeId;
	
	@Override
	public void readData(DataInput in) throws IOException {
		tradeId = in.readLong();
	}
	
	@Override
	public void writeData(DataOutput out) throws IOException {
		out.writeLong(tradeId);	
	}

}
