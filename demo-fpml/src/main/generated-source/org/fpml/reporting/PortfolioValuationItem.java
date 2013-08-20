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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A type used in valuation enquiry messages which relates a portfolio to its trades and current value.
 * 
 * <p>Java class for PortfolioValuationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioValuationItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/reporting}portfolio" minOccurs="0"/>
 *         &lt;element name="tradeValuationItem" type="{http://www.fpml.org/FpML-5/reporting}TradeValuationItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/reporting}valuationSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioValuationItem", propOrder = {
    "portfolio",
    "tradeValuationItem",
    "valuationSet"
})
public class PortfolioValuationItem
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "portfolio", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class)
    protected JAXBElement<? extends Portfolio> portfolio;
    protected List<TradeValuationItem> tradeValuationItem;
    protected ValuationSet valuationSet;

    /**
     * Portfolio identifier
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryPortfolio }{@code >}
     *     {@link JAXBElement }{@code <}{@link Portfolio }{@code >}
     *     
     */
    public JAXBElement<? extends Portfolio> getPortfolio() {
        return portfolio;
    }

    /**
     * Sets the value of the portfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryPortfolio }{@code >}
     *     {@link JAXBElement }{@code <}{@link Portfolio }{@code >}
     *     
     */
    public void setPortfolio(JAXBElement<? extends Portfolio> value) {
        this.portfolio = ((JAXBElement<? extends Portfolio> ) value);
    }

    /**
     * Gets the value of the tradeValuationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeValuationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeValuationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeValuationItem }
     * 
     * 
     */
    public List<TradeValuationItem> getTradeValuationItem() {
        if (tradeValuationItem == null) {
            tradeValuationItem = new ArrayList<TradeValuationItem>();
        }
        return this.tradeValuationItem;
    }

    /**
     * The portfolio valuation.
     * 
     * @return
     *     possible object is
     *     {@link ValuationSet }
     *     
     */
    public ValuationSet getValuationSet() {
        return valuationSet;
    }

    /**
     * Sets the value of the valuationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationSet }
     *     
     */
    public void setValuationSet(ValuationSet value) {
        this.valuationSet = value;
    }

}
