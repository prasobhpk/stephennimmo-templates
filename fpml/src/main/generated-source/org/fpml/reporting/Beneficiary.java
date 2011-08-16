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
 * A type defining the beneficiary of the funds.
 * 
 * <p>Java class for Beneficiary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Beneficiary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}RoutingIdentification.model"/>
 *         &lt;element name="beneficiaryPartyReference" type="{http://www.fpml.org/FpML-5/reporting}PartyReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Beneficiary", propOrder = {
    "routingIds",
    "routingExplicitDetails",
    "routingIdsAndExplicitDetails",
    "beneficiaryPartyReference"
})
public class Beneficiary
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected RoutingIds routingIds;
    protected RoutingExplicitDetails routingExplicitDetails;
    protected RoutingIdsAndExplicitDetails routingIdsAndExplicitDetails;
    protected PartyReference beneficiaryPartyReference;

    /**
     * Gets the value of the routingIds property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingIds }
     *     
     */
    public RoutingIds getRoutingIds() {
        return routingIds;
    }

    /**
     * Sets the value of the routingIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingIds }
     *     
     */
    public void setRoutingIds(RoutingIds value) {
        this.routingIds = value;
    }

    /**
     * Gets the value of the routingExplicitDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingExplicitDetails }
     *     
     */
    public RoutingExplicitDetails getRoutingExplicitDetails() {
        return routingExplicitDetails;
    }

    /**
     * Sets the value of the routingExplicitDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingExplicitDetails }
     *     
     */
    public void setRoutingExplicitDetails(RoutingExplicitDetails value) {
        this.routingExplicitDetails = value;
    }

    /**
     * Gets the value of the routingIdsAndExplicitDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingIdsAndExplicitDetails }
     *     
     */
    public RoutingIdsAndExplicitDetails getRoutingIdsAndExplicitDetails() {
        return routingIdsAndExplicitDetails;
    }

    /**
     * Sets the value of the routingIdsAndExplicitDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingIdsAndExplicitDetails }
     *     
     */
    public void setRoutingIdsAndExplicitDetails(RoutingIdsAndExplicitDetails value) {
        this.routingIdsAndExplicitDetails = value;
    }

    /**
     * Gets the value of the beneficiaryPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBeneficiaryPartyReference() {
        return beneficiaryPartyReference;
    }

    /**
     * Sets the value of the beneficiaryPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBeneficiaryPartyReference(PartyReference value) {
        this.beneficiaryPartyReference = value;
    }

}