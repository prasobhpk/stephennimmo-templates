//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes an FX touch condition.
 * 
 * <p>Java class for FxTouch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTouch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="touchCondition" type="{http://www.fpml.org/FpML-5/confirmation}TouchConditionEnum"/>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/confirmation}QuotedCurrencyPair"/>
 *         &lt;element name="triggerRate" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal"/>
 *         &lt;element name="spotRate" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="informationSource" type="{http://www.fpml.org/FpML-5/confirmation}InformationSource" maxOccurs="unbounded"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="observationStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="observationEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTouch", propOrder = {
    "touchCondition",
    "quotedCurrencyPair",
    "triggerRate",
    "spotRate",
    "informationSource",
    "observationStartDate",
    "observationEndDate"
})
public class FxTouch
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TouchConditionEnum touchCondition;
    @XmlElement(required = true)
    protected QuotedCurrencyPair quotedCurrencyPair;
    @XmlElement(required = true)
    protected BigDecimal triggerRate;
    protected BigDecimal spotRate;
    @XmlElement(required = true)
    protected List<InformationSource> informationSource;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar observationStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar observationEndDate;

    /**
     * Gets the value of the touchCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TouchConditionEnum }
     *     
     */
    public TouchConditionEnum getTouchCondition() {
        return touchCondition;
    }

    /**
     * Sets the value of the touchCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TouchConditionEnum }
     *     
     */
    public void setTouchCondition(TouchConditionEnum value) {
        this.touchCondition = value;
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

    /**
     * Gets the value of the observationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObservationStartDate() {
        return observationStartDate;
    }

    /**
     * Sets the value of the observationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObservationStartDate(XMLGregorianCalendar value) {
        this.observationStartDate = value;
    }

    /**
     * Gets the value of the observationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObservationEndDate() {
        return observationEndDate;
    }

    /**
     * Sets the value of the observationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObservationEndDate(XMLGregorianCalendar value) {
        this.observationEndDate = value;
    }

}
