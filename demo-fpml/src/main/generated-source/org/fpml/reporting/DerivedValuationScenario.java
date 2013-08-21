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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A valuation scenario that is derived from another valuation scenario.
 * 
 * <p>Java class for DerivedValuationScenario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivedValuationScenario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseValuationScenario" type="{http://www.fpml.org/FpML-5/reporting}ValuationScenarioReference" minOccurs="0"/>
 *         &lt;element name="valuationDate" type="{http://www.fpml.org/FpML-5/reporting}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="marketReference" type="{http://www.fpml.org/FpML-5/reporting}MarketReference" minOccurs="0"/>
 *         &lt;element name="shift" type="{http://www.fpml.org/FpML-5/reporting}PricingParameterShift" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedValuationScenario", propOrder = {
    "name",
    "baseValuationScenario",
    "valuationDate",
    "marketReference",
    "shift"
})
public class DerivedValuationScenario
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String name;
    protected ValuationScenarioReference baseValuationScenario;
    protected IdentifiedDate valuationDate;
    protected MarketReference marketReference;
    protected List<PricingParameterShift> shift;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the baseValuationScenario property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationScenarioReference }
     *     
     */
    public ValuationScenarioReference getBaseValuationScenario() {
        return baseValuationScenario;
    }

    /**
     * Sets the value of the baseValuationScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationScenarioReference }
     *     
     */
    public void setBaseValuationScenario(ValuationScenarioReference value) {
        this.baseValuationScenario = value;
    }

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setValuationDate(IdentifiedDate value) {
        this.valuationDate = value;
    }

    /**
     * Gets the value of the marketReference property.
     * 
     * @return
     *     possible object is
     *     {@link MarketReference }
     *     
     */
    public MarketReference getMarketReference() {
        return marketReference;
    }

    /**
     * Sets the value of the marketReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketReference }
     *     
     */
    public void setMarketReference(MarketReference value) {
        this.marketReference = value;
    }

    /**
     * Gets the value of the shift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingParameterShift }
     * 
     * 
     */
    public List<PricingParameterShift> getShift() {
        if (shift == null) {
            shift = new ArrayList<PricingParameterShift>();
        }
        return this.shift;
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