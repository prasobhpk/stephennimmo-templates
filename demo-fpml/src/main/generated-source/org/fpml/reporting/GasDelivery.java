//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The specification of the gas to be delivered.
 * 
 * <p>Java class for GasDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}CommodityDeliveryPoints.model"/>
 *         &lt;element name="deliveryType" type="{http://www.fpml.org/FpML-5/reporting}DeliveryTypeEnum" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="buyerHub" type="{http://www.fpml.org/FpML-5/reporting}CommodityHub" minOccurs="0"/>
 *           &lt;element name="sellerHub" type="{http://www.fpml.org/FpML-5/reporting}CommodityHub" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasDelivery", propOrder = {
    "deliveryPoint",
    "entryPoint",
    "withdrawalPoint",
    "deliveryType",
    "buyerHub",
    "sellerHub"
})
public class GasDelivery
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected GasDeliveryPoint deliveryPoint;
    protected CommodityDeliveryPoint entryPoint;
    protected CommodityDeliveryPoint withdrawalPoint;
    protected DeliveryTypeEnum deliveryType;
    protected CommodityHub buyerHub;
    protected CommodityHub sellerHub;

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GasDeliveryPoint }
     *     
     */
    public GasDeliveryPoint getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasDeliveryPoint }
     *     
     */
    public void setDeliveryPoint(GasDeliveryPoint value) {
        this.deliveryPoint = value;
    }

    /**
     * Gets the value of the entryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public CommodityDeliveryPoint getEntryPoint() {
        return entryPoint;
    }

    /**
     * Sets the value of the entryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public void setEntryPoint(CommodityDeliveryPoint value) {
        this.entryPoint = value;
    }

    /**
     * Gets the value of the withdrawalPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public CommodityDeliveryPoint getWithdrawalPoint() {
        return withdrawalPoint;
    }

    /**
     * Sets the value of the withdrawalPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public void setWithdrawalPoint(CommodityDeliveryPoint value) {
        this.withdrawalPoint = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTypeEnum }
     *     
     */
    public DeliveryTypeEnum getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTypeEnum }
     *     
     */
    public void setDeliveryType(DeliveryTypeEnum value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the buyerHub property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityHub }
     *     
     */
    public CommodityHub getBuyerHub() {
        return buyerHub;
    }

    /**
     * Sets the value of the buyerHub property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityHub }
     *     
     */
    public void setBuyerHub(CommodityHub value) {
        this.buyerHub = value;
    }

    /**
     * Gets the value of the sellerHub property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityHub }
     *     
     */
    public CommodityHub getSellerHub() {
        return sellerHub;
    }

    /**
     * Sets the value of the sellerHub property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityHub }
     *     
     */
    public void setSellerHub(CommodityHub value) {
        this.sellerHub = value;
    }

}
