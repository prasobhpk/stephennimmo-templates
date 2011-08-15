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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An entity for defining the agreement executed between the parties and intended to govern all OTC derivatives transactions between those parties.
 * 
 * <p>Java class for MasterAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterAgreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masterAgreementType" type="{http://www.fpml.org/FpML-5/reporting}MasterAgreementType" minOccurs="0"/>
 *         &lt;element name="masterAgreementVersion" type="{http://www.fpml.org/FpML-5/reporting}MasterAgreementVersion" minOccurs="0"/>
 *         &lt;element name="masterAgreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterAgreement", propOrder = {
    "masterAgreementType",
    "masterAgreementVersion",
    "masterAgreementDate"
})
public class MasterAgreement implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MasterAgreementType masterAgreementType;
    protected MasterAgreementVersion masterAgreementVersion;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar masterAgreementDate;

    /**
     * Gets the value of the masterAgreementType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreementType }
     *     
     */
    public MasterAgreementType getMasterAgreementType() {
        return masterAgreementType;
    }

    /**
     * Sets the value of the masterAgreementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreementType }
     *     
     */
    public void setMasterAgreementType(MasterAgreementType value) {
        this.masterAgreementType = value;
    }

    /**
     * Gets the value of the masterAgreementVersion property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreementVersion }
     *     
     */
    public MasterAgreementVersion getMasterAgreementVersion() {
        return masterAgreementVersion;
    }

    /**
     * Sets the value of the masterAgreementVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreementVersion }
     *     
     */
    public void setMasterAgreementVersion(MasterAgreementVersion value) {
        this.masterAgreementVersion = value;
    }

    /**
     * Gets the value of the masterAgreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMasterAgreementDate() {
        return masterAgreementDate;
    }

    /**
     * Sets the value of the masterAgreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMasterAgreementDate(XMLGregorianCalendar value) {
        this.masterAgreementDate = value;
    }

}
