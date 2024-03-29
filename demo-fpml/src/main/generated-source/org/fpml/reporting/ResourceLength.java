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
 * The type that indicates the length of the resource.
 * 
 * <p>Java class for ResourceLength complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceLength">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lengthUnit" type="{http://www.fpml.org/FpML-5/reporting}LengthUnitEnum" minOccurs="0"/>
 *         &lt;element name="lengthValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceLength", propOrder = {
    "lengthUnit",
    "lengthValue"
})
public class ResourceLength
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected LengthUnitEnum lengthUnit;
    protected BigDecimal lengthValue;

    /**
     * Gets the value of the lengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnitEnum }
     *     
     */
    public LengthUnitEnum getLengthUnit() {
        return lengthUnit;
    }

    /**
     * Sets the value of the lengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnitEnum }
     *     
     */
    public void setLengthUnit(LengthUnitEnum value) {
        this.lengthUnit = value;
    }

    /**
     * Gets the value of the lengthValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLengthValue() {
        return lengthValue;
    }

    /**
     * Sets the value of the lengthValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLengthValue(BigDecimal value) {
        this.lengthValue = value;
    }

}
