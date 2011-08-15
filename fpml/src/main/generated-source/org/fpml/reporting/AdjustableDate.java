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
 * A type for defining a date that shall be subject to adjustment if it would otherwise fall on a day that is not a business day in the specified business centers, together with the convention for adjusting the date.
 * 
 * <p>Java class for AdjustableDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustableDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.fpml.org/FpML-5/reporting}AdjustableDate.model"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustableDate", propOrder = {
    "unadjustedDate",
    "dateAdjustments",
    "adjustedDate"
})
public class AdjustableDate
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected IdentifiedDate unadjustedDate;
    protected BusinessDayAdjustments dateAdjustments;
    protected IdentifiedDate adjustedDate;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the unadjustedDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getUnadjustedDate() {
        return unadjustedDate;
    }

    /**
     * Sets the value of the unadjustedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setUnadjustedDate(IdentifiedDate value) {
        this.unadjustedDate = value;
    }

    /**
     * Gets the value of the dateAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    /**
     * Sets the value of the dateAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public void setDateAdjustments(BusinessDayAdjustments value) {
        this.dateAdjustments = value;
    }

    /**
     * Gets the value of the adjustedDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getAdjustedDate() {
        return adjustedDate;
    }

    /**
     * Sets the value of the adjustedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setAdjustedDate(IdentifiedDate value) {
        this.adjustedDate = value;
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
