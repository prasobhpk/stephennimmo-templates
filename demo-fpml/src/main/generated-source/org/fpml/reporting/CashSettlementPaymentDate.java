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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type defining the cash settlement payment date(s) as either a set of explicit dates, together with applicable adjustments, or as a date relative to some other (anchor) date, or as any date in a range of contiguous business days.
 * 
 * <p>Java class for CashSettlementPaymentDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashSettlementPaymentDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="adjustableDates" type="{http://www.fpml.org/FpML-5/reporting}AdjustableDates" minOccurs="0"/>
 *         &lt;element name="relativeDate" type="{http://www.fpml.org/FpML-5/reporting}RelativeDateOffset" minOccurs="0"/>
 *         &lt;element name="businessDateRange" type="{http://www.fpml.org/FpML-5/reporting}BusinessDateRange" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashSettlementPaymentDate", propOrder = {
    "adjustableDates",
    "relativeDate",
    "businessDateRange"
})
public class CashSettlementPaymentDate
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AdjustableDates adjustableDates;
    protected RelativeDateOffset relativeDate;
    protected BusinessDateRange businessDateRange;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the adjustableDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDates }
     *     
     */
    public AdjustableDates getAdjustableDates() {
        return adjustableDates;
    }

    /**
     * Sets the value of the adjustableDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDates }
     *     
     */
    public void setAdjustableDates(AdjustableDates value) {
        this.adjustableDates = value;
    }

    /**
     * Gets the value of the relativeDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateOffset }
     *     
     */
    public RelativeDateOffset getRelativeDate() {
        return relativeDate;
    }

    /**
     * Sets the value of the relativeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateOffset }
     *     
     */
    public void setRelativeDate(RelativeDateOffset value) {
        this.relativeDate = value;
    }

    /**
     * Gets the value of the businessDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDateRange }
     *     
     */
    public BusinessDateRange getBusinessDateRange() {
        return businessDateRange;
    }

    /**
     * Sets the value of the businessDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDateRange }
     *     
     */
    public void setBusinessDateRange(BusinessDateRange value) {
        this.businessDateRange = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
