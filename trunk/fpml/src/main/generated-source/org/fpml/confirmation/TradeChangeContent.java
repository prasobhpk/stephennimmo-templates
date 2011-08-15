//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure describing a non-negotiated trade resulting from a market event.
 * 
 * <p>Java class for TradeChangeContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeChangeContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="oldTradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}PartyTradeIdentifier"/>
 *           &lt;element name="oldTrade" type="{http://www.fpml.org/FpML-5/confirmation}Trade"/>
 *         &lt;/choice>
 *         &lt;element name="trade" type="{http://www.fpml.org/FpML-5/confirmation}Trade"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}changeEvent"/>
 *         &lt;element name="payment" type="{http://www.fpml.org/FpML-5/confirmation}Payment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeChangeContent", propOrder = {
    "oldTradeIdentifier",
    "oldTrade",
    "trade",
    "effectiveDate",
    "changeEvent",
    "payment"
})
public class TradeChangeContent
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PartyTradeIdentifier oldTradeIdentifier;
    protected Trade oldTrade;
    @XmlElement(required = true)
    protected Trade trade;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElementRef(name = "changeEvent", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class)
    protected JAXBElement<? extends ChangeEvent> changeEvent;
    protected Payment payment;

    /**
     * Gets the value of the oldTradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public PartyTradeIdentifier getOldTradeIdentifier() {
        return oldTradeIdentifier;
    }

    /**
     * Sets the value of the oldTradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public void setOldTradeIdentifier(PartyTradeIdentifier value) {
        this.oldTradeIdentifier = value;
    }

    /**
     * Gets the value of the oldTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getOldTrade() {
        return oldTrade;
    }

    /**
     * Sets the value of the oldTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setOldTrade(Trade value) {
        this.oldTrade = value;
    }

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setTrade(Trade value) {
        this.trade = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Substitution point for types of change
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeEvent }{@code >}
     *     
     */
    public JAXBElement<? extends ChangeEvent> getChangeEvent() {
        return changeEvent;
    }

    /**
     * Sets the value of the changeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeEvent }{@code >}
     *     
     */
    public void setChangeEvent(JAXBElement<? extends ChangeEvent> value) {
        this.changeEvent = ((JAXBElement<? extends ChangeEvent> ) value);
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

}
