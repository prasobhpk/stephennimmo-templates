//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type for defining the common features of equity derivatives.
 * 
 * <p>Java class for EquityDerivativeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityDerivativeBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}BuyerSeller.model"/>
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/reporting}EquityOptionTypeEnum" minOccurs="0"/>
 *         &lt;element name="equityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/reporting}Underlyer" minOccurs="0"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/reporting}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="equityExercise" type="{http://www.fpml.org/FpML-5/reporting}EquityExerciseValuationSettlement" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}Feature.model" minOccurs="0"/>
 *         &lt;element name="strategyFeature" type="{http://www.fpml.org/FpML-5/reporting}StrategyFeature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityDerivativeBase", propOrder = {
    "buyerPartyReference",
    "buyerAccountReference",
    "sellerPartyReference",
    "sellerAccountReference",
    "optionType",
    "equityEffectiveDate",
    "underlyer",
    "notional",
    "equityExercise",
    "fxFeature",
    "strategyFeature"
})
@XmlSeeAlso({
    EquityDerivativeLongFormBase.class,
    EquityDerivativeShortFormBase.class
})
public abstract class EquityDerivativeBase
    extends Product
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PartyReference buyerPartyReference;
    protected AccountReference buyerAccountReference;
    protected PartyReference sellerPartyReference;
    protected AccountReference sellerAccountReference;
    protected String optionType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar equityEffectiveDate;
    protected Underlyer underlyer;
    protected NonNegativeMoney notional;
    protected EquityExerciseValuationSettlement equityExercise;
    protected FxFeature fxFeature;
    protected StrategyFeature strategyFeature;

    /**
     * Gets the value of the buyerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBuyerPartyReference() {
        return buyerPartyReference;
    }

    /**
     * Sets the value of the buyerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBuyerPartyReference(PartyReference value) {
        this.buyerPartyReference = value;
    }

    /**
     * Gets the value of the buyerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getBuyerAccountReference() {
        return buyerAccountReference;
    }

    /**
     * Sets the value of the buyerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setBuyerAccountReference(AccountReference value) {
        this.buyerAccountReference = value;
    }

    /**
     * Gets the value of the sellerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getSellerPartyReference() {
        return sellerPartyReference;
    }

    /**
     * Sets the value of the sellerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setSellerPartyReference(PartyReference value) {
        this.sellerPartyReference = value;
    }

    /**
     * Gets the value of the sellerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getSellerAccountReference() {
        return sellerAccountReference;
    }

    /**
     * Sets the value of the sellerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setSellerAccountReference(AccountReference value) {
        this.sellerAccountReference = value;
    }

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionType(String value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the equityEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEquityEffectiveDate() {
        return equityEffectiveDate;
    }

    /**
     * Sets the value of the equityEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEquityEffectiveDate(XMLGregorianCalendar value) {
        this.equityEffectiveDate = value;
    }

    /**
     * Gets the value of the underlyer property.
     * 
     * @return
     *     possible object is
     *     {@link Underlyer }
     *     
     */
    public Underlyer getUnderlyer() {
        return underlyer;
    }

    /**
     * Sets the value of the underlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Underlyer }
     *     
     */
    public void setUnderlyer(Underlyer value) {
        this.underlyer = value;
    }

    /**
     * Gets the value of the notional property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getNotional() {
        return notional;
    }

    /**
     * Sets the value of the notional property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setNotional(NonNegativeMoney value) {
        this.notional = value;
    }

    /**
     * Gets the value of the equityExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityExerciseValuationSettlement }
     *     
     */
    public EquityExerciseValuationSettlement getEquityExercise() {
        return equityExercise;
    }

    /**
     * Sets the value of the equityExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityExerciseValuationSettlement }
     *     
     */
    public void setEquityExercise(EquityExerciseValuationSettlement value) {
        this.equityExercise = value;
    }

    /**
     * Gets the value of the fxFeature property.
     * 
     * @return
     *     possible object is
     *     {@link FxFeature }
     *     
     */
    public FxFeature getFxFeature() {
        return fxFeature;
    }

    /**
     * Sets the value of the fxFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxFeature }
     *     
     */
    public void setFxFeature(FxFeature value) {
        this.fxFeature = value;
    }

    /**
     * Gets the value of the strategyFeature property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyFeature }
     *     
     */
    public StrategyFeature getStrategyFeature() {
        return strategyFeature;
    }

    /**
     * Sets the value of the strategyFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyFeature }
     *     
     */
    public void setStrategyFeature(StrategyFeature value) {
        this.strategyFeature = value;
    }

}