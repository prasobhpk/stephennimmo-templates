//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type defining a principal exchange amount and adjusted exchange date. The type forms part of the cashflow representation of a swap stream.
 * 
 * <p>Java class for PrincipalExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalExchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unadjustedPrincipalExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="adjustedPrincipalExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="principalExchangeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="discountFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="presentValuePrincipalExchangeAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalExchange", propOrder = {
    "unadjustedPrincipalExchangeDate",
    "adjustedPrincipalExchangeDate",
    "principalExchangeAmount",
    "discountFactor",
    "presentValuePrincipalExchangeAmount"
})
public class PrincipalExchange
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar unadjustedPrincipalExchangeDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adjustedPrincipalExchangeDate;
    protected BigDecimal principalExchangeAmount;
    protected BigDecimal discountFactor;
    protected Money presentValuePrincipalExchangeAmount;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the unadjustedPrincipalExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnadjustedPrincipalExchangeDate() {
        return unadjustedPrincipalExchangeDate;
    }

    /**
     * Sets the value of the unadjustedPrincipalExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnadjustedPrincipalExchangeDate(XMLGregorianCalendar value) {
        this.unadjustedPrincipalExchangeDate = value;
    }

    /**
     * Gets the value of the adjustedPrincipalExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustedPrincipalExchangeDate() {
        return adjustedPrincipalExchangeDate;
    }

    /**
     * Sets the value of the adjustedPrincipalExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustedPrincipalExchangeDate(XMLGregorianCalendar value) {
        this.adjustedPrincipalExchangeDate = value;
    }

    /**
     * Gets the value of the principalExchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipalExchangeAmount() {
        return principalExchangeAmount;
    }

    /**
     * Sets the value of the principalExchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipalExchangeAmount(BigDecimal value) {
        this.principalExchangeAmount = value;
    }

    /**
     * Gets the value of the discountFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountFactor() {
        return discountFactor;
    }

    /**
     * Sets the value of the discountFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountFactor(BigDecimal value) {
        this.discountFactor = value;
    }

    /**
     * Gets the value of the presentValuePrincipalExchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPresentValuePrincipalExchangeAmount() {
        return presentValuePrincipalExchangeAmount;
    }

    /**
     * Sets the value of the presentValuePrincipalExchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPresentValuePrincipalExchangeAmount(Money value) {
        this.presentValuePrincipalExchangeAmount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
