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
 * A type for defining ISDA 2002 Equity Derivative Additional Disruption Events.
 * 
 * <p>Java class for AdditionalDisruptionEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDisruptionEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeInLaw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="failureToDeliver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insolvencyFiling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hedgingDisruption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lossOfStockBorrow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maximumStockLoanRate" type="{http://www.fpml.org/FpML-5/reporting}RestrictedPercentage" minOccurs="0"/>
 *         &lt;element name="increasedCostOfStockBorrow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="initialStockLoanRate" type="{http://www.fpml.org/FpML-5/reporting}RestrictedPercentage" minOccurs="0"/>
 *         &lt;element name="increasedCostOfHedging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="determiningPartyReference" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *         &lt;element name="foreignOwnershipEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDisruptionEvents", propOrder = {
    "changeInLaw",
    "failureToDeliver",
    "insolvencyFiling",
    "hedgingDisruption",
    "lossOfStockBorrow",
    "maximumStockLoanRate",
    "increasedCostOfStockBorrow",
    "initialStockLoanRate",
    "increasedCostOfHedging",
    "determiningPartyReference",
    "foreignOwnershipEvent"
})
public class AdditionalDisruptionEvents
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean changeInLaw;
    protected Boolean failureToDeliver;
    protected Boolean insolvencyFiling;
    protected Boolean hedgingDisruption;
    protected Boolean lossOfStockBorrow;
    protected BigDecimal maximumStockLoanRate;
    protected Boolean increasedCostOfStockBorrow;
    protected BigDecimal initialStockLoanRate;
    protected Boolean increasedCostOfHedging;
    protected PartyReference determiningPartyReference;
    protected Boolean foreignOwnershipEvent;

    /**
     * Gets the value of the changeInLaw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeInLaw() {
        return changeInLaw;
    }

    /**
     * Sets the value of the changeInLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeInLaw(Boolean value) {
        this.changeInLaw = value;
    }

    /**
     * Gets the value of the failureToDeliver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureToDeliver() {
        return failureToDeliver;
    }

    /**
     * Sets the value of the failureToDeliver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureToDeliver(Boolean value) {
        this.failureToDeliver = value;
    }

    /**
     * Gets the value of the insolvencyFiling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsolvencyFiling() {
        return insolvencyFiling;
    }

    /**
     * Sets the value of the insolvencyFiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsolvencyFiling(Boolean value) {
        this.insolvencyFiling = value;
    }

    /**
     * Gets the value of the hedgingDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHedgingDisruption() {
        return hedgingDisruption;
    }

    /**
     * Sets the value of the hedgingDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHedgingDisruption(Boolean value) {
        this.hedgingDisruption = value;
    }

    /**
     * Gets the value of the lossOfStockBorrow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLossOfStockBorrow() {
        return lossOfStockBorrow;
    }

    /**
     * Sets the value of the lossOfStockBorrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLossOfStockBorrow(Boolean value) {
        this.lossOfStockBorrow = value;
    }

    /**
     * Gets the value of the maximumStockLoanRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumStockLoanRate() {
        return maximumStockLoanRate;
    }

    /**
     * Sets the value of the maximumStockLoanRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumStockLoanRate(BigDecimal value) {
        this.maximumStockLoanRate = value;
    }

    /**
     * Gets the value of the increasedCostOfStockBorrow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncreasedCostOfStockBorrow() {
        return increasedCostOfStockBorrow;
    }

    /**
     * Sets the value of the increasedCostOfStockBorrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncreasedCostOfStockBorrow(Boolean value) {
        this.increasedCostOfStockBorrow = value;
    }

    /**
     * Gets the value of the initialStockLoanRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialStockLoanRate() {
        return initialStockLoanRate;
    }

    /**
     * Sets the value of the initialStockLoanRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialStockLoanRate(BigDecimal value) {
        this.initialStockLoanRate = value;
    }

    /**
     * Gets the value of the increasedCostOfHedging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncreasedCostOfHedging() {
        return increasedCostOfHedging;
    }

    /**
     * Sets the value of the increasedCostOfHedging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncreasedCostOfHedging(Boolean value) {
        this.increasedCostOfHedging = value;
    }

    /**
     * Gets the value of the determiningPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getDeterminingPartyReference() {
        return determiningPartyReference;
    }

    /**
     * Sets the value of the determiningPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setDeterminingPartyReference(PartyReference value) {
        this.determiningPartyReference = value;
    }

    /**
     * Gets the value of the foreignOwnershipEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForeignOwnershipEvent() {
        return foreignOwnershipEvent;
    }

    /**
     * Sets the value of the foreignOwnershipEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForeignOwnershipEvent(Boolean value) {
        this.foreignOwnershipEvent = value;
    }

}
