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
 * <p>Java class for DisruptionFallbacksEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisruptionFallbacksEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AsSpecifiedInMasterAgreement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisruptionFallbacksEnum")
@XmlEnum
public enum DisruptionFallbacksEnum {

    @XmlEnumValue("AsSpecifiedInMasterAgreement")
    AS_SPECIFIED_IN_MASTER_AGREEMENT("AsSpecifiedInMasterAgreement");
    private final String value;

    DisruptionFallbacksEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisruptionFallbacksEnum fromValue(String v) {
        for (DisruptionFallbacksEnum c: DisruptionFallbacksEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
