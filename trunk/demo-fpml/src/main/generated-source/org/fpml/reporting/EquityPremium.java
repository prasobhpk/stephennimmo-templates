//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type used to describe the amount paid for an equity option.
 * 
 * <p>Java class for EquityPremium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityPremium">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}PaymentBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}PayerReceiver.model"/>
 *         &lt;element name="premiumType" type="{http://www.fpml.org/FpML-5/reporting}PremiumTypeEnum" minOccurs="0"/>
 *         &lt;element name="paymentAmount" type="{http://www.fpml.org/FpML-5/reporting}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/reporting}AdjustableDate" minOccurs="0"/>
 *         &lt;element name="swapPremium" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pricePerOption" type="{http://www.fpml.org/FpML-5/reporting}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="percentageOfNotional" type="{http://www.fpml.org/FpML-5/reporting}NonNegativeDecimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityPremium", propOrder = {
    "payerPartyReference",
    "payerAccountReference",
    "receiverPartyReference",
    "receiverAccountReference",
    "premiumType",
    "paymentAmount",
    "paymentDate",
    "swapPremium",
    "pricePerOption",
    "percentageOfNotional"
})
public class EquityPremium
    extends PaymentBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PartyReference payerPartyReference;
    protected AccountReference payerAccountReference;
    protected PartyReference receiverPartyReference;
    protected AccountReference receiverAccountReference;
    protected PremiumTypeEnum premiumType;
    protected NonNegativeMoney paymentAmount;
    protected AdjustableDate paymentDate;
    protected Boolean swapPremium;
    protected NonNegativeMoney pricePerOption;
    protected BigDecimal percentageOfNotional;

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
     * Gets the value of the premiumType property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumTypeEnum }
     *     
     */
    public PremiumTypeEnum getPremiumType() {
        return premiumType;
    }

    /**
     * Sets the value of the premiumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumTypeEnum }
     *     
     */
    public void setPremiumType(PremiumTypeEnum value) {
        this.premiumType = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setPaymentAmount(NonNegativeMoney value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setPaymentDate(AdjustableDate value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the swapPremium property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSwapPremium() {
        return swapPremium;
    }

    /**
     * Sets the value of the swapPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSwapPremium(Boolean value) {
        this.swapPremium = value;
    }

    /**
     * Gets the value of the pricePerOption property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getPricePerOption() {
        return pricePerOption;
    }

    /**
     * Sets the value of the pricePerOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setPricePerOption(NonNegativeMoney value) {
        this.pricePerOption = value;
    }

    /**
     * Gets the value of the percentageOfNotional property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageOfNotional() {
        return percentageOfNotional;
    }

    /**
     * Sets the value of the percentageOfNotional property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageOfNotional(BigDecimal value) {
        this.percentageOfNotional = value;
    }

}