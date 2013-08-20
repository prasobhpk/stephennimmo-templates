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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base class for all calculation from observed values.
 * 
 * <p>Java class for CalculationFromObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationFromObservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="initialLevel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;element name="closingLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="expiringLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="expectedN" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationFromObservation", propOrder = {
    "initialLevel",
    "closingLevel",
    "expiringLevel",
    "expectedN"
})
@XmlSeeAlso({
    Correlation.class,
    Variance.class
})
public abstract class CalculationFromObservation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigDecimal initialLevel;
    protected Boolean closingLevel;
    protected Boolean expiringLevel;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expectedN;

    /**
     * Gets the value of the initialLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialLevel() {
        return initialLevel;
    }

    /**
     * Sets the value of the initialLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialLevel(BigDecimal value) {
        this.initialLevel = value;
    }

    /**
     * Gets the value of the closingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosingLevel() {
        return closingLevel;
    }

    /**
     * Sets the value of the closingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosingLevel(Boolean value) {
        this.closingLevel = value;
    }

    /**
     * Gets the value of the expiringLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpiringLevel() {
        return expiringLevel;
    }

    /**
     * Sets the value of the expiringLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpiringLevel(Boolean value) {
        this.expiringLevel = value;
    }

    /**
     * Gets the value of the expectedN property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedN() {
        return expectedN;
    }

    /**
     * Sets the value of the expectedN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedN(BigInteger value) {
        this.expectedN = value;
    }

}
