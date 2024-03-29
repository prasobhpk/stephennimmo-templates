//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrikeQuoteBasisEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StrikeQuoteBasisEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PutCurrencyPerCallCurrency"/>
 *     &lt;enumeration value="CallCurrencyPerPutCurrency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StrikeQuoteBasisEnum")
@XmlEnum
public enum StrikeQuoteBasisEnum {


    /**
     * The strike price is an amount of putCurrency per one unit of callCurrency.
     * 
     */
    @XmlEnumValue("PutCurrencyPerCallCurrency")
    PUT_CURRENCY_PER_CALL_CURRENCY("PutCurrencyPerCallCurrency"),

    /**
     * The strike price is an amount of callCurrency per one unit of putCurrency.
     * 
     */
    @XmlEnumValue("CallCurrencyPerPutCurrency")
    CALL_CURRENCY_PER_PUT_CURRENCY("CallCurrencyPerPutCurrency");
    private final String value;

    StrikeQuoteBasisEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StrikeQuoteBasisEnum fromValue(String v) {
        for (StrikeQuoteBasisEnum c: StrikeQuoteBasisEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
