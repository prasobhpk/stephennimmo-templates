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
 * <p>Java class for ProposedCollateralResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposedCollateralResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proposalApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="collateralResponseReason" type="{http://www.fpml.org/FpML-5/reporting}CollateralResponseReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expectedCollateral" type="{http://www.fpml.org/FpML-5/reporting}ExpectedCollateralDeliveryReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposedCollateralResponse", propOrder = {
    "proposalApproved",
    "collateralResponseReason",
    "expectedCollateral"
})
public class ProposedCollateralResponse implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean proposalApproved;
    protected List<CollateralResponseReason> collateralResponseReason;
    protected ExpectedCollateralDeliveryReturn expectedCollateral;

    /**
     * Gets the value of the proposalApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProposalApproved() {
        return proposalApproved;
    }

    /**
     * Sets the value of the proposalApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProposalApproved(Boolean value) {
        this.proposalApproved = value;
    }

    /**
     * Gets the value of the collateralResponseReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateralResponseReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateralResponseReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralResponseReason }
     * 
     * 
     */
    public List<CollateralResponseReason> getCollateralResponseReason() {
        if (collateralResponseReason == null) {
            collateralResponseReason = new ArrayList<CollateralResponseReason>();
        }
        return this.collateralResponseReason;
    }

    /**
     * Gets the value of the expectedCollateral property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateralDeliveryReturn }
     *     
     */
    public ExpectedCollateralDeliveryReturn getExpectedCollateral() {
        return expectedCollateral;
    }

    /**
     * Sets the value of the expectedCollateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateralDeliveryReturn }
     *     
     */
    public void setExpectedCollateral(ExpectedCollateralDeliveryReturn value) {
        this.expectedCollateral = value;
    }

}
