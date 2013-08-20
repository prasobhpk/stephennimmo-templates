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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * "Other side's" cashflow that meets the minimimum matching criteria and is proposed as match to the cash flow that is being asserted.
 * 
 * <p>Java class for TradeCashflowsProposedMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeCashflowsProposedMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}IdAndTradeCashflows.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}ProposedMatch.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCashflowsProposedMatch", propOrder = {
    "tradeCashflowsId",
    "tradeIdentifyingItems",
    "adjustedPaymentDate",
    "payment",
    "matchId",
    "difference",
    "matchScore"
})
public class TradeCashflowsProposedMatch
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected TradeCashflowsId tradeCashflowsId;
    protected TradeIdentifyingItems tradeIdentifyingItems;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adjustedPaymentDate;
    protected List<PaymentMatching> payment;
    protected MatchId matchId;
    protected List<TradeDifference> difference;
    protected BigDecimal matchScore;

    /**
     * Gets the value of the tradeCashflowsId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCashflowsId }
     *     
     */
    public TradeCashflowsId getTradeCashflowsId() {
        return tradeCashflowsId;
    }

    /**
     * Sets the value of the tradeCashflowsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCashflowsId }
     *     
     */
    public void setTradeCashflowsId(TradeCashflowsId value) {
        this.tradeCashflowsId = value;
    }

    /**
     * Gets the value of the tradeIdentifyingItems property.
     * 
     * @return
     *     possible object is
     *     {@link TradeIdentifyingItems }
     *     
     */
    public TradeIdentifyingItems getTradeIdentifyingItems() {
        return tradeIdentifyingItems;
    }

    /**
     * Sets the value of the tradeIdentifyingItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeIdentifyingItems }
     *     
     */
    public void setTradeIdentifyingItems(TradeIdentifyingItems value) {
        this.tradeIdentifyingItems = value;
    }

    /**
     * Gets the value of the adjustedPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustedPaymentDate() {
        return adjustedPaymentDate;
    }

    /**
     * Sets the value of the adjustedPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustedPaymentDate(XMLGregorianCalendar value) {
        this.adjustedPaymentDate = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMatching }
     * 
     * 
     */
    public List<PaymentMatching> getPayment() {
        if (payment == null) {
            payment = new ArrayList<PaymentMatching>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the matchId property.
     * 
     * @return
     *     possible object is
     *     {@link MatchId }
     *     
     */
    public MatchId getMatchId() {
        return matchId;
    }

    /**
     * Sets the value of the matchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchId }
     *     
     */
    public void setMatchId(MatchId value) {
        this.matchId = value;
    }

    /**
     * Gets the value of the difference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the difference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDifference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeDifference }
     * 
     * 
     */
    public List<TradeDifference> getDifference() {
        if (difference == null) {
            difference = new ArrayList<TradeDifference>();
        }
        return this.difference;
    }

    /**
     * Gets the value of the matchScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchScore() {
        return matchScore;
    }

    /**
     * Sets the value of the matchScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchScore(BigDecimal value) {
        this.matchScore = value;
    }

}
