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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract base class for all types which define intra-document pointers.
 * 
 * <p>Java class for Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference")
@XmlSeeAlso({
    AmountReference.class,
    PricingDataPointCoordinateReference.class,
    PricingParameterDerivativeReference.class,
    QuantityScheduleReference.class,
    CalculationPeriodsScheduleReference.class,
    MoneyReference.class,
    CreditEventsReference.class,
    ReturnSwapNotionalAmountReference.class,
    AccountReference.class,
    LagReference.class,
    NotionalAmountReference.class,
    ResetDatesReference.class,
    SensitivitySetDefinitionReference.class,
    PricingStructureReference.class,
    ProductReference.class,
    TradeUnderlyerReference.class,
    SettlementPeriodsReference.class,
    ValuationReference.class,
    RelevantUnderlyingDateReference.class,
    SettlementTermsReference.class,
    ValuationScenarioReference.class,
    ValuationDatesReference.class,
    InterestRateStreamReference.class,
    PartyTradeIdentifierReference.class,
    AnyAssetReference.class,
    DeterminationMethodReference.class,
    NotionalReference.class,
    CashflowFixingReference.class,
    InterestLegCalculationPeriodDatesReference.class,
    BusinessCentersReference.class,
    LegalEntityReference.class,
    ProtectionTermsReference.class,
    CashflowObservationReference.class,
    CalculationPeriodsReference.class,
    MarketReference.class,
    CalculationPeriodDatesReference.class,
    FloatingRateCalculationReference.class,
    PartyReference.class,
    AssetOrTermPointOrPricingStructureReference.class,
    QuantityReference.class,
    SpreadScheduleReference.class,
    PaymentDatesReference.class,
    FixedRateReference.class,
    PaymentReference.class,
    AssetReference.class,
    ScheduleReference.class,
    StepReference.class,
    BusinessDayAdjustmentsReference.class,
    DateReference.class,
    IdentifiedCurrencyReference.class,
    CalculationPeriodsDatesReference.class
})
public abstract class Reference implements Serializable
{

    private final static long serialVersionUID = 1L;

}
