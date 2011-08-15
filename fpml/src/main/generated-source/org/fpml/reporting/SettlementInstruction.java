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
import javax.xml.bind.annotation.XmlType;


/**
 * A type that models a complete instruction for settling a currency payment, including the settlement method to be used, the correspondent bank, any intermediary banks and the ultimate beneficary.
 * 
 * <p>Java class for SettlementInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementInstruction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementMethod" type="{http://www.fpml.org/FpML-5/reporting}SettlementMethod" minOccurs="0"/>
 *         &lt;element name="correspondentInformation" type="{http://www.fpml.org/FpML-5/reporting}CorrespondentInformation" minOccurs="0"/>
 *         &lt;element name="intermediaryInformation" type="{http://www.fpml.org/FpML-5/reporting}IntermediaryInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="beneficiaryBank" type="{http://www.fpml.org/FpML-5/reporting}Beneficiary" minOccurs="0"/>
 *         &lt;element name="beneficiary" type="{http://www.fpml.org/FpML-5/reporting}Beneficiary" minOccurs="0"/>
 *         &lt;element name="depositoryPartyReference" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *         &lt;element name="splitSettlement" type="{http://www.fpml.org/FpML-5/reporting}SplitSettlement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstruction", propOrder = {
    "settlementMethod",
    "correspondentInformation",
    "intermediaryInformation",
    "beneficiaryBank",
    "beneficiary",
    "depositoryPartyReference",
    "splitSettlement"
})
public class SettlementInstruction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected SettlementMethod settlementMethod;
    protected CorrespondentInformation correspondentInformation;
    protected List<IntermediaryInformation> intermediaryInformation;
    protected Beneficiary beneficiaryBank;
    protected Beneficiary beneficiary;
    protected PartyReference depositoryPartyReference;
    protected List<SplitSettlement> splitSettlement;

    /**
     * Gets the value of the settlementMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementMethod }
     *     
     */
    public SettlementMethod getSettlementMethod() {
        return settlementMethod;
    }

    /**
     * Sets the value of the settlementMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementMethod }
     *     
     */
    public void setSettlementMethod(SettlementMethod value) {
        this.settlementMethod = value;
    }

    /**
     * Gets the value of the correspondentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondentInformation }
     *     
     */
    public CorrespondentInformation getCorrespondentInformation() {
        return correspondentInformation;
    }

    /**
     * Sets the value of the correspondentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondentInformation }
     *     
     */
    public void setCorrespondentInformation(CorrespondentInformation value) {
        this.correspondentInformation = value;
    }

    /**
     * Gets the value of the intermediaryInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intermediaryInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntermediaryInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntermediaryInformation }
     * 
     * 
     */
    public List<IntermediaryInformation> getIntermediaryInformation() {
        if (intermediaryInformation == null) {
            intermediaryInformation = new ArrayList<IntermediaryInformation>();
        }
        return this.intermediaryInformation;
    }

    /**
     * Gets the value of the beneficiaryBank property.
     * 
     * @return
     *     possible object is
     *     {@link Beneficiary }
     *     
     */
    public Beneficiary getBeneficiaryBank() {
        return beneficiaryBank;
    }

    /**
     * Sets the value of the beneficiaryBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beneficiary }
     *     
     */
    public void setBeneficiaryBank(Beneficiary value) {
        this.beneficiaryBank = value;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link Beneficiary }
     *     
     */
    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets the value of the beneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beneficiary }
     *     
     */
    public void setBeneficiary(Beneficiary value) {
        this.beneficiary = value;
    }

    /**
     * Gets the value of the depositoryPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getDepositoryPartyReference() {
        return depositoryPartyReference;
    }

    /**
     * Sets the value of the depositoryPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setDepositoryPartyReference(PartyReference value) {
        this.depositoryPartyReference = value;
    }

    /**
     * Gets the value of the splitSettlement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitSettlement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitSettlement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitSettlement }
     * 
     * 
     */
    public List<SplitSettlement> getSplitSettlement() {
        if (splitSettlement == null) {
            splitSettlement = new ArrayList<SplitSettlement>();
        }
        return this.splitSettlement;
    }

}
