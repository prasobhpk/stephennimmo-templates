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
 * Specifies the principal exchange amount, either by explicitly defining it, or by point to an amount defined somewhere else in the swap document.
 * 
 * <p>Java class for PrincipalExchangeAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalExchangeAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="amountRelativeTo" type="{http://www.fpml.org/FpML-5/confirmation}AmountReference"/>
 *         &lt;element name="determinationMethod" type="{http://www.fpml.org/FpML-5/confirmation}DeterminationMethod"/>
 *         &lt;element name="principalAmount" type="{http://www.fpml.org/FpML-5/confirmation}NonNegativeMoney"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalExchangeAmount", propOrder = {
    "amountRelativeTo",
    "determinationMethod",
    "principalAmount"
})
public class PrincipalExchangeAmount
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AmountReference amountRelativeTo;
    protected DeterminationMethod determinationMethod;
    protected NonNegativeMoney principalAmount;

    /**
     * Gets the value of the amountRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link AmountReference }
     *     
     */
    public AmountReference getAmountRelativeTo() {
        return amountRelativeTo;
    }

    /**
     * Sets the value of the amountRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountReference }
     *     
     */
    public void setAmountRelativeTo(AmountReference value) {
        this.amountRelativeTo = value;
    }

    /**
     * Gets the value of the determinationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getDeterminationMethod() {
        return determinationMethod;
    }

    /**
     * Sets the value of the determinationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setDeterminationMethod(DeterminationMethod value) {
        this.determinationMethod = value;
    }

    /**
     * Gets the value of the principalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getPrincipalAmount() {
        return principalAmount;
    }

    /**
     * Sets the value of the principalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setPrincipalAmount(NonNegativeMoney value) {
        this.principalAmount = value;
    }

}