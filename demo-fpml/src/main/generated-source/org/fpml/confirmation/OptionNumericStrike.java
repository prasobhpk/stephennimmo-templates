//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the strike price for an option as a numeric value without currency.
 * 
 * <p>Java class for OptionNumericStrike complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionNumericStrike">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="strikePrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="strikePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionNumericStrike", propOrder = {
    "strikePrice",
    "strikePercentage"
})
@XmlSeeAlso({
    OptionStrike.class
})
public class OptionNumericStrike
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigDecimal strikePrice;
    protected BigDecimal strikePercentage;

    /**
     * Gets the value of the strikePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrikePrice() {
        return strikePrice;
    }

    /**
     * Sets the value of the strikePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrikePrice(BigDecimal value) {
        this.strikePrice = value;
    }

    /**
     * Gets the value of the strikePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrikePercentage() {
        return strikePercentage;
    }

    /**
     * Sets the value of the strikePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrikePercentage(BigDecimal value) {
        this.strikePercentage = value;
    }

}
