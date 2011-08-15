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
 * <p>Java class for BullionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BullionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Gold"/>
 *     &lt;enumeration value="Palladium"/>
 *     &lt;enumeration value="Platinum"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="RhodiumSponge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BullionTypeEnum")
@XmlEnum
public enum BullionTypeEnum {


    /**
     * Gold. Quality as per the Good Delivery Rules issued by the London Bullion Market Association.
     * 
     */
    @XmlEnumValue("Gold")
    GOLD("Gold"),

    /**
     * Palladium. Quality as per the Good Delivery Rules issued by the London Platinum and Palladium Market.
     * 
     */
    @XmlEnumValue("Palladium")
    PALLADIUM("Palladium"),

    /**
     * Palladium. Quality as per the Good Delivery Rules issued by the London Platinum and Palladium Market.
     * 
     */
    @XmlEnumValue("Platinum")
    PLATINUM("Platinum"),

    /**
     * Silver. Quality as per the Good Delivery Rules issued by the London Bullion Market Association.
     * 
     */
    @XmlEnumValue("Silver")
    SILVER("Silver"),

    /**
     * Quality as per the Good Delivery Rules for Rhodium (Sponge).
     * 
     */
    @XmlEnumValue("RhodiumSponge")
    RHODIUM_SPONGE("RhodiumSponge");
    private final String value;

    BullionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BullionTypeEnum fromValue(String v) {
        for (BullionTypeEnum c: BullionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
