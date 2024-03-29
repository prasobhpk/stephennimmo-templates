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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the underlyer features of a basket swap. Each of the basket constituents are described through an embedded component, the basketConstituentsType.
 * 
 * <p>Java class for Basket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Basket">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}Asset">
 *       &lt;sequence>
 *         &lt;element name="openUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="basketConstituent" type="{http://www.fpml.org/FpML-5/reporting}BasketConstituent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="basketDivisor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}BasketIdentifier.model" minOccurs="0"/>
 *         &lt;element name="basketCurrency" type="{http://www.fpml.org/FpML-5/reporting}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Basket", propOrder = {
    "openUnits",
    "basketConstituent",
    "basketDivisor",
    "basketName",
    "basketId",
    "basketCurrency"
})
public class Basket
    extends Asset
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigDecimal openUnits;
    protected List<BasketConstituent> basketConstituent;
    protected BigDecimal basketDivisor;
    protected BasketName basketName;
    protected List<BasketId> basketId;
    protected Currency basketCurrency;

    /**
     * Gets the value of the openUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenUnits() {
        return openUnits;
    }

    /**
     * Sets the value of the openUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenUnits(BigDecimal value) {
        this.openUnits = value;
    }

    /**
     * Gets the value of the basketConstituent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basketConstituent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasketConstituent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketConstituent }
     * 
     * 
     */
    public List<BasketConstituent> getBasketConstituent() {
        if (basketConstituent == null) {
            basketConstituent = new ArrayList<BasketConstituent>();
        }
        return this.basketConstituent;
    }

    /**
     * Gets the value of the basketDivisor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasketDivisor() {
        return basketDivisor;
    }

    /**
     * Sets the value of the basketDivisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasketDivisor(BigDecimal value) {
        this.basketDivisor = value;
    }

    /**
     * Gets the value of the basketName property.
     * 
     * @return
     *     possible object is
     *     {@link BasketName }
     *     
     */
    public BasketName getBasketName() {
        return basketName;
    }

    /**
     * Sets the value of the basketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketName }
     *     
     */
    public void setBasketName(BasketName value) {
        this.basketName = value;
    }

    /**
     * Gets the value of the basketId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basketId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasketId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketId }
     * 
     * 
     */
    public List<BasketId> getBasketId() {
        if (basketId == null) {
            basketId = new ArrayList<BasketId>();
        }
        return this.basketId;
    }

    /**
     * Gets the value of the basketCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getBasketCurrency() {
        return basketCurrency;
    }

    /**
     * Sets the value of the basketCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setBasketCurrency(Currency value) {
        this.basketCurrency = value;
    }

}
