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
 * <p>Java class for FloatingAmountProvisions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingAmountProvisions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WACCapInterestProvision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="stepUpProvision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingAmountProvisions", propOrder = {
    "wacCapInterestProvision",
    "stepUpProvision"
})
public class FloatingAmountProvisions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "WACCapInterestProvision")
    protected Boolean wacCapInterestProvision;
    protected Boolean stepUpProvision;

    /**
     * Gets the value of the wacCapInterestProvision property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWACCapInterestProvision() {
        return wacCapInterestProvision;
    }

    /**
     * Sets the value of the wacCapInterestProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWACCapInterestProvision(Boolean value) {
        this.wacCapInterestProvision = value;
    }

    /**
     * Gets the value of the stepUpProvision property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStepUpProvision() {
        return stepUpProvision;
    }

    /**
     * Sets the value of the stepUpProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStepUpProvision(Boolean value) {
        this.stepUpProvision = value;
    }

}
