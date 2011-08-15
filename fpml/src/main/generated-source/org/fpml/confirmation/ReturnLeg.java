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
 * A type describing the return leg of a return type swap.
 * 
 * <p>Java class for ReturnLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}ReturnSwapLegUnderlyer">
 *       &lt;sequence>
 *         &lt;element name="rateOfReturn" type="{http://www.fpml.org/FpML-5/confirmation}ReturnLegValuation"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/confirmation}ReturnSwapNotional"/>
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/confirmation}ReturnSwapAmount"/>
 *         &lt;element name="return" type="{http://www.fpml.org/FpML-5/confirmation}Return"/>
 *         &lt;element name="notionalAdjustments" type="{http://www.fpml.org/FpML-5/confirmation}NotionalAdjustmentEnum"/>
 *         &lt;element name="fxFeature" type="{http://www.fpml.org/FpML-5/confirmation}FxFeature" minOccurs="0"/>
 *         &lt;element name="averagingDates" type="{http://www.fpml.org/FpML-5/confirmation}AveragingPeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnLeg", propOrder = {
    "rateOfReturn",
    "notional",
    "amount",
    "_return",
    "notionalAdjustments",
    "fxFeature",
    "averagingDates"
})
public class ReturnLeg
    extends ReturnSwapLegUnderlyer
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ReturnLegValuation rateOfReturn;
    @XmlElement(required = true)
    protected ReturnSwapNotional notional;
    @XmlElement(required = true)
    protected ReturnSwapAmount amount;
    @XmlElement(name = "return", required = true)
    protected Return _return;
    @XmlElement(required = true)
    protected NotionalAdjustmentEnum notionalAdjustments;
    protected FxFeature fxFeature;
    protected AveragingPeriod averagingDates;

    /**
     * Gets the value of the rateOfReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLegValuation }
     *     
     */
    public ReturnLegValuation getRateOfReturn() {
        return rateOfReturn;
    }

    /**
     * Sets the value of the rateOfReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLegValuation }
     *     
     */
    public void setRateOfReturn(ReturnLegValuation value) {
        this.rateOfReturn = value;
    }

    /**
     * Gets the value of the notional property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSwapNotional }
     *     
     */
    public ReturnSwapNotional getNotional() {
        return notional;
    }

    /**
     * Sets the value of the notional property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSwapNotional }
     *     
     */
    public void setNotional(ReturnSwapNotional value) {
        this.notional = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSwapAmount }
     *     
     */
    public ReturnSwapAmount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSwapAmount }
     *     
     */
    public void setAmount(ReturnSwapAmount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Return }
     *     
     */
    public Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Return }
     *     
     */
    public void setReturn(Return value) {
        this._return = value;
    }

    /**
     * Gets the value of the notionalAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAdjustmentEnum }
     *     
     */
    public NotionalAdjustmentEnum getNotionalAdjustments() {
        return notionalAdjustments;
    }

    /**
     * Sets the value of the notionalAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAdjustmentEnum }
     *     
     */
    public void setNotionalAdjustments(NotionalAdjustmentEnum value) {
        this.notionalAdjustments = value;
    }

    /**
     * Gets the value of the fxFeature property.
     * 
     * @return
     *     possible object is
     *     {@link FxFeature }
     *     
     */
    public FxFeature getFxFeature() {
        return fxFeature;
    }

    /**
     * Sets the value of the fxFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxFeature }
     *     
     */
    public void setFxFeature(FxFeature value) {
        this.fxFeature = value;
    }

    /**
     * Gets the value of the averagingDates property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingPeriod }
     *     
     */
    public AveragingPeriod getAveragingDates() {
        return averagingDates;
    }

    /**
     * Sets the value of the averagingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingPeriod }
     *     
     */
    public void setAveragingDates(AveragingPeriod value) {
        this.averagingDates = value;
    }

}
