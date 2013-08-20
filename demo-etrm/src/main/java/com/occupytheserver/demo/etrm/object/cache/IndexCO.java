package com.occupytheserver.demo.etrm.object.cache;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.math.BigDecimal;

public class IndexCO extends AbstractCO {
	
	private String indexId;
	private BigDecimal value;

	@Override
	public void readData(DataInput in) throws IOException {
		indexId = in.readUTF();
		value = BigDecimal.valueOf(in.readFloat());
	}

	@Override
	public void writeData(DataOutput out) throws IOException {
		out.writeUTF(indexId);
		out.writeFloat(value.floatValue());
	}

	
	public String getIndexId() {
		return indexId;
	}
	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
