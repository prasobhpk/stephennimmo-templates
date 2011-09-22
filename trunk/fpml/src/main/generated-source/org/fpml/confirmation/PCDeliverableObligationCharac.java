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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCDeliverableObligationCharac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCDeliverableObligationCharac">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="partialCashSettlement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCDeliverableObligationCharac", propOrder = {
    "applicable",
    "partialCashSettlement"
})
@XmlSeeAlso({
    LoanParticipation.class
})
public class PCDeliverableObligationCharac
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected boolean applicable;
    protected Boolean partialCashSettlement;

    /**
     * Gets the value of the applicable property.
     * 
     */
    public boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     */
    public void setApplicable(boolean value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the partialCashSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialCashSettlement() {
        return partialCashSettlement;
    }

    /**
     * Sets the value of the partialCashSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialCashSettlement(Boolean value) {
        this.partialCashSettlement = value;
    }

}