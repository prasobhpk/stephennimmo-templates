//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type describing a mortgage asset.
 * 
 * <p>Java class for Mortgage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mortgage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}UnderlyingAsset">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="insurer" type="{http://www.fpml.org/FpML-5/reporting}LegalEntity" minOccurs="0"/>
 *           &lt;element name="insurerReference" type="{http://www.fpml.org/FpML-5/reporting}LegalEntityReference" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}FixedIncomeSecurityContent.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}BondCalculation.model"/>
 *         &lt;element name="originalPrincipalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pool" type="{http://www.fpml.org/FpML-5/reporting}AssetPool" minOccurs="0"/>
 *         &lt;element name="sector" type="{http://www.fpml.org/FpML-5/reporting}MortgageSector" minOccurs="0"/>
 *         &lt;element name="tranche" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mortgage", propOrder = {
    "insurer",
    "insurerReference",
    "issuerName",
    "issuerPartyReference",
    "seniority",
    "couponType",
    "couponRate",
    "maturity",
    "paymentFrequency",
    "dayCountFraction",
    "originalPrincipalAmount",
    "pool",
    "sector",
    "tranche"
})
public class Mortgage
    extends UnderlyingAsset
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected LegalEntity insurer;
    protected LegalEntityReference insurerReference;
    protected String issuerName;
    protected PartyReference issuerPartyReference;
    protected CreditSeniority seniority;
    protected CouponType couponType;
    protected BigDecimal couponRate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maturity;
    protected Period paymentFrequency;
    protected DayCountFraction dayCountFraction;
    protected BigDecimal originalPrincipalAmount;
    protected AssetPool pool;
    protected MortgageSector sector;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tranche;

    /**
     * Gets the value of the insurer property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntity }
     *     
     */
    public LegalEntity getInsurer() {
        return insurer;
    }

    /**
     * Sets the value of the insurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntity }
     *     
     */
    public void setInsurer(LegalEntity value) {
        this.insurer = value;
    }

    /**
     * Gets the value of the insurerReference property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityReference }
     *     
     */
    public LegalEntityReference getInsurerReference() {
        return insurerReference;
    }

    /**
     * Sets the value of the insurerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityReference }
     *     
     */
    public void setInsurerReference(LegalEntityReference value) {
        this.insurerReference = value;
    }

    /**
     * Gets the value of the issuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * Sets the value of the issuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerName(String value) {
        this.issuerName = value;
    }

    /**
     * Gets the value of the issuerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getIssuerPartyReference() {
        return issuerPartyReference;
    }

    /**
     * Sets the value of the issuerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setIssuerPartyReference(PartyReference value) {
        this.issuerPartyReference = value;
    }

    /**
     * Gets the value of the seniority property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSeniority }
     *     
     */
    public CreditSeniority getSeniority() {
        return seniority;
    }

    /**
     * Sets the value of the seniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSeniority }
     *     
     */
    public void setSeniority(CreditSeniority value) {
        this.seniority = value;
    }

    /**
     * Gets the value of the couponType property.
     * 
     * @return
     *     possible object is
     *     {@link CouponType }
     *     
     */
    public CouponType getCouponType() {
        return couponType;
    }

    /**
     * Sets the value of the couponType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponType }
     *     
     */
    public void setCouponType(CouponType value) {
        this.couponType = value;
    }

    /**
     * Gets the value of the couponRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponRate() {
        return couponRate;
    }

    /**
     * Sets the value of the couponRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponRate(BigDecimal value) {
        this.couponRate = value;
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
     * Gets the value of the paymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPaymentFrequency() {
        return paymentFrequency;
    }

    /**
     * Sets the value of the paymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPaymentFrequency(Period value) {
        this.paymentFrequency = value;
    }

    /**
     * Gets the value of the dayCountFraction property.
     * 
     * @return
     *     possible object is
     *     {@link DayCountFraction }
     *     
     */
    public DayCountFraction getDayCountFraction() {
        return dayCountFraction;
    }

    /**
     * Sets the value of the dayCountFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCountFraction }
     *     
     */
    public void setDayCountFraction(DayCountFraction value) {
        this.dayCountFraction = value;
    }

    /**
     * Gets the value of the originalPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalPrincipalAmount() {
        return originalPrincipalAmount;
    }

    /**
     * Sets the value of the originalPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalPrincipalAmount(BigDecimal value) {
        this.originalPrincipalAmount = value;
    }

    /**
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link AssetPool }
     *     
     */
    public AssetPool getPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetPool }
     *     
     */
    public void setPool(AssetPool value) {
        this.pool = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link MortgageSector }
     *     
     */
    public MortgageSector getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link MortgageSector }
     *     
     */
    public void setSector(MortgageSector value) {
        this.sector = value;
    }

    /**
     * Gets the value of the tranche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranche() {
        return tranche;
    }

    /**
     * Sets the value of the tranche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranche(String value) {
        this.tranche = value;
    }

}
