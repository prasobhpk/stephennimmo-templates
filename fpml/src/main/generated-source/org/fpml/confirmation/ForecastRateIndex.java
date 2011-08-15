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
 * A type defining a rate index.
 * 
 * <p>Java class for ForecastRateIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastRateIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="floatingRateIndex" type="{http://www.fpml.org/FpML-5/confirmation}FloatingRateIndex"/>
 *         &lt;element name="indexTenor" type="{http://www.fpml.org/FpML-5/confirmation}Period"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastRateIndex", propOrder = {
    "floatingRateIndex",
    "indexTenor"
})
public class ForecastRateIndex
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected FloatingRateIndex floatingRateIndex;
    @XmlElement(required = true)
    protected Period indexTenor;

    /**
     * Gets the value of the floatingRateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIndex }
     *     
     */
    public FloatingRateIndex getFloatingRateIndex() {
        return floatingRateIndex;
    }

    /**
     * Sets the value of the floatingRateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIndex }
     *     
     */
    public void setFloatingRateIndex(FloatingRateIndex value) {
        this.floatingRateIndex = value;
    }

    /**
     * Gets the value of the indexTenor property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getIndexTenor() {
        return indexTenor;
    }

    /**
     * Sets the value of the indexTenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setIndexTenor(Period value) {
        this.indexTenor = value;
    }

}
