//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PubliclyAvailableInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PubliclyAvailableInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardPublicSources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="publicSource" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specifiedNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PubliclyAvailableInformation", propOrder = {
    "standardPublicSources",
    "publicSource",
    "specifiedNumber"
})
public class PubliclyAvailableInformation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean standardPublicSources;
    protected List<String> publicSource;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger specifiedNumber;

    /**
     * Gets the value of the standardPublicSources property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardPublicSources() {
        return standardPublicSources;
    }

    /**
     * Sets the value of the standardPublicSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardPublicSources(Boolean value) {
        this.standardPublicSources = value;
    }

    /**
     * Gets the value of the publicSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPublicSource() {
        if (publicSource == null) {
            publicSource = new ArrayList<String>();
        }
        return this.publicSource;
    }

    /**
     * Gets the value of the specifiedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecifiedNumber() {
        return specifiedNumber;
    }

    /**
     * Sets the value of the specifiedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecifiedNumber(BigInteger value) {
        this.specifiedNumber = value;
    }

}
