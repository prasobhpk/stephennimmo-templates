//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A set of index values that identify a pricing data point. For example: (strike = 17%, expiration = 6M, term = 1Y.
 * 
 * <p>Java class for PricingDataPointCoordinate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingDataPointCoordinate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}PricingStructureIndex.model" maxOccurs="unbounded"/>
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
@XmlType(name = "PricingDataPointCoordinate", propOrder = {
    "pricingStructureIndexModel"
})
public class PricingDataPointCoordinate implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "expiration", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class),
        @XmlElementRef(name = "term", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class),
        @XmlElementRef(name = "strike", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class),
        @XmlElementRef(name = "generic", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> pricingStructureIndexModel;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the pricingStructureIndexModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingStructureIndexModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingStructureIndexModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TimeDimension }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeDimension }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericDimension }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getPricingStructureIndexModel() {
        if (pricingStructureIndexModel == null) {
            pricingStructureIndexModel = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.pricingStructureIndexModel;
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
