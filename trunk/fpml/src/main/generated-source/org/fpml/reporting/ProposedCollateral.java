//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposedCollateral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposedCollateral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="deliver" type="{http://www.fpml.org/FpML-5/reporting}ProposedCollateralDeliveryReturn"/>
 *           &lt;element name="return" type="{http://www.fpml.org/FpML-5/reporting}ProposedCollateralDeliveryReturn" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="return" type="{http://www.fpml.org/FpML-5/reporting}ProposedCollateralDeliveryReturn"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposedCollateral", propOrder = {
    "content"
})
public class ProposedCollateral implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "deliver", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class),
        @XmlElementRef(name = "return", namespace = "http://www.fpml.org/FpML-5/reporting", type = JAXBElement.class)
    })
    protected List<JAXBElement<ProposedCollateralDeliveryReturn>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Return" is used by two different parts of a schema. See: 
     * line 1080 of file:/C:/eclipse/workspace/fpml/src/main/schema/reporting/fpml-collateral-processes-5-1.xsd
     * line 1078 of file:/C:/eclipse/workspace/fpml/src/main/schema/reporting/fpml-collateral-processes-5-1.xsd
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
     * {@link JAXBElement }{@code <}{@link ProposedCollateralDeliveryReturn }{@code >}
     * {@link JAXBElement }{@code <}{@link ProposedCollateralDeliveryReturn }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ProposedCollateralDeliveryReturn>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<ProposedCollateralDeliveryReturn>>();
        }
        return this.content;
    }

}