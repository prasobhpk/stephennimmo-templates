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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Message for cancellation of payments to be reconciled. A message sent to indicate that previously asserted TradeCashFlows are no longer in effect. For example, this may be caused by a trade's being terminated or assigned after a TradeCashflowsAsserted message has been sent but before the payment date.
 * 
 * <p>Java class for NettedTradeCashflowsRetracted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NettedTradeCashflowsRetracted">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}NonCorrectableRequestMessage">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}IdAndNettedTradeCashflows.model"/>
 *         &lt;element name="matchId" type="{http://www.fpml.org/FpML-5/reporting}MatchId" minOccurs="0"/>
 *         &lt;element name="party" type="{http://www.fpml.org/FpML-5/reporting}Party" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettedTradeCashflowsRetracted", propOrder = {
    "tradeCashflowsId",
    "tradeIdentifyingItems",
    "adjustedPaymentDate",
    "payment",
    "matchId",
    "party"
})
public class NettedTradeCashflowsRetracted
    extends NonCorrectableRequestMessage
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected TradeCashflowsId tradeCashflowsId;
    protected List<TradeIdentifyingItems> tradeIdentifyingItems;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adjustedPaymentDate;
    protected List<PaymentMatching> payment;
    protected MatchId matchId;
    protected List<Party> party;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifyingItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifyingItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifyingItems }
     * 
     * 
     */
    public List<TradeIdentifyingItems> getTradeIdentifyingItems() {
        if (tradeIdentifyingItems == null) {
            tradeIdentifyingItems = new ArrayList<TradeIdentifyingItems>();
        }
        return this.tradeIdentifyingItems;
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
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

}
