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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A complex type to specify a valuation swap curve, which is used as part of the strike construct for the bond and convertible bond options.
 * 
 * <p>Java class for SwapCurveValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwapCurveValuation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FloatingRateIndex.model"/>
 *         &lt;element name="spread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="side" type="{http://www.fpml.org/FpML-5/confirmation}QuotationSideEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwapCurveValuation", propOrder = {
    "floatingRateIndex",
    "indexTenor",
    "spread",
    "side"
})
@XmlSeeAlso({
    MakeWholeAmount.class
})
public class SwapCurveValuation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected FloatingRateIndex floatingRateIndex;
    protected Period indexTenor;
    @XmlElement(required = true)
    protected BigDecimal spread;
    protected QuotationSideEnum side;

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

    /**
     * Gets the value of the spread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpread(BigDecimal value) {
        this.spread = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationSideEnum }
     *     
     */
    public QuotationSideEnum getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationSideEnum }
     *     
     */
    public void setSide(QuotationSideEnum value) {
        this.side = value;
    }

}