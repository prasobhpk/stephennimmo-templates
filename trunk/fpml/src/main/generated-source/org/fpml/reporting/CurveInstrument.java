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
 * Abstract base class for instruments intended to be used primarily for building curves.
 * 
 * <p>Java class for CurveInstrument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurveInstrument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}IdentifiedAsset">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://www.fpml.org/FpML-5/reporting}Currency" minOccurs="0"/>
 *         &lt;element name="exchangeId" type="{http://www.fpml.org/FpML-5/reporting}ExchangeId" minOccurs="0"/>
 *         &lt;element name="clearanceSystem" type="{http://www.fpml.org/FpML-5/reporting}ClearanceSystem" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://www.fpml.org/FpML-5/reporting}ProductReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveInstrument", propOrder = {
    "currency",
    "exchangeId",
    "clearanceSystem",
    "definition"
})
public abstract class CurveInstrument
    extends IdentifiedAsset
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Currency currency;
    protected ExchangeId exchangeId;
    protected ClearanceSystem clearanceSystem;
    protected ProductReference definition;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the exchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeId }
     *     
     */
    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeId }
     *     
     */
    public void setExchangeId(ExchangeId value) {
        this.exchangeId = value;
    }

    /**
     * Gets the value of the clearanceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ClearanceSystem }
     *     
     */
    public ClearanceSystem getClearanceSystem() {
        return clearanceSystem;
    }

    /**
     * Sets the value of the clearanceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceSystem }
     *     
     */
    public void setClearanceSystem(ClearanceSystem value) {
        this.clearanceSystem = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReference }
     *     
     */
    public ProductReference getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReference }
     *     
     */
    public void setDefinition(ProductReference value) {
        this.definition = value;
    }

}