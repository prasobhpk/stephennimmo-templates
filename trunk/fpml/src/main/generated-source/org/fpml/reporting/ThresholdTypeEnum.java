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
 * <p>Java class for ThresholdTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThresholdTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Secured"/>
 *     &lt;enumeration value="Unsecured"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThresholdTypeEnum")
@XmlEnum
public enum ThresholdTypeEnum {

    @XmlEnumValue("Secured")
    SECURED("Secured"),
    @XmlEnumValue("Unsecured")
    UNSECURED("Unsecured");
    private final String value;

    ThresholdTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThresholdTypeEnum fromValue(String v) {
        for (ThresholdTypeEnum c: ThresholdTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}