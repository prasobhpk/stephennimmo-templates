//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type describing each of the constituents of a basket.
 * 
 * <p>Java class for BasketConstituent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketConstituent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/reporting}underlyingAsset" minOccurs="0"/>
 *         &lt;element name="constituentWeight" type="{http://www.fpml.org/FpML-5/reporting}ConstituentWeight" minOccurs="0"/>
 *         &lt;element name="dividendPayout" type="{http://www.fpml.org/FpML-5/reporting}DividendPayout" minOccurs="0"/>
 *         &lt;element name="underlyerPrice" type="{http://www.fpml.org/FpML-5/reporting}Price" minOccurs="0"/>
 *         &lt;element name="underlyerNotional" type="{http://www.fpml.org/FpML-5/reporting}Money" minOccurs="0"/>
 *         &lt;element name="underlyerSpread" type="{http://www.fpml.org/FpML-5/reporting}SpreadScheduleReference" minOccurs="0"/>
 *         &lt;element name="couponPayment" type="{http://www.fpml.org/FpML-5/reporting}PendingPayment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketConstituent", propOrder = {
    "underlyingAsset",
    "constituentWeight",
    "dividendPayout",
    "underlyerPrice",
    "underlyerNotional",
    "underlyerSpread",
    "couponPayment"
})
public class BasketConstituent
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "underlyingAsset", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class)
    protected JAXBElement<? extends Asset> underlyingAsset;
    protected ConstituentWeight constituentWeight;
    protected DividendPayout dividendPayout;
    protected Price underlyerPrice;
    protected Money underlyerNotional;
    protected SpreadScheduleReference underlyerSpread;
    protected PendingPayment couponPayment;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the underlyingAsset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Basket }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}
     *     {@link JAXBElement }{@code <}{@link MutualFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link Future }{@code >}
     *     {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Index }{@code >}
     *     {@link JAXBElement }{@code <}{@link Cash }{@code >}
     *     {@link JAXBElement }{@code <}{@link Loan }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link Asset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bond }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     *     
     */
    public JAXBElement<? extends Asset> getUnderlyingAsset() {
        return underlyingAsset;
    }

    /**
     * Sets the value of the underlyingAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Basket }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}
     *     {@link JAXBElement }{@code <}{@link MutualFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link Future }{@code >}
     *     {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Index }{@code >}
     *     {@link JAXBElement }{@code <}{@link Cash }{@code >}
     *     {@link JAXBElement }{@code <}{@link Loan }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link Asset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bond }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     *     
     */
    public void setUnderlyingAsset(JAXBElement<? extends Asset> value) {
        this.underlyingAsset = ((JAXBElement<? extends Asset> ) value);
    }

    /**
     * Gets the value of the constituentWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ConstituentWeight }
     *     
     */
    public ConstituentWeight getConstituentWeight() {
        return constituentWeight;
    }

    /**
     * Sets the value of the constituentWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstituentWeight }
     *     
     */
    public void setConstituentWeight(ConstituentWeight value) {
        this.constituentWeight = value;
    }

    /**
     * Gets the value of the dividendPayout property.
     * 
     * @return
     *     possible object is
     *     {@link DividendPayout }
     *     
     */
    public DividendPayout getDividendPayout() {
        return dividendPayout;
    }

    /**
     * Sets the value of the dividendPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendPayout }
     *     
     */
    public void setDividendPayout(DividendPayout value) {
        this.dividendPayout = value;
    }

    /**
     * Gets the value of the underlyerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getUnderlyerPrice() {
        return underlyerPrice;
    }

    /**
     * Sets the value of the underlyerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setUnderlyerPrice(Price value) {
        this.underlyerPrice = value;
    }

    /**
     * Gets the value of the underlyerNotional property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnderlyerNotional() {
        return underlyerNotional;
    }

    /**
     * Sets the value of the underlyerNotional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnderlyerNotional(Money value) {
        this.underlyerNotional = value;
    }

    /**
     * Gets the value of the underlyerSpread property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadScheduleReference }
     *     
     */
    public SpreadScheduleReference getUnderlyerSpread() {
        return underlyerSpread;
    }

    /**
     * Sets the value of the underlyerSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadScheduleReference }
     *     
     */
    public void setUnderlyerSpread(SpreadScheduleReference value) {
        this.underlyerSpread = value;
    }

    /**
     * Gets the value of the couponPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PendingPayment }
     *     
     */
    public PendingPayment getCouponPayment() {
        return couponPayment;
    }

    /**
     * Sets the value of the couponPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingPayment }
     *     
     */
    public void setCouponPayment(PendingPayment value) {
        this.couponPayment = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
