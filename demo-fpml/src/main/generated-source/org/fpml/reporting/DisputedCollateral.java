//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisputedCollateral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputedCollateral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disputedAmount" type="{http://www.fpml.org/FpML-5/reporting}Money" minOccurs="0"/>
 *         &lt;element name="disputeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="disputeResolutionMethod" type="{http://www.fpml.org/FpML-5/reporting}DisputeResolutionMethod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputedCollateral", propOrder = {
    "disputedAmount",
    "disputeDate",
    "disputeResolutionMethod"
})
public class DisputedCollateral implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Money disputedAmount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disputeDate;
    protected List<DisputeResolutionMethod> disputeResolutionMethod;

    /**
     * Gets the value of the disputedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDisputedAmount() {
        return disputedAmount;
    }

    /**
     * Sets the value of the disputedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDisputedAmount(Money value) {
        this.disputedAmount = value;
    }

    /**
     * Gets the value of the disputeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisputeDate() {
        return disputeDate;
    }

    /**
     * Sets the value of the disputeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisputeDate(XMLGregorianCalendar value) {
        this.disputeDate = value;
    }

    /**
     * Gets the value of the disputeResolutionMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disputeResolutionMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisputeResolutionMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeResolutionMethod }
     * 
     * 
     */
    public List<DisputeResolutionMethod> getDisputeResolutionMethod() {
        if (disputeResolutionMethod == null) {
            disputeResolutionMethod = new ArrayList<DisputeResolutionMethod>();
        }
        return this.disputeResolutionMethod;
    }

}
