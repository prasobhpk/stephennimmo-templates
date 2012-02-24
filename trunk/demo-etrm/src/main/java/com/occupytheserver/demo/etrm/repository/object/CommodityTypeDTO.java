package com.occupytheserver.demo.etrm.repository.object;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMMODITY_TYPE")
public class CommodityTypeDTO implements Serializable {
	
	@Id
	private String commodityTypeId;
	private String commodityTypeName;
	
	public String getCommodityTypeId() {
		return commodityTypeId;
	}
	public void setCommodityTypeId(String commodityTypeId) {
		this.commodityTypeId = commodityTypeId;
	}
	public String getCommodityTypeName() {
		return commodityTypeName;
	}
	public void setCommodityTypeName(String commodityTypeName) {
		this.commodityTypeName = commodityTypeName;
	}
}
