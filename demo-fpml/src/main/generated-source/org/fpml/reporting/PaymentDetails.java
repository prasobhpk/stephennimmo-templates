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
import javax.xml.bind.annotation.XmlType;


/**
 * Details on the referenced payment. e.g. Its cashflow components, settlement details.
 * 
 * <p>Java class for PaymentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentReference" type="{http://www.fpml.org/FpML-5/reporting}PaymentReference" minOccurs="0"/>
 *         &lt;element name="grossCashflow" type="{http://www.fpml.org/FpML-5/reporting}GrossCashflow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="settlementInformation" type="{http://www.fpml.org/FpML-5/reporting}SettlementInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetails", propOrder = {
    "paymentReference",
    "grossCashflow",
    "settlementInformation"
})
public class PaymentDetails
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PaymentReference paymentReference;
    protected List<GrossCashflow> grossCashflow;
    protected SettlementInformation settlementInformation;

    /**
     * Gets the value of the paymentReference property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReference }
     *     
     */
    public PaymentReference getPaymentReference() {
        return paymentReference;
    }

    /**
     * Sets the value of the paymentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReference }
     *     
     */
    public void setPaymentReference(PaymentReference value) {
        this.paymentReference = value;
    }

    /**
     * Gets the value of the grossCashflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossCashflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossCashflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrossCashflow }
     * 
     * 
     */
    public List<GrossCashflow> getGrossCashflow() {
        if (grossCashflow == null) {
            grossCashflow = new ArrayList<GrossCashflow>();
        }
        return this.grossCashflow;
    }

    /**
     * Gets the value of the settlementInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInformation }
     *     
     */
    public SettlementInformation getSettlementInformation() {
        return settlementInformation;
    }

    /**
     * Sets the value of the settlementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInformation }
     *     
     */
    public void setSettlementInformation(SettlementInformation value) {
        this.settlementInformation = value;
    }

}
