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
 * <p>Java class for QuotationSideEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotationSideEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Bid"/>
 *     &lt;enumeration value="Ask"/>
 *     &lt;enumeration value="Mid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuotationSideEnum")
@XmlEnum
public enum QuotationSideEnum {


    /**
     * A value "bid" by a buyer for an asset, i.e. the value a buyer is willing to pay.
     * 
     */
    @XmlEnumValue("Bid")
    BID("Bid"),

    /**
     * A value "asked" by a seller for an asset, i.e. the value at which a seller is willing to sell.
     * 
     */
    @XmlEnumValue("Ask")
    ASK("Ask"),

    /**
     * A value midway between the bid and the ask value.
     * 
     */
    @XmlEnumValue("Mid")
    MID("Mid");
    private final String value;

    QuotationSideEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuotationSideEnum fromValue(String v) {
        for (QuotationSideEnum c: QuotationSideEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
