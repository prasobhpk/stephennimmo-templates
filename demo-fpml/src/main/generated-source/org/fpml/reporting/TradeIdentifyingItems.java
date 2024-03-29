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
 * Data elements that can be used to identify the trade for which cashflows are being communicated. This includes both explicit trade identifiers and summary economic details.
 * 
 * <p>Java class for TradeIdentifyingItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeIdentifyingItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyTradeIdentifier" type="{http://www.fpml.org/FpML-5/reporting}PartyTradeIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tradeDetails" type="{http://www.fpml.org/FpML-5/reporting}TradeDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeIdentifyingItems", propOrder = {
    "partyTradeIdentifier",
    "tradeDetails"
})
public class TradeIdentifyingItems
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PartyTradeIdentifier> partyTradeIdentifier;
    protected TradeDetails tradeDetails;

    /**
     * Gets the value of the partyTradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getPartyTradeIdentifier() {
        if (partyTradeIdentifier == null) {
            partyTradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.partyTradeIdentifier;
    }

    /**
     * Gets the value of the tradeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDetails }
     *     
     */
    public TradeDetails getTradeDetails() {
        return tradeDetails;
    }

    /**
     * Sets the value of the tradeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDetails }
     *     
     */
    public void setTradeDetails(TradeDetails value) {
        this.tradeDetails = value;
    }

}
