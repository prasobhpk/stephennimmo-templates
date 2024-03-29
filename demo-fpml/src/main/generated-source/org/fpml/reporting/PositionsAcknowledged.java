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
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionsAcknowledged complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionsAcknowledged">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="portfolio" type="{http://www.fpml.org/FpML-5/reporting}PortfolioDefinition" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="definedPosition" type="{http://www.fpml.org/FpML-5/reporting}PositionReference" minOccurs="0"/>
 *           &lt;element name="removedPosition" type="{http://www.fpml.org/FpML-5/reporting}PositionReference" minOccurs="0"/>
 *           &lt;element name="unprocessedPosition" type="{http://www.fpml.org/FpML-5/reporting}UnprocessedPosition" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}PartiesAndAccounts.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionsAcknowledged", propOrder = {
    "portfolio",
    "definedPositionOrRemovedPositionOrUnprocessedPosition",
    "party",
    "account"
})
public class PositionsAcknowledged
    extends ResponseMessage
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PortfolioDefinition portfolio;
    @XmlElementRefs({
        @XmlElementRef(name = "definedPosition", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class),
        @XmlElementRef(name = "removedPosition", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class),
        @XmlElementRef(name = "unprocessedPosition", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> definedPositionOrRemovedPositionOrUnprocessedPosition;
    protected List<Party> party;
    protected List<Account> account;

    /**
     * Gets the value of the portfolio property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioDefinition }
     *     
     */
    public PortfolioDefinition getPortfolio() {
        return portfolio;
    }

    /**
     * Sets the value of the portfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioDefinition }
     *     
     */
    public void setPortfolio(PortfolioDefinition value) {
        this.portfolio = value;
    }

    /**
     * Gets the value of the definedPositionOrRemovedPositionOrUnprocessedPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definedPositionOrRemovedPositionOrUnprocessedPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinedPositionOrRemovedPositionOrUnprocessedPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PositionReference }{@code >}
     * {@link JAXBElement }{@code <}{@link UnprocessedPosition }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionReference }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDefinedPositionOrRemovedPositionOrUnprocessedPosition() {
        if (definedPositionOrRemovedPositionOrUnprocessedPosition == null) {
            definedPositionOrRemovedPositionOrUnprocessedPosition = new ArrayList<JAXBElement<?>>();
        }
        return this.definedPositionOrRemovedPositionOrUnprocessedPosition;
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
