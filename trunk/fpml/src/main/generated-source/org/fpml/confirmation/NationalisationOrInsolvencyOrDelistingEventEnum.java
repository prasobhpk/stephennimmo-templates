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
 * <p>Java class for NationalisationOrInsolvencyOrDelistingEventEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NationalisationOrInsolvencyOrDelistingEventEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NegotiatedCloseout"/>
 *     &lt;enumeration value="CancellationAndPayment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NationalisationOrInsolvencyOrDelistingEventEnum")
@XmlEnum
public enum NationalisationOrInsolvencyOrDelistingEventEnum {


    /**
     * The parties may, but are not obliged, to terminate the transaction on mutually acceptable terms and if the terms are not agreed then the transaction continues.
     * 
     */
    @XmlEnumValue("NegotiatedCloseout")
    NEGOTIATED_CLOSEOUT("NegotiatedCloseout"),

    /**
     * The trade is terminated.
     * 
     */
    @XmlEnumValue("CancellationAndPayment")
    CANCELLATION_AND_PAYMENT("CancellationAndPayment");
    private final String value;

    NationalisationOrInsolvencyOrDelistingEventEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NationalisationOrInsolvencyOrDelistingEventEnum fromValue(String v) {
        for (NationalisationOrInsolvencyOrDelistingEventEnum c: NationalisationOrInsolvencyOrDelistingEventEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
