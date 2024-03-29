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
 * <p>Java class for RealisedVarianceMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealisedVarianceMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Previous"/>
 *     &lt;enumeration value="Last"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RealisedVarianceMethodEnum")
@XmlEnum
public enum RealisedVarianceMethodEnum {


    /**
     * For a return on day T, the observed price on T-1 must be in range.
     * 
     */
    @XmlEnumValue("Previous")
    PREVIOUS("Previous"),

    /**
     * For a return on day T, the observed price on T must be in range.
     * 
     */
    @XmlEnumValue("Last")
    LAST("Last"),

    /**
     * For a return on day T, the observed prices on both T and T-1 must be in range
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    RealisedVarianceMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RealisedVarianceMethodEnum fromValue(String v) {
        for (RealisedVarianceMethodEnum c: RealisedVarianceMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
