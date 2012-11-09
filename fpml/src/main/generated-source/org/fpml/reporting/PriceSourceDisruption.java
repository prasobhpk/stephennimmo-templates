//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the parameters used to get a price quote to replace the settlement rate option that is disrupted.
 * 
 * <p>Java class for PriceSourceDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSourceDisruption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fallbackReferencePrice" type="{http://www.fpml.org/FpML-5/reporting}FallbackReferencePrice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSourceDisruption", propOrder = {
    "fallbackReferencePrice"
})
public class PriceSourceDisruption
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected FallbackReferencePrice fallbackReferencePrice;

    /**
     * Gets the value of the fallbackReferencePrice property.
     * 
     * @return
     *     possible object is
     *     {@link FallbackReferencePrice }
     *     
     */
    public FallbackReferencePrice getFallbackReferencePrice() {
        return fallbackReferencePrice;
    }

    /**
     * Sets the value of the fallbackReferencePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FallbackReferencePrice }
     *     
     */
    public void setFallbackReferencePrice(FallbackReferencePrice value) {
        this.fallbackReferencePrice = value;
    }

}