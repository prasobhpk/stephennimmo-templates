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
 * The specification of the oil product to be delivered.
 * 
 * <p>Java class for OilProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OilProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/confirmation}OilProductType"/>
 *         &lt;element name="grade" type="{http://www.fpml.org/FpML-5/confirmation}CommodityProductGrade"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OilProduct", propOrder = {
    "type",
    "grade"
})
public class OilProduct
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected OilProductType type;
    @XmlElement(required = true)
    protected CommodityProductGrade grade;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OilProductType }
     *     
     */
    public OilProductType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilProductType }
     *     
     */
    public void setType(OilProductType value) {
        this.type = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityProductGrade }
     *     
     */
    public CommodityProductGrade getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityProductGrade }
     *     
     */
    public void setGrade(CommodityProductGrade value) {
        this.grade = value;
    }

}
