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
 * A type defining either a spot/forward or forward/forward FX swap transaction.
 * 
 * <p>Java class for FxSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Product">
 *       &lt;sequence>
 *         &lt;element name="nearLeg" type="{http://www.fpml.org/FpML-5/confirmation}FxSwapLeg"/>
 *         &lt;element name="farLeg" type="{http://www.fpml.org/FpML-5/confirmation}FxSwapLeg"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxSwap", propOrder = {
    "nearLeg",
    "farLeg"
})
public class FxSwap
    extends Product
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected FxSwapLeg nearLeg;
    @XmlElement(required = true)
    protected FxSwapLeg farLeg;

    /**
     * Gets the value of the nearLeg property.
     * 
     * @return
     *     possible object is
     *     {@link FxSwapLeg }
     *     
     */
    public FxSwapLeg getNearLeg() {
        return nearLeg;
    }

    /**
     * Sets the value of the nearLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSwapLeg }
     *     
     */
    public void setNearLeg(FxSwapLeg value) {
        this.nearLeg = value;
    }

    /**
     * Gets the value of the farLeg property.
     * 
     * @return
     *     possible object is
     *     {@link FxSwapLeg }
     *     
     */
    public FxSwapLeg getFarLeg() {
        return farLeg;
    }

    /**
     * Sets the value of the farLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSwapLeg }
     *     
     */
    public void setFarLeg(FxSwapLeg value) {
        this.farLeg = value;
    }

}