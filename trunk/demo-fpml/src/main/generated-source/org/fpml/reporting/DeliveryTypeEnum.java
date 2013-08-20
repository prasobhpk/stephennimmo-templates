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
 * <p>Java class for DeliveryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Firm"/>
 *     &lt;enumeration value="Interruptible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryTypeEnum")
@XmlEnum
public enum DeliveryTypeEnum {

    @XmlEnumValue("Firm")
    FIRM("Firm"),
    @XmlEnumValue("Interruptible")
    INTERRUPTIBLE("Interruptible");
    private final String value;

    DeliveryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryTypeEnum fromValue(String v) {
        for (DeliveryTypeEnum c: DeliveryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
