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
 * Floating Payment Leg of a Dividend Swap.
 * 
 * <p>Java class for DividendLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}DirectionalLegUnderlyer">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}DeclaredCashAndCashEquivalentDividendPercentage.model"/>
 *         &lt;element name="dividendPeriod" type="{http://www.fpml.org/FpML-5/reporting}DividendPeriodPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialDividends" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="materialDividend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendLeg", propOrder = {
    "declaredCashDividendPercentage",
    "declaredCashEquivalentDividendPercentage",
    "dividendPeriod",
    "specialDividends",
    "materialDividend"
})
public class DividendLeg
    extends DirectionalLegUnderlyer
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigDecimal declaredCashDividendPercentage;
    protected BigDecimal declaredCashEquivalentDividendPercentage;
    protected List<DividendPeriodPayment> dividendPeriod;
    protected Boolean specialDividends;
    protected Boolean materialDividend;

    /**
     * Gets the value of the declaredCashDividendPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaredCashDividendPercentage() {
        return declaredCashDividendPercentage;
    }

    /**
     * Sets the value of the declaredCashDividendPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaredCashDividendPercentage(BigDecimal value) {
        this.declaredCashDividendPercentage = value;
    }

    /**
     * Gets the value of the declaredCashEquivalentDividendPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaredCashEquivalentDividendPercentage() {
        return declaredCashEquivalentDividendPercentage;
    }

    /**
     * Sets the value of the declaredCashEquivalentDividendPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaredCashEquivalentDividendPercentage(BigDecimal value) {
        this.declaredCashEquivalentDividendPercentage = value;
    }

    /**
     * Gets the value of the dividendPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dividendPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDividendPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DividendPeriodPayment }
     * 
     * 
     */
    public List<DividendPeriodPayment> getDividendPeriod() {
        if (dividendPeriod == null) {
            dividendPeriod = new ArrayList<DividendPeriodPayment>();
        }
        return this.dividendPeriod;
    }

    /**
     * Gets the value of the specialDividends property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialDividends() {
        return specialDividends;
    }

    /**
     * Sets the value of the specialDividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialDividends(Boolean value) {
        this.specialDividends = value;
    }

    /**
     * Gets the value of the materialDividend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaterialDividend() {
        return materialDividend;
    }

    /**
     * Sets the value of the materialDividend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaterialDividend(Boolean value) {
        this.materialDividend = value;
    }

}
