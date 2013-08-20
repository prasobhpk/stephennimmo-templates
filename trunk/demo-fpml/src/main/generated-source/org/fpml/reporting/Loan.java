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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type describing a loan underlying asset.
 * 
 * <p>Java class for Loan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Loan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}UnderlyingAsset">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="borrower" type="{http://www.fpml.org/FpML-5/reporting}LegalEntity" minOccurs="0"/>
 *           &lt;element name="borrowerReference" type="{http://www.fpml.org/FpML-5/reporting}LegalEntityReference" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="lien" type="{http://www.fpml.org/FpML-5/reporting}Lien" minOccurs="0"/>
 *         &lt;element name="facilityType" type="{http://www.fpml.org/FpML-5/reporting}FacilityType" minOccurs="0"/>
 *         &lt;element name="maturity" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="creditAgreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="tranche" type="{http://www.fpml.org/FpML-5/reporting}UnderlyingAssetTranche" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Loan", propOrder = {
    "borrowerOrBorrowerReference",
    "lien",
    "facilityType",
    "maturity",
    "creditAgreementDate",
    "tranche"
})
public class Loan
    extends UnderlyingAsset
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "borrowerReference", type = LegalEntityReference.class),
        @XmlElement(name = "borrower", type = LegalEntity.class)
    })
    protected List<Serializable> borrowerOrBorrowerReference;
    protected Lien lien;
    protected FacilityType facilityType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maturity;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditAgreementDate;
    protected UnderlyingAssetTranche tranche;

    /**
     * Gets the value of the borrowerOrBorrowerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borrowerOrBorrowerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorrowerOrBorrowerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEntityReference }
     * {@link LegalEntity }
     * 
     * 
     */
    public List<Serializable> getBorrowerOrBorrowerReference() {
        if (borrowerOrBorrowerReference == null) {
            borrowerOrBorrowerReference = new ArrayList<Serializable>();
        }
        return this.borrowerOrBorrowerReference;
    }

    /**
     * Gets the value of the lien property.
     * 
     * @return
     *     possible object is
     *     {@link Lien }
     *     
     */
    public Lien getLien() {
        return lien;
    }

    /**
     * Sets the value of the lien property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lien }
     *     
     */
    public void setLien(Lien value) {
        this.lien = value;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityType }
     *     
     */
    public FacilityType getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityType }
     *     
     */
    public void setFacilityType(FacilityType value) {
        this.facilityType = value;
    }

    /**
     * Gets the value of the maturity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaturity() {
        return maturity;
    }

    /**
     * Sets the value of the maturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaturity(XMLGregorianCalendar value) {
        this.maturity = value;
    }

    /**
     * Gets the value of the creditAgreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditAgreementDate() {
        return creditAgreementDate;
    }

    /**
     * Sets the value of the creditAgreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditAgreementDate(XMLGregorianCalendar value) {
        this.creditAgreementDate = value;
    }

    /**
     * Gets the value of the tranche property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingAssetTranche }
     *     
     */
    public UnderlyingAssetTranche getTranche() {
        return tranche;
    }

    /**
     * Sets the value of the tranche property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingAssetTranche }
     *     
     */
    public void setTranche(UnderlyingAssetTranche value) {
        this.tranche = value;
    }

}
