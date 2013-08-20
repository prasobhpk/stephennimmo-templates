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
 * Defines the specification of the consequences of Index Events as defined by the 2002 ISDA Equity Derivatives Definitions.
 * 
 * <p>Java class for IndexAdjustmentEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexAdjustmentEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indexModification" type="{http://www.fpml.org/FpML-5/confirmation}IndexEventConsequenceEnum"/>
 *         &lt;element name="indexCancellation" type="{http://www.fpml.org/FpML-5/confirmation}IndexEventConsequenceEnum"/>
 *         &lt;element name="indexDisruption" type="{http://www.fpml.org/FpML-5/confirmation}IndexEventConsequenceEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexAdjustmentEvents", propOrder = {
    "indexModification",
    "indexCancellation",
    "indexDisruption"
})
public class IndexAdjustmentEvents
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected IndexEventConsequenceEnum indexModification;
    @XmlElement(required = true)
    protected IndexEventConsequenceEnum indexCancellation;
    @XmlElement(required = true)
    protected IndexEventConsequenceEnum indexDisruption;

    /**
     * Gets the value of the indexModification property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public IndexEventConsequenceEnum getIndexModification() {
        return indexModification;
    }

    /**
     * Sets the value of the indexModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public void setIndexModification(IndexEventConsequenceEnum value) {
        this.indexModification = value;
    }

    /**
     * Gets the value of the indexCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public IndexEventConsequenceEnum getIndexCancellation() {
        return indexCancellation;
    }

    /**
     * Sets the value of the indexCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public void setIndexCancellation(IndexEventConsequenceEnum value) {
        this.indexCancellation = value;
    }

    /**
     * Gets the value of the indexDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public IndexEventConsequenceEnum getIndexDisruption() {
        return indexDisruption;
    }

    /**
     * Sets the value of the indexDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public void setIndexDisruption(IndexEventConsequenceEnum value) {
        this.indexDisruption = value;
    }

}
