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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FxSwapLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxSwapLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Leg">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FxCoreDetails.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxSwapLeg", propOrder = {
    "exchangedCurrency1",
    "exchangedCurrency2",
    "dealtCurrency",
    "valueDate",
    "currency1ValueDate",
    "currency2ValueDate",
    "exchangeRate",
    "nonDeliverableSettlement"
})
public class FxSwapLeg
    extends Leg
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Payment exchangedCurrency1;
    @XmlElement(required = true)
    protected Payment exchangedCurrency2;
    protected DealtCurrencyEnum dealtCurrency;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currency1ValueDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currency2ValueDate;
    @XmlElement(required = true)
    protected ExchangeRate exchangeRate;
    protected FxCashSettlement nonDeliverableSettlement;

    /**
     * Gets the value of the exchangedCurrency1 property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getExchangedCurrency1() {
        return exchangedCurrency1;
    }

    /**
     * Sets the value of the exchangedCurrency1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setExchangedCurrency1(Payment value) {
        this.exchangedCurrency1 = value;
    }

    /**
     * Gets the value of the exchangedCurrency2 property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getExchangedCurrency2() {
        return exchangedCurrency2;
    }

    /**
     * Sets the value of the exchangedCurrency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setExchangedCurrency2(Payment value) {
        this.exchangedCurrency2 = value;
    }

    /**
     * Gets the value of the dealtCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link DealtCurrencyEnum }
     *     
     */
    public DealtCurrencyEnum getDealtCurrency() {
        return dealtCurrency;
    }

    /**
     * Sets the value of the dealtCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealtCurrencyEnum }
     *     
     */
    public void setDealtCurrency(DealtCurrencyEnum value) {
        this.dealtCurrency = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the currency1ValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrency1ValueDate() {
        return currency1ValueDate;
    }

    /**
     * Sets the value of the currency1ValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrency1ValueDate(XMLGregorianCalendar value) {
        this.currency1ValueDate = value;
    }

    /**
     * Gets the value of the currency2ValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrency2ValueDate() {
        return currency2ValueDate;
    }

    /**
     * Sets the value of the currency2ValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrency2ValueDate(XMLGregorianCalendar value) {
        this.currency2ValueDate = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRate }
     *     
     */
    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRate }
     *     
     */
    public void setExchangeRate(ExchangeRate value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the nonDeliverableSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link FxCashSettlement }
     *     
     */
    public FxCashSettlement getNonDeliverableSettlement() {
        return nonDeliverableSettlement;
    }

    /**
     * Sets the value of the nonDeliverableSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxCashSettlement }
     *     
     */
    public void setNonDeliverableSettlement(FxCashSettlement value) {
        this.nonDeliverableSettlement = value;
    }

}
