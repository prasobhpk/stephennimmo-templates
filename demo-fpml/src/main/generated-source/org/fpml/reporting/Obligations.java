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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Obligations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Obligations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.fpml.org/FpML-5/reporting}ObligationCategoryEnum" minOccurs="0"/>
 *         &lt;element name="notSubordinated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="specifiedCurrency" type="{http://www.fpml.org/FpML-5/reporting}SpecifiedCurrency" minOccurs="0"/>
 *         &lt;element name="notSovereignLender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notDomesticCurrency" type="{http://www.fpml.org/FpML-5/reporting}NotDomesticCurrency" minOccurs="0"/>
 *         &lt;element name="notDomesticLaw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="listed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notDomesticIssuance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="fullFaithAndCreditObLiability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="generalFundObligationLiability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="revenueObligationLiability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="notContingent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excluded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="othReferenceEntityObligations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designatedPriority" type="{http://www.fpml.org/FpML-5/reporting}Lien" minOccurs="0"/>
 *         &lt;element name="cashSettlementOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deliveryOfCommitments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="continuity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obligations", propOrder = {
    "category",
    "notSubordinated",
    "specifiedCurrency",
    "notSovereignLender",
    "notDomesticCurrency",
    "notDomesticLaw",
    "listed",
    "notDomesticIssuance",
    "fullFaithAndCreditObLiability",
    "generalFundObligationLiability",
    "revenueObligationLiability",
    "notContingent",
    "excluded",
    "othReferenceEntityObligations",
    "designatedPriority",
    "cashSettlementOnly",
    "deliveryOfCommitments",
    "continuity"
})
public class Obligations
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ObligationCategoryEnum category;
    protected Boolean notSubordinated;
    protected SpecifiedCurrency specifiedCurrency;
    protected Boolean notSovereignLender;
    protected NotDomesticCurrency notDomesticCurrency;
    protected Boolean notDomesticLaw;
    protected Boolean listed;
    protected Boolean notDomesticIssuance;
    protected Boolean fullFaithAndCreditObLiability;
    protected Boolean generalFundObligationLiability;
    protected Boolean revenueObligationLiability;
    protected Boolean notContingent;
    protected String excluded;
    protected String othReferenceEntityObligations;
    protected Lien designatedPriority;
    protected Boolean cashSettlementOnly;
    protected Boolean deliveryOfCommitments;
    protected Boolean continuity;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ObligationCategoryEnum }
     *     
     */
    public ObligationCategoryEnum getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObligationCategoryEnum }
     *     
     */
    public void setCategory(ObligationCategoryEnum value) {
        this.category = value;
    }

    /**
     * Gets the value of the notSubordinated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotSubordinated() {
        return notSubordinated;
    }

    /**
     * Sets the value of the notSubordinated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotSubordinated(Boolean value) {
        this.notSubordinated = value;
    }

    /**
     * Gets the value of the specifiedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedCurrency }
     *     
     */
    public SpecifiedCurrency getSpecifiedCurrency() {
        return specifiedCurrency;
    }

    /**
     * Sets the value of the specifiedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedCurrency }
     *     
     */
    public void setSpecifiedCurrency(SpecifiedCurrency value) {
        this.specifiedCurrency = value;
    }

    /**
     * Gets the value of the notSovereignLender property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotSovereignLender() {
        return notSovereignLender;
    }

    /**
     * Sets the value of the notSovereignLender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotSovereignLender(Boolean value) {
        this.notSovereignLender = value;
    }

    /**
     * Gets the value of the notDomesticCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link NotDomesticCurrency }
     *     
     */
    public NotDomesticCurrency getNotDomesticCurrency() {
        return notDomesticCurrency;
    }

    /**
     * Sets the value of the notDomesticCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotDomesticCurrency }
     *     
     */
    public void setNotDomesticCurrency(NotDomesticCurrency value) {
        this.notDomesticCurrency = value;
    }

    /**
     * Gets the value of the notDomesticLaw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotDomesticLaw() {
        return notDomesticLaw;
    }

    /**
     * Sets the value of the notDomesticLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotDomesticLaw(Boolean value) {
        this.notDomesticLaw = value;
    }

    /**
     * Gets the value of the listed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListed() {
        return listed;
    }

    /**
     * Sets the value of the listed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListed(Boolean value) {
        this.listed = value;
    }

    /**
     * Gets the value of the notDomesticIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotDomesticIssuance() {
        return notDomesticIssuance;
    }

    /**
     * Sets the value of the notDomesticIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotDomesticIssuance(Boolean value) {
        this.notDomesticIssuance = value;
    }

    /**
     * Gets the value of the fullFaithAndCreditObLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullFaithAndCreditObLiability() {
        return fullFaithAndCreditObLiability;
    }

    /**
     * Sets the value of the fullFaithAndCreditObLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullFaithAndCreditObLiability(Boolean value) {
        this.fullFaithAndCreditObLiability = value;
    }

    /**
     * Gets the value of the generalFundObligationLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeneralFundObligationLiability() {
        return generalFundObligationLiability;
    }

    /**
     * Sets the value of the generalFundObligationLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneralFundObligationLiability(Boolean value) {
        this.generalFundObligationLiability = value;
    }

    /**
     * Gets the value of the revenueObligationLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevenueObligationLiability() {
        return revenueObligationLiability;
    }

    /**
     * Sets the value of the revenueObligationLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevenueObligationLiability(Boolean value) {
        this.revenueObligationLiability = value;
    }

    /**
     * Gets the value of the notContingent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotContingent() {
        return notContingent;
    }

    /**
     * Sets the value of the notContingent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotContingent(Boolean value) {
        this.notContingent = value;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcluded(String value) {
        this.excluded = value;
    }

    /**
     * Gets the value of the othReferenceEntityObligations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthReferenceEntityObligations() {
        return othReferenceEntityObligations;
    }

    /**
     * Sets the value of the othReferenceEntityObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthReferenceEntityObligations(String value) {
        this.othReferenceEntityObligations = value;
    }

    /**
     * Gets the value of the designatedPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Lien }
     *     
     */
    public Lien getDesignatedPriority() {
        return designatedPriority;
    }

    /**
     * Sets the value of the designatedPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lien }
     *     
     */
    public void setDesignatedPriority(Lien value) {
        this.designatedPriority = value;
    }

    /**
     * Gets the value of the cashSettlementOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashSettlementOnly() {
        return cashSettlementOnly;
    }

    /**
     * Sets the value of the cashSettlementOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashSettlementOnly(Boolean value) {
        this.cashSettlementOnly = value;
    }

    /**
     * Gets the value of the deliveryOfCommitments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryOfCommitments() {
        return deliveryOfCommitments;
    }

    /**
     * Sets the value of the deliveryOfCommitments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryOfCommitments(Boolean value) {
        this.deliveryOfCommitments = value;
    }

    /**
     * Gets the value of the continuity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinuity() {
        return continuity;
    }

    /**
     * Sets the value of the continuity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuity(Boolean value) {
        this.continuity = value;
    }

}
