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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type defining the trade execution date time and the source of it. For use inside containing types which already have a Reference to a Party that has assigned this trade execution date time.
 * 
 * <p>Java class for ExecutionDateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutionDateTime">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>dateTime">
 *       &lt;attribute name="executionDateTimeScheme" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutionDateTime", propOrder = {
    "value"
})
public class ExecutionDateTime
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar value;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String executionDateTimeScheme;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the executionDateTimeScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionDateTimeScheme() {
        return executionDateTimeScheme;
    }

    /**
     * Sets the value of the executionDateTimeScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionDateTimeScheme(String value) {
        this.executionDateTimeScheme = value;
    }

}
