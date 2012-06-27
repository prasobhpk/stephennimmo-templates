package com.codemkr.etrm.object;

public class Product extends AbstractDomainObject {

	private static final long serialVersionUID = 2396944488321221088L;
	
	private Long productUid;
	private ProductType productType;
	private Long lotSize;
	private MeasurementUnit lotSizeUnit;
	
	public Long getProductUid() {
		return productUid;
	}
	public void setProductUid(Long productUid) {
		this.productUid = productUid;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Long getLotSize() {
		return lotSize;
	}
	public void setLotSize(Long lotSize) {
		this.lotSize = lotSize;
	}
	public MeasurementUnit getLotSizeUnit() {
		return lotSizeUnit;
	}
	public void setLotSizeUnit(MeasurementUnit lotSizeUnit) {
		this.lotSizeUnit = lotSizeUnit;
	}
	
}
