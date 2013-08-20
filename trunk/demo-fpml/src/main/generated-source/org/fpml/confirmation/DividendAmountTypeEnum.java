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
 * <p>Java class for DividendAmountTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendAmountTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="RecordAmount"/>
 *     &lt;enumeration value="ExAmount"/>
 *     &lt;enumeration value="PaidAmount"/>
 *     &lt;enumeration value="AsSpecifiedInMasterConfirmation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DividendAmountTypeEnum")
@XmlEnum
public enum DividendAmountTypeEnum {


    /**
     *  100% of the gross cash dividend per Share paid over record date during relevant Dividend Period
     * 
     */
    @XmlEnumValue("RecordAmount")
    RECORD_AMOUNT("RecordAmount"),

    /**
     *  100% of gross cash dividend per Share paid after the Ex Div date during relevant Dividend Period.
     * 
     */
    @XmlEnumValue("ExAmount")
    EX_AMOUNT("ExAmount"),

    /**
     *  100% of gross cash dividend per Share paid during relevant Dividend Period.
     * 
     */
    @XmlEnumValue("PaidAmount")
    PAID_AMOUNT("PaidAmount"),

    /**
     * The Amount is determined as provided in the relevant Master Confirmation.
     * 
     */
    @XmlEnumValue("AsSpecifiedInMasterConfirmation")
    AS_SPECIFIED_IN_MASTER_CONFIRMATION("AsSpecifiedInMasterConfirmation");
    private final String value;

    DividendAmountTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DividendAmountTypeEnum fromValue(String v) {
        for (DividendAmountTypeEnum c: DividendAmountTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
