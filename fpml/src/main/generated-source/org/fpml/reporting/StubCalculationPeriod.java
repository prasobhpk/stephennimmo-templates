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
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the Stub Calculation Period.
 * 
 * <p>Java class for StubCalculationPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StubCalculationPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="initialStub" type="{http://www.fpml.org/FpML-5/reporting}Stub" minOccurs="0"/>
 *           &lt;element name="finalStub" type="{http://www.fpml.org/FpML-5/reporting}Stub" minOccurs="0"/>
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
@XmlType(name = "StubCalculationPeriod", propOrder = {
    "initialStub",
    "finalStub"
})
public class StubCalculationPeriod
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Stub initialStub;
    protected Stub finalStub;

    /**
     * Gets the value of the initialStub property.
     * 
     * @return
     *     possible object is
     *     {@link Stub }
     *     
     */
    public Stub getInitialStub() {
        return initialStub;
    }

    /**
     * Sets the value of the initialStub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stub }
     *     
     */
    public void setInitialStub(Stub value) {
        this.initialStub = value;
    }

    /**
     * Gets the value of the finalStub property.
     * 
     * @return
     *     possible object is
     *     {@link Stub }
     *     
     */
    public Stub getFinalStub() {
        return finalStub;
    }

    /**
     * Sets the value of the finalStub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stub }
     *     
     */
    public void setFinalStub(Stub value) {
        this.finalStub = value;
    }

}