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
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the conditions to be applied for converting into a reference currency when the actual currency rate is not determined upfront.
 * 
 * <p>Java class for Composite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Composite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="determinationMethod" type="{http://www.fpml.org/FpML-5/confirmation}DeterminationMethod" minOccurs="0"/>
 *         &lt;element name="relativeDate" type="{http://www.fpml.org/FpML-5/confirmation}RelativeDateOffset" minOccurs="0"/>
 *         &lt;element name="fxSpotRateSource" type="{http://www.fpml.org/FpML-5/confirmation}FxSpotRateSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Composite", propOrder = {
    "determinationMethod",
    "relativeDate",
    "fxSpotRateSource"
})
public class Composite
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected DeterminationMethod determinationMethod;
    protected RelativeDateOffset relativeDate;
    protected FxSpotRateSource fxSpotRateSource;

    /**
     * Gets the value of the determinationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getDeterminationMethod() {
        return determinationMethod;
    }

    /**
     * Sets the value of the determinationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setDeterminationMethod(DeterminationMethod value) {
        this.determinationMethod = value;
    }

    /**
     * Gets the value of the relativeDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateOffset }
     *     
     */
    public RelativeDateOffset getRelativeDate() {
        return relativeDate;
    }

    /**
     * Sets the value of the relativeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateOffset }
     *     
     */
    public void setRelativeDate(RelativeDateOffset value) {
        this.relativeDate = value;
    }

    /**
     * Gets the value of the fxSpotRateSource property.
     * 
     * @return
     *     possible object is
     *     {@link FxSpotRateSource }
     *     
     */
    public FxSpotRateSource getFxSpotRateSource() {
        return fxSpotRateSource;
    }

    /**
     * Sets the value of the fxSpotRateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSpotRateSource }
     *     
     */
    public void setFxSpotRateSource(FxSpotRateSource value) {
        this.fxSpotRateSource = value;
    }

}
