//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type defining which principal exchanges occur for the stream.
 * 
 * <p>Java class for PrincipalExchanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalExchanges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initialExchange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="finalExchange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="intermediateExchange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalExchanges", propOrder = {
    "initialExchange",
    "finalExchange",
    "intermediateExchange"
})
public class PrincipalExchanges
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected boolean initialExchange;
    protected boolean finalExchange;
    protected boolean intermediateExchange;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the initialExchange property.
     * 
     */
    public boolean isInitialExchange() {
        return initialExchange;
    }

    /**
     * Sets the value of the initialExchange property.
     * 
     */
    public void setInitialExchange(boolean value) {
        this.initialExchange = value;
    }

    /**
     * Gets the value of the finalExchange property.
     * 
     */
    public boolean isFinalExchange() {
        return finalExchange;
    }

    /**
     * Sets the value of the finalExchange property.
     * 
     */
    public void setFinalExchange(boolean value) {
        this.finalExchange = value;
    }

    /**
     * Gets the value of the intermediateExchange property.
     * 
     */
    public boolean isIntermediateExchange() {
        return intermediateExchange;
    }

    /**
     * Sets the value of the intermediateExchange property.
     * 
     */
    public void setIntermediateExchange(boolean value) {
        this.intermediateExchange = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
