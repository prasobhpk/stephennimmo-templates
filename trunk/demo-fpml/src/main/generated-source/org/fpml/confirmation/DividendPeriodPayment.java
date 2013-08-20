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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A time bounded dividend period, with fixed strike and a dividend payment date per period.
 * 
 * <p>Java class for DividendPeriodPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendPeriodPayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}DividendPeriod">
 *       &lt;sequence>
 *         &lt;element name="fixedStrike" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal"/>
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDate"/>
 *         &lt;element name="valuationDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendPeriodPayment", propOrder = {
    "fixedStrike",
    "paymentDate",
    "valuationDate"
})
public class DividendPeriodPayment
    extends DividendPeriod
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected BigDecimal fixedStrike;
    @XmlElement(required = true)
    protected AdjustableOrRelativeDate paymentDate;
    protected AdjustableOrRelativeDate valuationDate;

    /**
     * Gets the value of the fixedStrike property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedStrike() {
        return fixedStrike;
    }

    /**
     * Sets the value of the fixedStrike property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedStrike(BigDecimal value) {
        this.fixedStrike = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setPaymentDate(AdjustableOrRelativeDate value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setValuationDate(AdjustableOrRelativeDate value) {
        this.valuationDate = value;
    }

}
