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
 * <p>Java class for PayerReceiverEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayerReceiverEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Payer"/>
 *     &lt;enumeration value="Receiver"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayerReceiverEnum")
@XmlEnum
public enum PayerReceiverEnum {


    /**
     * The party identified as the stream payer.
     * 
     */
    @XmlEnumValue("Payer")
    PAYER("Payer"),

    /**
     * The party identified as the stream receiver.
     * 
     */
    @XmlEnumValue("Receiver")
    RECEIVER("Receiver");
    private final String value;

    PayerReceiverEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayerReceiverEnum fromValue(String v) {
        for (PayerReceiverEnum c: PayerReceiverEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
