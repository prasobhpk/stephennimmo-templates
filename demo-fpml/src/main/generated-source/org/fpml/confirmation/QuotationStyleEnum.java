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
 * <p>Java class for QuotationStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotationStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PointsUpFront"/>
 *     &lt;enumeration value="TradedSpread"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuotationStyleEnum")
@XmlEnum
public enum QuotationStyleEnum {


    /**
     * When quotation style is "PointsUpFront", the initialPoints element of the feeLeg should be populated.
     * 
     */
    @XmlEnumValue("PointsUpFront")
    POINTS_UP_FRONT("PointsUpFront"),

    /**
     * When quotation style is "TradedSpread", the marketFixedRate element of the feeLeg should be populated.
     * 
     */
    @XmlEnumValue("TradedSpread")
    TRADED_SPREAD("TradedSpread");
    private final String value;

    QuotationStyleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuotationStyleEnum fromValue(String v) {
        for (QuotationStyleEnum c: QuotationStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
