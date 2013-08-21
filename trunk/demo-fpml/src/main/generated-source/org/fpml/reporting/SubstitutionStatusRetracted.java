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
 * <p>Java class for SubstitutionStatusRetracted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstitutionStatusRetracted">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}NonCorrectableRequestMessage">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="substitutionIssuerPartyReference" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *         &lt;element name="substitutionReceiverPartyReference" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}PartiesAndAccounts.model" minOccurs="0"/>
 *         &lt;element name="collateralRetractionReason" type="{http://www.fpml.org/FpML-5/reporting}CollateralRetractionReason" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstitutionStatusRetracted", propOrder = {
    "substitutionIssuerPartyReference",
    "substitutionReceiverPartyReference",
    "party",
    "account",
    "collateralRetractionReason"
})
public class SubstitutionStatusRetracted
    extends NonCorrectableRequestMessage
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PartyReference substitutionIssuerPartyReference;
    protected PartyReference substitutionReceiverPartyReference;
    protected List<Party> party;
    protected List<Account> account;
    protected List<CollateralRetractionReason> collateralRetractionReason;

    /**
     * Gets the value of the substitutionIssuerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getSubstitutionIssuerPartyReference() {
        return substitutionIssuerPartyReference;
    }

    /**
     * Sets the value of the substitutionIssuerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setSubstitutionIssuerPartyReference(PartyReference value) {
        this.substitutionIssuerPartyReference = value;
    }

    /**
     * Gets the value of the substitutionReceiverPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getSubstitutionReceiverPartyReference() {
        return substitutionReceiverPartyReference;
    }

    /**
     * Sets the value of the substitutionReceiverPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setSubstitutionReceiverPartyReference(PartyReference value) {
        this.substitutionReceiverPartyReference = value;
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

    /**
     * Gets the value of the collateralRetractionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateralRetractionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateralRetractionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralRetractionReason }
     * 
     * 
     */
    public List<CollateralRetractionReason> getCollateralRetractionReason() {
        if (collateralRetractionReason == null) {
            collateralRetractionReason = new ArrayList<CollateralRetractionReason>();
        }
        return this.collateralRetractionReason;
    }

}