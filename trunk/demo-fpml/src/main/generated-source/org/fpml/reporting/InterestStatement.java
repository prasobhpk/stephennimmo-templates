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
 * <p>Java class for InterestStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestStatement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}NotificationMessage">
 *       &lt;sequence>
 *         &lt;element name="issuerPartyReference" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *         &lt;element name="receiverPartyReference" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *         &lt;element name="creditSupportAgreement" type="{http://www.fpml.org/FpML-5/reporting}CreditSupportAgreement" minOccurs="0"/>
 *         &lt;element name="interestRequirement" type="{http://www.fpml.org/FpML-5/reporting}InterestStatementRequirement" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}PartiesAndAccounts.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestStatement", propOrder = {
    "issuerPartyReference",
    "receiverPartyReference",
    "creditSupportAgreement",
    "interestRequirement",
    "comment",
    "party",
    "account"
})
public class InterestStatement
    extends NotificationMessage
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PartyReference issuerPartyReference;
    protected PartyReference receiverPartyReference;
    protected CreditSupportAgreement creditSupportAgreement;
    protected InterestStatementRequirement interestRequirement;
    protected String comment;
    protected List<Party> party;
    protected List<Account> account;

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
     * Gets the value of the receiverPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getReceiverPartyReference() {
        return receiverPartyReference;
    }

    /**
     * Sets the value of the receiverPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setReceiverPartyReference(PartyReference value) {
        this.receiverPartyReference = value;
    }

    /**
     * Gets the value of the creditSupportAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSupportAgreement }
     *     
     */
    public CreditSupportAgreement getCreditSupportAgreement() {
        return creditSupportAgreement;
    }

    /**
     * Sets the value of the creditSupportAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSupportAgreement }
     *     
     */
    public void setCreditSupportAgreement(CreditSupportAgreement value) {
        this.creditSupportAgreement = value;
    }

    /**
     * Gets the value of the interestRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link InterestStatementRequirement }
     *     
     */
    public InterestStatementRequirement getInterestRequirement() {
        return interestRequirement;
    }

    /**
     * Sets the value of the interestRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestStatementRequirement }
     *     
     */
    public void setInterestRequirement(InterestStatementRequirement value) {
        this.interestRequirement = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}
