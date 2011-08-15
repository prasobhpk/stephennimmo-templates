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
 * <p>Java class for DiscountingTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountingTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="FRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiscountingTypeEnum")
@XmlEnum
public enum DiscountingTypeEnum {


    /**
     * Per ISDA 2000 Definitions, Section 8.4. Discounting, paragraph (a)
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * Per ISDA 2000 Definitions, Section 8.4. Discounting, paragraph (b)
     * 
     */
    FRA("FRA");
    private final String value;

    DiscountingTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountingTypeEnum fromValue(String v) {
        for (DiscountingTypeEnum c: DiscountingTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
