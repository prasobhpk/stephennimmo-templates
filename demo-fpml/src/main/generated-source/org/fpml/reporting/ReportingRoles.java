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
 * The roles of the parties in reporting information such as positions.
 * 
 * <p>Java class for ReportingRoles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingRoles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseParty" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *         &lt;element name="baseAccount" type="{http://www.fpml.org/FpML-5/reporting}AccountReference" minOccurs="0"/>
 *         &lt;element name="activityProvider" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *         &lt;element name="positionProvider" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *         &lt;element name="valuationProvider" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRoles", propOrder = {
    "baseParty",
    "baseAccount",
    "activityProvider",
    "positionProvider",
    "valuationProvider"
})
public class ReportingRoles
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PartyReference baseParty;
    protected AccountReference baseAccount;
    protected PartyReference activityProvider;
    protected PartyReference positionProvider;
    protected PartyReference valuationProvider;

    /**
     * Gets the value of the baseParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBaseParty() {
        return baseParty;
    }

    /**
     * Sets the value of the baseParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBaseParty(PartyReference value) {
        this.baseParty = value;
    }

    /**
     * Gets the value of the baseAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getBaseAccount() {
        return baseAccount;
    }

    /**
     * Sets the value of the baseAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setBaseAccount(AccountReference value) {
        this.baseAccount = value;
    }

    /**
     * Gets the value of the activityProvider property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getActivityProvider() {
        return activityProvider;
    }

    /**
     * Sets the value of the activityProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setActivityProvider(PartyReference value) {
        this.activityProvider = value;
    }

    /**
     * Gets the value of the positionProvider property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPositionProvider() {
        return positionProvider;
    }

    /**
     * Sets the value of the positionProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPositionProvider(PartyReference value) {
        this.positionProvider = value;
    }

    /**
     * Gets the value of the valuationProvider property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getValuationProvider() {
        return valuationProvider;
    }

    /**
     * Sets the value of the valuationProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setValuationProvider(PartyReference value) {
        this.valuationProvider = value;
    }

}
