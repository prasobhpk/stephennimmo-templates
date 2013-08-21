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
import javax.xml.bind.annotation.XmlType;


/**
 * A valuation of an FX curve object., which includes pricing inputs and term structures for fx forwards.
 * 
 * <p>Java class for FxCurveValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxCurveValuation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}PricingStructureValuation">
 *       &lt;sequence>
 *         &lt;element name="settlementCurrencyYieldCurve" type="{http://www.fpml.org/FpML-5/reporting}PricingStructureReference" minOccurs="0"/>
 *         &lt;element name="forecastCurrencyYieldCurve" type="{http://www.fpml.org/FpML-5/reporting}PricingStructureReference" minOccurs="0"/>
 *         &lt;element name="spotRate" type="{http://www.fpml.org/FpML-5/reporting}FxRateSet" minOccurs="0"/>
 *         &lt;element name="fxForwardCurve" type="{http://www.fpml.org/FpML-5/reporting}TermCurve" minOccurs="0"/>
 *         &lt;element name="fxForwardPointsCurve" type="{http://www.fpml.org/FpML-5/reporting}TermCurve" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxCurveValuation", propOrder = {
    "settlementCurrencyYieldCurve",
    "forecastCurrencyYieldCurve",
    "spotRate",
    "fxForwardCurve",
    "fxForwardPointsCurve"
})
public class FxCurveValuation
    extends PricingStructureValuation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PricingStructureReference settlementCurrencyYieldCurve;
    protected PricingStructureReference forecastCurrencyYieldCurve;
    protected FxRateSet spotRate;
    protected TermCurve fxForwardCurve;
    protected TermCurve fxForwardPointsCurve;

    /**
     * Gets the value of the settlementCurrencyYieldCurve property.
     * 
     * @return
     *     possible object is
     *     {@link PricingStructureReference }
     *     
     */
    public PricingStructureReference getSettlementCurrencyYieldCurve() {
        return settlementCurrencyYieldCurve;
    }

    /**
     * Sets the value of the settlementCurrencyYieldCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingStructureReference }
     *     
     */
    public void setSettlementCurrencyYieldCurve(PricingStructureReference value) {
        this.settlementCurrencyYieldCurve = value;
    }

    /**
     * Gets the value of the forecastCurrencyYieldCurve property.
     * 
     * @return
     *     possible object is
     *     {@link PricingStructureReference }
     *     
     */
    public PricingStructureReference getForecastCurrencyYieldCurve() {
        return forecastCurrencyYieldCurve;
    }

    /**
     * Sets the value of the forecastCurrencyYieldCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingStructureReference }
     *     
     */
    public void setForecastCurrencyYieldCurve(PricingStructureReference value) {
        this.forecastCurrencyYieldCurve = value;
    }

    /**
     * Gets the value of the spotRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxRateSet }
     *     
     */
    public FxRateSet getSpotRate() {
        return spotRate;
    }

    /**
     * Sets the value of the spotRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxRateSet }
     *     
     */
    public void setSpotRate(FxRateSet value) {
        this.spotRate = value;
    }

    /**
     * Gets the value of the fxForwardCurve property.
     * 
     * @return
     *     possible object is
     *     {@link TermCurve }
     *     
     */
    public TermCurve getFxForwardCurve() {
        return fxForwardCurve;
    }

    /**
     * Sets the value of the fxForwardCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCurve }
     *     
     */
    public void setFxForwardCurve(TermCurve value) {
        this.fxForwardCurve = value;
    }

    /**
     * Gets the value of the fxForwardPointsCurve property.
     * 
     * @return
     *     possible object is
     *     {@link TermCurve }
     *     
     */
    public TermCurve getFxForwardPointsCurve() {
        return fxForwardPointsCurve;
    }

    /**
     * Sets the value of the fxForwardPointsCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCurve }
     *     
     */
    public void setFxForwardPointsCurve(TermCurve value) {
        this.fxForwardPointsCurve = value;
    }

}