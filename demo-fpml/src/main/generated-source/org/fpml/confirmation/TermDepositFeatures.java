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
 * <p>Java class for TermDepositFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermDepositFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dualCurrency" type="{http://www.fpml.org/FpML-5/confirmation}DualCurrencyFeature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermDepositFeatures", propOrder = {
    "dualCurrency"
})
public class TermDepositFeatures
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected DualCurrencyFeature dualCurrency;

    /**
     * Gets the value of the dualCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link DualCurrencyFeature }
     *     
     */
    public DualCurrencyFeature getDualCurrency() {
        return dualCurrency;
    }

    /**
     * Sets the value of the dualCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DualCurrencyFeature }
     *     
     */
    public void setDualCurrency(DualCurrencyFeature value) {
        this.dualCurrency = value;
    }

}
