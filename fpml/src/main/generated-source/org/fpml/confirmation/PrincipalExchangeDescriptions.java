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
 * Specifies each of the characteristics of the principal exchange cashflows, in terms of paying/receiving counterparties, amounts and dates.
 * 
 * <p>Java class for PrincipalExchangeDescriptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalExchangeDescriptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}PayerReceiver.model"/>
 *         &lt;element name="principalExchangeAmount" type="{http://www.fpml.org/FpML-5/confirmation}PrincipalExchangeAmount"/>
 *         &lt;element name="principalExchangeDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalExchangeDescriptions", propOrder = {
    "payerPartyReference",
    "payerAccountReference",
    "receiverPartyReference",
    "receiverAccountReference",
    "principalExchangeAmount",
    "principalExchangeDate"
})
public class PrincipalExchangeDescriptions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PartyReference payerPartyReference;
    protected AccountReference payerAccountReference;
    @XmlElement(required = true)
    protected PartyReference receiverPartyReference;
    protected AccountReference receiverAccountReference;
    @XmlElement(required = true)
    protected PrincipalExchangeAmount principalExchangeAmount;
    protected AdjustableOrRelativeDate principalExchangeDate;

    /**
     * Gets the value of the payerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPayerPartyReference() {
        return payerPartyReference;
    }

    /**
     * Sets the value of the payerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPayerPartyReference(PartyReference value) {
        this.payerPartyReference = value;
    }

    /**
     * Gets the value of the payerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getPayerAccountReference() {
        return payerAccountReference;
    }

    /**
     * Sets the value of the payerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setPayerAccountReference(AccountReference value) {
        this.payerAccountReference = value;
    }

    /**
     * Gets the value of the receiverPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getReceiverPartyReference() {
        return receiverPartyReference;
    }

    /**
     * Sets the value of the receiverPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setReceiverPartyReference(PartyReference value) {
        this.receiverPartyReference = value;
    }

    /**
     * Gets the value of the receiverAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getReceiverAccountReference() {
        return receiverAccountReference;
    }

    /**
     * Sets the value of the receiverAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setReceiverAccountReference(AccountReference value) {
        this.receiverAccountReference = value;
    }

    /**
     * Gets the value of the principalExchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalExchangeAmount }
     *     
     */
    public PrincipalExchangeAmount getPrincipalExchangeAmount() {
        return principalExchangeAmount;
    }

    /**
     * Sets the value of the principalExchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalExchangeAmount }
     *     
     */
    public void setPrincipalExchangeAmount(PrincipalExchangeAmount value) {
        this.principalExchangeAmount = value;
    }

    /**
     * Gets the value of the principalExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getPrincipalExchangeDate() {
        return principalExchangeDate;
    }

    /**
     * Sets the value of the principalExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setPrincipalExchangeDate(AdjustableOrRelativeDate value) {
        this.principalExchangeDate = value;
    }

}