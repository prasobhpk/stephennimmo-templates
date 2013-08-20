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
 * <p>Java class for VarianceOptionTransactionSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarianceOptionTransactionSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}OptionBase">
 *       &lt;sequence>
 *         &lt;element name="equityPremium" type="{http://www.fpml.org/FpML-5/confirmation}EquityPremium"/>
 *         &lt;element name="equityExercise" type="{http://www.fpml.org/FpML-5/confirmation}EquityExerciseValuationSettlement"/>
 *         &lt;element name="exchangeLookAlike" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="methodOfAdjustment" type="{http://www.fpml.org/FpML-5/confirmation}MethodOfAdjustmentEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="optionEntitlement" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal"/>
 *           &lt;element name="multiplier" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}varianceSwapTransactionSupplement"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VarianceOptionTransactionSupplement", propOrder = {
    "equityPremium",
    "equityExercise",
    "exchangeLookAlike",
    "methodOfAdjustment",
    "optionEntitlement",
    "multiplier",
    "varianceSwapTransactionSupplement"
})
public class VarianceOptionTransactionSupplement
    extends OptionBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected EquityPremium equityPremium;
    @XmlElement(required = true)
    protected EquityExerciseValuationSettlement equityExercise;
    protected Boolean exchangeLookAlike;
    protected MethodOfAdjustmentEnum methodOfAdjustment;
    protected BigDecimal optionEntitlement;
    protected BigDecimal multiplier;
    @XmlElement(required = true)
    protected VarianceSwapTransactionSupplement varianceSwapTransactionSupplement;

    /**
     * Gets the value of the equityPremium property.
     * 
     * @return
     *     possible object is
     *     {@link EquityPremium }
     *     
     */
    public EquityPremium getEquityPremium() {
        return equityPremium;
    }

    /**
     * Sets the value of the equityPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityPremium }
     *     
     */
    public void setEquityPremium(EquityPremium value) {
        this.equityPremium = value;
    }

    /**
     * Gets the value of the equityExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityExerciseValuationSettlement }
     *     
     */
    public EquityExerciseValuationSettlement getEquityExercise() {
        return equityExercise;
    }

    /**
     * Sets the value of the equityExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityExerciseValuationSettlement }
     *     
     */
    public void setEquityExercise(EquityExerciseValuationSettlement value) {
        this.equityExercise = value;
    }

    /**
     * Gets the value of the exchangeLookAlike property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchangeLookAlike() {
        return exchangeLookAlike;
    }

    /**
     * Sets the value of the exchangeLookAlike property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchangeLookAlike(Boolean value) {
        this.exchangeLookAlike = value;
    }

    /**
     * Gets the value of the methodOfAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link MethodOfAdjustmentEnum }
     *     
     */
    public MethodOfAdjustmentEnum getMethodOfAdjustment() {
        return methodOfAdjustment;
    }

    /**
     * Sets the value of the methodOfAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodOfAdjustmentEnum }
     *     
     */
    public void setMethodOfAdjustment(MethodOfAdjustmentEnum value) {
        this.methodOfAdjustment = value;
    }

    /**
     * Gets the value of the optionEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOptionEntitlement() {
        return optionEntitlement;
    }

    /**
     * Sets the value of the optionEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOptionEntitlement(BigDecimal value) {
        this.optionEntitlement = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

    /**
     * The variance swap details.
     * 
     * @return
     *     possible object is
     *     {@link VarianceSwapTransactionSupplement }
     *     
     */
    public VarianceSwapTransactionSupplement getVarianceSwapTransactionSupplement() {
        return varianceSwapTransactionSupplement;
    }

    /**
     * Sets the value of the varianceSwapTransactionSupplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarianceSwapTransactionSupplement }
     *     
     */
    public void setVarianceSwapTransactionSupplement(VarianceSwapTransactionSupplement value) {
        this.varianceSwapTransactionSupplement = value;
    }

}
