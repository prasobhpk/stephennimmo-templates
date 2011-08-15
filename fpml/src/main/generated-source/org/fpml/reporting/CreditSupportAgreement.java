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
 * The agreement executed between the parties and intended to govern collateral arrangement for all OTC derivatives transactions between those parties.
 * 
 * <p>Java class for CreditSupportAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditSupportAgreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/reporting}CreditSupportAgreementType" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.fpml.org/FpML-5/reporting}CreditSupportAgreementIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditSupportAgreement", propOrder = {
    "type",
    "date",
    "identifier"
})
public class CreditSupportAgreement implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CreditSupportAgreementType type;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    protected CreditSupportAgreementIdentifier identifier;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSupportAgreementType }
     *     
     */
    public CreditSupportAgreementType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSupportAgreementType }
     *     
     */
    public void setType(CreditSupportAgreementType value) {
        this.type = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSupportAgreementIdentifier }
     *     
     */
    public CreditSupportAgreementIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSupportAgreementIdentifier }
     *     
     */
    public void setIdentifier(CreditSupportAgreementIdentifier value) {
        this.identifier = value;
    }

}
