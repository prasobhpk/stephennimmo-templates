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
 * A type for defining the obligations of the counterparty subject to credit support requirements.
 * 
 * <p>Java class for Collateral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collateral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="independentAmount" type="{http://www.fpml.org/FpML-5/reporting}IndependentAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral", propOrder = {
    "independentAmount"
})
public class Collateral
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected IndependentAmount independentAmount;

    /**
     * Gets the value of the independentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmount }
     *     
     */
    public IndependentAmount getIndependentAmount() {
        return independentAmount;
    }

    /**
     * Sets the value of the independentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmount }
     *     
     */
    public void setIndependentAmount(IndependentAmount value) {
        this.independentAmount = value;
    }

}