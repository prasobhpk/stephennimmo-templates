//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * The different options for specifying the attributes of a coal quality measure as a decimal value.
 * 
 * <p>Java class for CoalAttributeDecimal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoalAttributeDecimal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="standardContent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="rejectionLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="rejectionLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoalAttributeDecimal", propOrder = {
    "content"
})
public class CoalAttributeDecimal
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "rejectionLimit", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "standardContent", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class)
    })
    protected List<JAXBElement<BigDecimal>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "RejectionLimit" is used by two different parts of a schema. See: 
     * line 121 of file:/C:/eclipse/workspace/fpml/src/main/schema/confirmation/fpml-com-5-1.xsd
     * line 114 of file:/C:/eclipse/workspace/fpml/src/main/schema/confirmation/fpml-com-5-1.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * 
     */
    public List<JAXBElement<BigDecimal>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<BigDecimal>>();
        }
        return this.content;
    }

}
