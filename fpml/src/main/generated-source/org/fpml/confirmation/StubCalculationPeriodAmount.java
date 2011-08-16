//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

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
 * A type defining how the initial or final stub calculation period amounts is calculated. For example, the rate to be applied to the initial or final stub calculation period may be the linear interpolation of two different tenors for the floating rate index specified in the calculation period amount component, e.g. A two month stub period may used the linear interpolation of a one month and three month floating rate. The different rate tenors would be specified in this component. Note that a maximum of two rate tenors can be specified. If a stub period uses a single index tenor and this is the same as that specified in the calculation period amount component then the initial stub or final stub component, as the case may be, must not be included.
 * 
 * <p>Java class for StubCalculationPeriodAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StubCalculationPeriodAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationPeriodDatesReference" type="{http://www.fpml.org/FpML-5/confirmation}CalculationPeriodDatesReference"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="initialStub" type="{http://www.fpml.org/FpML-5/confirmation}StubValue"/>
 *             &lt;element name="finalStub" type="{http://www.fpml.org/FpML-5/confirmation}StubValue" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="finalStub" type="{http://www.fpml.org/FpML-5/confirmation}StubValue"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StubCalculationPeriodAmount", propOrder = {
    "content"
})
public class StubCalculationPeriodAmount
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "finalStub", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "initialStub", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "calculationPeriodDatesReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "FinalStub" is used by two different parts of a schema. See: 
     * line 1494 of file:/C:/eclipse/workspace/fpml/src/main/schema/confirmation/fpml-ird-5-1.xsd
     * line 1488 of file:/C:/eclipse/workspace/fpml/src/main/schema/confirmation/fpml-ird-5-1.xsd
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
     * {@link JAXBElement }{@code <}{@link StubValue }{@code >}
     * {@link JAXBElement }{@code <}{@link StubValue }{@code >}
     * {@link JAXBElement }{@code <}{@link CalculationPeriodDatesReference }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

}