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
import javax.xml.bind.annotation.XmlType;


/**
 * The commodity option premium payable by the buyer to the seller.
 * 
 * <p>Java class for CommodityPremium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityPremium">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}NonNegativePayment">
 *       &lt;sequence>
 *         &lt;element name="premiumPerUnit" type="{http://www.fpml.org/FpML-5/confirmation}NonNegativeMoney" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityPremium", propOrder = {
    "premiumPerUnit"
})
public class CommodityPremium
    extends NonNegativePayment
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected NonNegativeMoney premiumPerUnit;

    /**
     * Gets the value of the premiumPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getPremiumPerUnit() {
        return premiumPerUnit;
    }

    /**
     * Sets the value of the premiumPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setPremiumPerUnit(NonNegativeMoney value) {
        this.premiumPerUnit = value;
    }

}
