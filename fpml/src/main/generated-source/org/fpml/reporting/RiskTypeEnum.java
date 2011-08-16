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
 * <p>Java class for RiskTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Commodity"/>
 *     &lt;enumeration value="Credit"/>
 *     &lt;enumeration value="Equity"/>
 *     &lt;enumeration value="FX"/>
 *     &lt;enumeration value="Interest"/>
 *     &lt;enumeration value="Hybrid"/>
 *     &lt;enumeration value="Weather"/>
 *     &lt;enumeration value="Insurance"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RiskTypeEnum")
@XmlEnum
public enum RiskTypeEnum {

    @XmlEnumValue("Commodity")
    COMMODITY("Commodity"),
    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Equity")
    EQUITY("Equity"),
    FX("FX"),
    @XmlEnumValue("Interest")
    INTEREST("Interest"),
    @XmlEnumValue("Hybrid")
    HYBRID("Hybrid"),
    @XmlEnumValue("Weather")
    WEATHER("Weather"),
    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RiskTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RiskTypeEnum fromValue(String v) {
        for (RiskTypeEnum c: RiskTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}