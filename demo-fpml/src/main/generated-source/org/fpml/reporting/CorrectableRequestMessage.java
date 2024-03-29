//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:10 AM CDT 
//


package org.fpml.reporting;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the content model for a request message that can be subsequently corrected or retracted.
 * 
 * <p>Java class for CorrectableRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectableRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}RequestMessage">
 *       &lt;sequence>
 *         &lt;element name="isCorrection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}Correlation.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}Sequence.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}OnBehalfOf.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectableRequestMessage", propOrder = {
    "isCorrection",
    "correlationId",
    "sequenceNumber",
    "onBehalfOf"
})
@XmlSeeAlso({
    RequestSubstitution.class,
    CreditEventNotification.class,
    RequestValuationReport.class,
    RequestInterest.class,
    RequestMargin.class,
    NettedTradeCashflowsAsserted.class,
    RequestPositionReport.class
})
public class CorrectableRequestMessage
    extends RequestMessage
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean isCorrection;
    protected CorrelationId correlationId;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    protected OnBehalfOf onBehalfOf;

    /**
     * Gets the value of the isCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorrection() {
        return isCorrection;
    }

    /**
     * Sets the value of the isCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorrection(Boolean value) {
        this.isCorrection = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationId }
     *     
     */
    public CorrelationId getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationId }
     *     
     */
    public void setCorrelationId(CorrelationId value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the onBehalfOf property.
     * 
     * @return
     *     possible object is
     *     {@link OnBehalfOf }
     *     
     */
    public OnBehalfOf getOnBehalfOf() {
        return onBehalfOf;
    }

    /**
     * Sets the value of the onBehalfOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnBehalfOf }
     *     
     */
    public void setOnBehalfOf(OnBehalfOf value) {
        this.onBehalfOf = value;
    }

}
