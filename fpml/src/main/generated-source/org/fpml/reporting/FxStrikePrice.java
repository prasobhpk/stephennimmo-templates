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
 * A type that describes the rate of exchange at which the option has been struck.
 * 
 * <p>Java class for FxStrikePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxStrikePrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rate" type="{http://www.fpml.org/FpML-5/reporting}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="strikeQuoteBasis" type="{http://www.fpml.org/FpML-5/reporting}StrikeQuoteBasisEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxStrikePrice", propOrder = {
    "rate",
    "strikeQuoteBasis"
})
public class FxStrikePrice
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigDecimal rate;
    protected StrikeQuoteBasisEnum strikeQuoteBasis;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the strikeQuoteBasis property.
     * 
     * @return
     *     possible object is
     *     {@link StrikeQuoteBasisEnum }
     *     
     */
    public StrikeQuoteBasisEnum getStrikeQuoteBasis() {
        return strikeQuoteBasis;
    }

    /**
     * Sets the value of the strikeQuoteBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrikeQuoteBasisEnum }
     *     
     */
    public void setStrikeQuoteBasis(StrikeQuoteBasisEnum value) {
        this.strikeQuoteBasis = value;
    }

}