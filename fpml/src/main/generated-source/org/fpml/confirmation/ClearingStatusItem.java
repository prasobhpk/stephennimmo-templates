//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingStatusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingStatusItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}TradeIdentifier"/>
 *         &lt;element name="clearingStatusValue" type="{http://www.fpml.org/FpML-5/confirmation}clearingStatusValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingStatusItem", propOrder = {
    "tradeIdentifier",
    "clearingStatusValue"
})
public class ClearingStatusItem
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TradeIdentifier tradeIdentifier;
    @XmlElement(required = true)
    protected ClearingStatusValue clearingStatusValue;

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TradeIdentifier }
     *     
     */
    public TradeIdentifier getTradeIdentifier() {
        return tradeIdentifier;
    }

    /**
     * Sets the value of the tradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeIdentifier }
     *     
     */
    public void setTradeIdentifier(TradeIdentifier value) {
        this.tradeIdentifier = value;
    }

    /**
     * Gets the value of the clearingStatusValue property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingStatusValue }
     *     
     */
    public ClearingStatusValue getClearingStatusValue() {
        return clearingStatusValue;
    }

    /**
     * Sets the value of the clearingStatusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingStatusValue }
     *     
     */
    public void setClearingStatusValue(ClearingStatusValue value) {
        this.clearingStatusValue = value;
    }

}
