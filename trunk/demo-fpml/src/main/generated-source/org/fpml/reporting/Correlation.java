//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the correlation amount of a correlation swap.
 * 
 * <p>Java class for Correlation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Correlation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}CalculationFromObservation">
 *       &lt;sequence>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/reporting}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="correlationStrikePrice" type="{http://www.fpml.org/FpML-5/reporting}CorrelationValue" minOccurs="0"/>
 *         &lt;element name="boundedCorrelation" type="{http://www.fpml.org/FpML-5/reporting}BoundedCorrelation" minOccurs="0"/>
 *         &lt;element name="numberOfDataSeries" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Correlation", propOrder = {
    "notionalAmount",
    "correlationStrikePrice",
    "boundedCorrelation",
    "numberOfDataSeries"
})
public class Correlation
    extends CalculationFromObservation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected NonNegativeMoney notionalAmount;
    protected BigDecimal correlationStrikePrice;
    protected BoundedCorrelation boundedCorrelation;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfDataSeries;

    /**
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setNotionalAmount(NonNegativeMoney value) {
        this.notionalAmount = value;
    }

    /**
     * Gets the value of the correlationStrikePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCorrelationStrikePrice() {
        return correlationStrikePrice;
    }

    /**
     * Sets the value of the correlationStrikePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCorrelationStrikePrice(BigDecimal value) {
        this.correlationStrikePrice = value;
    }

    /**
     * Gets the value of the boundedCorrelation property.
     * 
     * @return
     *     possible object is
     *     {@link BoundedCorrelation }
     *     
     */
    public BoundedCorrelation getBoundedCorrelation() {
        return boundedCorrelation;
    }

    /**
     * Sets the value of the boundedCorrelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundedCorrelation }
     *     
     */
    public void setBoundedCorrelation(BoundedCorrelation value) {
        this.boundedCorrelation = value;
    }

    /**
     * Gets the value of the numberOfDataSeries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDataSeries() {
        return numberOfDataSeries;
    }

    /**
     * Sets the value of the numberOfDataSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDataSeries(BigInteger value) {
        this.numberOfDataSeries = value;
    }

}
