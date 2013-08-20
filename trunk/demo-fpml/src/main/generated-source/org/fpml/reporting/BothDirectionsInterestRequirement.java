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
 * <p>Java class for BothDirectionsInterestRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BothDirectionsInterestRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="netTreatment" type="{http://www.fpml.org/FpML-5/reporting}NetTreatment" minOccurs="0"/>
 *           &lt;element name="grossTreatment" type="{http://www.fpml.org/FpML-5/reporting}GrossTreatment" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="interestAccrued" type="{http://www.fpml.org/FpML-5/reporting}InterestAccrued" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BothDirectionsInterestRequirement", propOrder = {
    "netTreatment",
    "grossTreatment",
    "interestAccrued"
})
public class BothDirectionsInterestRequirement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected NetTreatment netTreatment;
    protected GrossTreatment grossTreatment;
    protected List<InterestAccrued> interestAccrued;

    /**
     * Gets the value of the netTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link NetTreatment }
     *     
     */
    public NetTreatment getNetTreatment() {
        return netTreatment;
    }

    /**
     * Sets the value of the netTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetTreatment }
     *     
     */
    public void setNetTreatment(NetTreatment value) {
        this.netTreatment = value;
    }

    /**
     * Gets the value of the grossTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link GrossTreatment }
     *     
     */
    public GrossTreatment getGrossTreatment() {
        return grossTreatment;
    }

    /**
     * Sets the value of the grossTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossTreatment }
     *     
     */
    public void setGrossTreatment(GrossTreatment value) {
        this.grossTreatment = value;
    }

    /**
     * Gets the value of the interestAccrued property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestAccrued property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestAccrued().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestAccrued }
     * 
     * 
     */
    public List<InterestAccrued> getInterestAccrued() {
        if (interestAccrued == null) {
            interestAccrued = new ArrayList<InterestAccrued>();
        }
        return this.interestAccrued;
    }

}
