//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegativeInterestRateTreatmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NegativeInterestRateTreatmentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NegativeInterestRateMethod"/>
 *     &lt;enumeration value="ZeroInterestRateMethod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NegativeInterestRateTreatmentEnum")
@XmlEnum
public enum NegativeInterestRateTreatmentEnum {


    /**
     * Negative Interest Rate Method. Per 2000 ISDA Definitions, Section 6.4 Negative Interest Rates, paragraphs (b) and (c).
     * 
     */
    @XmlEnumValue("NegativeInterestRateMethod")
    NEGATIVE_INTEREST_RATE_METHOD("NegativeInterestRateMethod"),

    /**
     * Zero Interest Rate Method. Per 2000 ISDA Definitions, Section 6.4. Negative Interest Rates, paragraphs (d) and (e).
     * 
     */
    @XmlEnumValue("ZeroInterestRateMethod")
    ZERO_INTEREST_RATE_METHOD("ZeroInterestRateMethod");
    private final String value;

    NegativeInterestRateTreatmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NegativeInterestRateTreatmentEnum fromValue(String v) {
        for (NegativeInterestRateTreatmentEnum c: NegativeInterestRateTreatmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
