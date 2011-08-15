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
 * The physical delivery obligation options specific to a firm transaction.
 * 
 * <p>Java class for ElectricityDeliveryFirm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityDeliveryFirm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forceMajeure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityDeliveryFirm", propOrder = {
    "forceMajeure"
})
public class ElectricityDeliveryFirm
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected boolean forceMajeure;

    /**
     * Gets the value of the forceMajeure property.
     * 
     */
    public boolean isForceMajeure() {
        return forceMajeure;
    }

    /**
     * Sets the value of the forceMajeure property.
     * 
     */
    public void setForceMajeure(boolean value) {
        this.forceMajeure = value;
    }

}
