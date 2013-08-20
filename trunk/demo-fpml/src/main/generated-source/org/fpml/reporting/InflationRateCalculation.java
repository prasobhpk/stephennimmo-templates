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
 * A type defining the components specifiying an Inflation Rate Calculation
 * 
 * <p>Java class for InflationRateCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InflationRateCalculation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}FloatingRateCalculation">
 *       &lt;sequence>
 *         &lt;element name="inflationLag" type="{http://www.fpml.org/FpML-5/reporting}Offset" minOccurs="0"/>
 *         &lt;element name="indexSource" type="{http://www.fpml.org/FpML-5/reporting}RateSourcePage" minOccurs="0"/>
 *         &lt;element name="mainPublication" type="{http://www.fpml.org/FpML-5/reporting}MainPublication" minOccurs="0"/>
 *         &lt;element name="interpolationMethod" type="{http://www.fpml.org/FpML-5/reporting}InterpolationMethod" minOccurs="0"/>
 *         &lt;element name="initialIndexLevel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fallbackBondApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InflationRateCalculation", propOrder = {
    "inflationLag",
    "indexSource",
    "mainPublication",
    "interpolationMethod",
    "initialIndexLevel",
    "fallbackBondApplicable"
})
public class InflationRateCalculation
    extends FloatingRateCalculation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Offset inflationLag;
    protected RateSourcePage indexSource;
    protected MainPublication mainPublication;
    protected InterpolationMethod interpolationMethod;
    protected BigDecimal initialIndexLevel;
    protected Boolean fallbackBondApplicable;

    /**
     * Gets the value of the inflationLag property.
     * 
     * @return
     *     possible object is
     *     {@link Offset }
     *     
     */
    public Offset getInflationLag() {
        return inflationLag;
    }

    /**
     * Sets the value of the inflationLag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offset }
     *     
     */
    public void setInflationLag(Offset value) {
        this.inflationLag = value;
    }

    /**
     * Gets the value of the indexSource property.
     * 
     * @return
     *     possible object is
     *     {@link RateSourcePage }
     *     
     */
    public RateSourcePage getIndexSource() {
        return indexSource;
    }

    /**
     * Sets the value of the indexSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSourcePage }
     *     
     */
    public void setIndexSource(RateSourcePage value) {
        this.indexSource = value;
    }

    /**
     * Gets the value of the mainPublication property.
     * 
     * @return
     *     possible object is
     *     {@link MainPublication }
     *     
     */
    public MainPublication getMainPublication() {
        return mainPublication;
    }

    /**
     * Sets the value of the mainPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainPublication }
     *     
     */
    public void setMainPublication(MainPublication value) {
        this.mainPublication = value;
    }

    /**
     * Gets the value of the interpolationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InterpolationMethod }
     *     
     */
    public InterpolationMethod getInterpolationMethod() {
        return interpolationMethod;
    }

    /**
     * Sets the value of the interpolationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterpolationMethod }
     *     
     */
    public void setInterpolationMethod(InterpolationMethod value) {
        this.interpolationMethod = value;
    }

    /**
     * Gets the value of the initialIndexLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialIndexLevel() {
        return initialIndexLevel;
    }

    /**
     * Sets the value of the initialIndexLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialIndexLevel(BigDecimal value) {
        this.initialIndexLevel = value;
    }

    /**
     * Gets the value of the fallbackBondApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFallbackBondApplicable() {
        return fallbackBondApplicable;
    }

    /**
     * Sets the value of the fallbackBondApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFallbackBondApplicable(Boolean value) {
        this.fallbackBondApplicable = value;
    }

}
