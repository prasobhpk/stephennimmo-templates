//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining Fx Features.
 * 
 * <p>Java class for FxFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceCurrency" type="{http://www.fpml.org/FpML-5/confirmation}IdentifiedCurrency"/>
 *         &lt;choice>
 *           &lt;element name="composite" type="{http://www.fpml.org/FpML-5/confirmation}Composite"/>
 *           &lt;element name="quanto" type="{http://www.fpml.org/FpML-5/confirmation}Quanto"/>
 *           &lt;element name="crossCurrency" type="{http://www.fpml.org/FpML-5/confirmation}Composite"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxFeature", propOrder = {
    "referenceCurrency",
    "composite",
    "quanto",
    "crossCurrency"
})
public class FxFeature
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected IdentifiedCurrency referenceCurrency;
    protected Composite composite;
    protected Quanto quanto;
    protected Composite crossCurrency;

    /**
     * Gets the value of the referenceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public IdentifiedCurrency getReferenceCurrency() {
        return referenceCurrency;
    }

    /**
     * Sets the value of the referenceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public void setReferenceCurrency(IdentifiedCurrency value) {
        this.referenceCurrency = value;
    }

    /**
     * Gets the value of the composite property.
     * 
     * @return
     *     possible object is
     *     {@link Composite }
     *     
     */
    public Composite getComposite() {
        return composite;
    }

    /**
     * Sets the value of the composite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Composite }
     *     
     */
    public void setComposite(Composite value) {
        this.composite = value;
    }

    /**
     * Gets the value of the quanto property.
     * 
     * @return
     *     possible object is
     *     {@link Quanto }
     *     
     */
    public Quanto getQuanto() {
        return quanto;
    }

    /**
     * Sets the value of the quanto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quanto }
     *     
     */
    public void setQuanto(Quanto value) {
        this.quanto = value;
    }

    /**
     * Gets the value of the crossCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Composite }
     *     
     */
    public Composite getCrossCurrency() {
        return crossCurrency;
    }

    /**
     * Sets the value of the crossCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Composite }
     *     
     */
    public void setCrossCurrency(Composite value) {
        this.crossCurrency = value;
    }

}
