//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentGranted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentGranted">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}ResponseMessage">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}Events.model" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}PartiesAndAccounts.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentGranted", propOrder = {
    "trade",
    "amendment",
    "increase",
    "termination",
    "novation",
    "optionExercise",
    "optionExpiry",
    "deClear",
    "additionalEvent",
    "party",
    "account"
})
public class ConsentGranted
    extends ResponseMessage
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Trade trade;
    protected TradeAmendmentContent amendment;
    protected TradeNotionalChange increase;
    protected TradeNotionalChange termination;
    protected TradeNovationContent novation;
    protected OptionExercise optionExercise;
    protected List<OptionExpiry> optionExpiry;
    protected DeClear deClear;
    protected Object additionalEvent;
    protected List<Party> party;
    protected List<Account> account;

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setTrade(Trade value) {
        this.trade = value;
    }

    /**
     * Gets the value of the amendment property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAmendmentContent }
     *     
     */
    public TradeAmendmentContent getAmendment() {
        return amendment;
    }

    /**
     * Sets the value of the amendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAmendmentContent }
     *     
     */
    public void setAmendment(TradeAmendmentContent value) {
        this.amendment = value;
    }

    /**
     * Gets the value of the increase property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNotionalChange }
     *     
     */
    public TradeNotionalChange getIncrease() {
        return increase;
    }

    /**
     * Sets the value of the increase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNotionalChange }
     *     
     */
    public void setIncrease(TradeNotionalChange value) {
        this.increase = value;
    }

    /**
     * Gets the value of the termination property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNotionalChange }
     *     
     */
    public TradeNotionalChange getTermination() {
        return termination;
    }

    /**
     * Sets the value of the termination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNotionalChange }
     *     
     */
    public void setTermination(TradeNotionalChange value) {
        this.termination = value;
    }

    /**
     * Gets the value of the novation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNovationContent }
     *     
     */
    public TradeNovationContent getNovation() {
        return novation;
    }

    /**
     * Sets the value of the novation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNovationContent }
     *     
     */
    public void setNovation(TradeNovationContent value) {
        this.novation = value;
    }

    /**
     * Gets the value of the optionExercise property.
     * 
     * @return
     *     possible object is
     *     {@link OptionExercise }
     *     
     */
    public OptionExercise getOptionExercise() {
        return optionExercise;
    }

    /**
     * Sets the value of the optionExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionExercise }
     *     
     */
    public void setOptionExercise(OptionExercise value) {
        this.optionExercise = value;
    }

    /**
     * Gets the value of the optionExpiry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionExpiry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionExpiry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionExpiry }
     * 
     * 
     */
    public List<OptionExpiry> getOptionExpiry() {
        if (optionExpiry == null) {
            optionExpiry = new ArrayList<OptionExpiry>();
        }
        return this.optionExpiry;
    }

    /**
     * Gets the value of the deClear property.
     * 
     * @return
     *     possible object is
     *     {@link DeClear }
     *     
     */
    public DeClear getDeClear() {
        return deClear;
    }

    /**
     * Sets the value of the deClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeClear }
     *     
     */
    public void setDeClear(DeClear value) {
        this.deClear = value;
    }

    /**
     * Gets the value of the additionalEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdditionalEvent() {
        return additionalEvent;
    }

    /**
     * Sets the value of the additionalEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdditionalEvent(Object value) {
        this.additionalEvent = value;
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

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}
