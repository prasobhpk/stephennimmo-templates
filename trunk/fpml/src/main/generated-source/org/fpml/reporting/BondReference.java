//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type including a reference to a bond to support the representation of an asset swap or Condition Precedent Bond.
 * 
 * <p>Java class for BondReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BondReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/reporting}bond" minOccurs="0"/>
 *         &lt;element name="conditionPrecedentBond" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="discrepancyClause" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BondReference", propOrder = {
    "bond",
    "conditionPrecedentBond",
    "discrepancyClause"
})
public class BondReference
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Bond bond;
    protected Boolean conditionPrecedentBond;
    protected Boolean discrepancyClause;

    /**
     * Reference to a bond underlyer.
     * 
     * @return
     *     possible object is
     *     {@link Bond }
     *     
     */
    public Bond getBond() {
        return bond;
    }

    /**
     * Sets the value of the bond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bond }
     *     
     */
    public void setBond(Bond value) {
        this.bond = value;
    }

    /**
     * Gets the value of the conditionPrecedentBond property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConditionPrecedentBond() {
        return conditionPrecedentBond;
    }

    /**
     * Sets the value of the conditionPrecedentBond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConditionPrecedentBond(Boolean value) {
        this.conditionPrecedentBond = value;
    }

    /**
     * Gets the value of the discrepancyClause property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscrepancyClause() {
        return discrepancyClause;
    }

    /**
     * Sets the value of the discrepancyClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscrepancyClause(Boolean value) {
        this.discrepancyClause = value;
    }

}
