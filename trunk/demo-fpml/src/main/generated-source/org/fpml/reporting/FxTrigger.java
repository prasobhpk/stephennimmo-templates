//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an FX trigger condition.
 * 
 * <p>Java class for FxTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="triggerCondition" type="{http://www.fpml.org/FpML-5/reporting}TriggerConditionEnum" minOccurs="0"/>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/reporting}QuotedCurrencyPair" minOccurs="0"/>
 *         &lt;element name="triggerRate" type="{http://www.fpml.org/FpML-5/reporting}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="spotRate" type="{http://www.fpml.org/FpML-5/reporting}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="informationSource" type="{http://www.fpml.org/FpML-5/reporting}InformationSource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTrigger", propOrder = {
    "triggerCondition",
    "quotedCurrencyPair",
    "triggerRate",
    "spotRate",
    "informationSource"
})
public class FxTrigger
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected TriggerConditionEnum triggerCondition;
    protected QuotedCurrencyPair quotedCurrencyPair;
    protected BigDecimal triggerRate;
    protected BigDecimal spotRate;
    protected List<InformationSource> informationSource;

    /**
     * Gets the value of the triggerCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditionEnum }
     *     
     */
    public TriggerConditionEnum getTriggerCondition() {
        return triggerCondition;
    }

    /**
     * Sets the value of the triggerCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditionEnum }
     *     
     */
    public void setTriggerCondition(TriggerConditionEnum value) {
        this.triggerCondition = value;
    }

    /**
     * Gets the value of the quotedCurrencyPair property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public QuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    /**
     * Sets the value of the quotedCurrencyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public void setQuotedCurrencyPair(QuotedCurrencyPair value) {
        this.quotedCurrencyPair = value;
    }

    /**
     * Gets the value of the triggerRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTriggerRate() {
        return triggerRate;
    }

    /**
     * Sets the value of the triggerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTriggerRate(BigDecimal value) {
        this.triggerRate = value;
    }

    /**
     * Gets the value of the spotRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpotRate() {
        return spotRate;
    }

    /**
     * Sets the value of the spotRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpotRate(BigDecimal value) {
        this.spotRate = value;
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationSource }
     * 
     * 
     */
    public List<InformationSource> getInformationSource() {
        if (informationSource == null) {
            informationSource = new ArrayList<InformationSource>();
        }
        return this.informationSource;
    }

}
