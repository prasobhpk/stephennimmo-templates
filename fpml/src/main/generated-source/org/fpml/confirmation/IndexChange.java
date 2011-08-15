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
import javax.xml.bind.annotation.XmlType;


/**
 * A structure describing the effect of a change to an index.
 * 
 * <p>Java class for IndexChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}ChangeEvent">
 *       &lt;sequence>
 *         &lt;element name="indexFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="factoredCalculationAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexChange", propOrder = {
    "indexFactor",
    "factoredCalculationAmount"
})
public class IndexChange
    extends ChangeEvent
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected BigDecimal indexFactor;
    @XmlElement(required = true)
    protected Money factoredCalculationAmount;

    /**
     * Gets the value of the indexFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexFactor() {
        return indexFactor;
    }

    /**
     * Sets the value of the indexFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexFactor(BigDecimal value) {
        this.indexFactor = value;
    }

    /**
     * Gets the value of the factoredCalculationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFactoredCalculationAmount() {
        return factoredCalculationAmount;
    }

    /**
     * Sets the value of the factoredCalculationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFactoredCalculationAmount(Money value) {
        this.factoredCalculationAmount = value;
    }

}
