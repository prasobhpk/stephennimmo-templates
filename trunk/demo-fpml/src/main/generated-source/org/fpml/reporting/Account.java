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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A generic account that represents any party's account at another party. Parties may be identified by the account at another party.
 * 
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element name="accountId" type="{http://www.fpml.org/FpML-5/reporting}AccountId" minOccurs="0"/>
 *           &lt;element name="accountName" type="{http://www.fpml.org/FpML-5/reporting}AccountName" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="accountBeneficiary" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *             &lt;element name="servicingParty" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountIdAndAccountName",
    "accountBeneficiary",
    "servicingParty"
})
public class Account implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "accountName", type = AccountName.class),
        @XmlElement(name = "accountId", type = AccountId.class)
    })
    protected List<Serializable> accountIdAndAccountName;
    protected PartyReference accountBeneficiary;
    protected PartyReference servicingParty;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the accountIdAndAccountName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountIdAndAccountName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountIdAndAccountName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountName }
     * {@link AccountId }
     * 
     * 
     */
    public List<Serializable> getAccountIdAndAccountName() {
        if (accountIdAndAccountName == null) {
            accountIdAndAccountName = new ArrayList<Serializable>();
        }
        return this.accountIdAndAccountName;
    }

    /**
     * Gets the value of the accountBeneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getAccountBeneficiary() {
        return accountBeneficiary;
    }

    /**
     * Sets the value of the accountBeneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setAccountBeneficiary(PartyReference value) {
        this.accountBeneficiary = value;
    }

    /**
     * Gets the value of the servicingParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getServicingParty() {
        return servicingParty;
    }

    /**
     * Sets the value of the servicingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setServicingParty(PartyReference value) {
        this.servicingParty = value;
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
