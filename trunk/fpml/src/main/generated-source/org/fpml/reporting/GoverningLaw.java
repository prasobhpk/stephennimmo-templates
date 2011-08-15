//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identification of the law governing the transaction.
 * 
 * <p>Java class for GoverningLaw complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoverningLaw">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/reporting>Scheme">
 *       &lt;attribute name="governingLawScheme" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://www.fpml.org/coding-scheme/governing-law" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoverningLaw", propOrder = {
    "value"
})
public class GoverningLaw
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String governingLawScheme;

    /**
     * The base class for all types which define coding schemes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the governingLawScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoverningLawScheme() {
        if (governingLawScheme == null) {
            return "http://www.fpml.org/coding-scheme/governing-law";
        } else {
            return governingLawScheme;
        }
    }

    /**
     * Sets the value of the governingLawScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoverningLawScheme(String value) {
        this.governingLawScheme = value;
    }

}
