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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An entity for defining the master confirmation agreement executed between the parties.
 * 
 * <p>Java class for MasterConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masterConfirmationType" type="{http://www.fpml.org/FpML-5/confirmation}MasterConfirmationType"/>
 *         &lt;element name="masterConfirmationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="masterConfirmationAnnexDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="masterConfirmationAnnexType" type="{http://www.fpml.org/FpML-5/confirmation}MasterConfirmationAnnexType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterConfirmation", propOrder = {
    "masterConfirmationType",
    "masterConfirmationDate",
    "masterConfirmationAnnexDate",
    "masterConfirmationAnnexType"
})
public class MasterConfirmation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected MasterConfirmationType masterConfirmationType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar masterConfirmationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar masterConfirmationAnnexDate;
    protected MasterConfirmationAnnexType masterConfirmationAnnexType;

    /**
     * Gets the value of the masterConfirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterConfirmationType }
     *     
     */
    public MasterConfirmationType getMasterConfirmationType() {
        return masterConfirmationType;
    }

    /**
     * Sets the value of the masterConfirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterConfirmationType }
     *     
     */
    public void setMasterConfirmationType(MasterConfirmationType value) {
        this.masterConfirmationType = value;
    }

    /**
     * Gets the value of the masterConfirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMasterConfirmationDate() {
        return masterConfirmationDate;
    }

    /**
     * Sets the value of the masterConfirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMasterConfirmationDate(XMLGregorianCalendar value) {
        this.masterConfirmationDate = value;
    }

    /**
     * Gets the value of the masterConfirmationAnnexDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMasterConfirmationAnnexDate() {
        return masterConfirmationAnnexDate;
    }

    /**
     * Sets the value of the masterConfirmationAnnexDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMasterConfirmationAnnexDate(XMLGregorianCalendar value) {
        this.masterConfirmationAnnexDate = value;
    }

    /**
     * Gets the value of the masterConfirmationAnnexType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterConfirmationAnnexType }
     *     
     */
    public MasterConfirmationAnnexType getMasterConfirmationAnnexType() {
        return masterConfirmationAnnexType;
    }

    /**
     * Sets the value of the masterConfirmationAnnexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterConfirmationAnnexType }
     *     
     */
    public void setMasterConfirmationAnnexType(MasterConfirmationAnnexType value) {
        this.masterConfirmationAnnexType = value;
    }

}