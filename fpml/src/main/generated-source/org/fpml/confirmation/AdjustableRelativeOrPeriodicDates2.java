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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type giving the choice between defining a series of dates as an explicit list of dates together with applicable adjustments, or as relative to some other series of (anchor) dates, or as a set of factors to specify periodic occurences.
 * 
 * <p>Java class for AdjustableRelativeOrPeriodicDates2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustableRelativeOrPeriodicDates2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="adjustableDates" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableDates"/>
 *         &lt;element name="relativeDates" type="{http://www.fpml.org/FpML-5/confirmation}RelativeDates"/>
 *         &lt;element name="periodicDates" type="{http://www.fpml.org/FpML-5/confirmation}PeriodicDates"/>
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
@XmlType(name = "AdjustableRelativeOrPeriodicDates2", propOrder = {
    "adjustableDates",
    "relativeDates",
    "periodicDates"
})
public class AdjustableRelativeOrPeriodicDates2
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AdjustableDates adjustableDates;
    protected RelativeDates relativeDates;
    protected PeriodicDates periodicDates;
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
     * Gets the value of the relativeDates property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDates }
     *     
     */
    public RelativeDates getRelativeDates() {
        return relativeDates;
    }

    /**
     * Sets the value of the relativeDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDates }
     *     
     */
    public void setRelativeDates(RelativeDates value) {
        this.relativeDates = value;
    }

    /**
     * Gets the value of the periodicDates property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicDates }
     *     
     */
    public PeriodicDates getPeriodicDates() {
        return periodicDates;
    }

    /**
     * Sets the value of the periodicDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicDates }
     *     
     */
    public void setPeriodicDates(PeriodicDates value) {
        this.periodicDates = value;
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