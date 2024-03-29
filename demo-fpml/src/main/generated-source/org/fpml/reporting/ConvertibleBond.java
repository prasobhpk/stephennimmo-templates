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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConvertibleBond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertibleBond">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}Bond">
 *       &lt;sequence>
 *         &lt;element name="underlyingEquity" type="{http://www.fpml.org/FpML-5/reporting}EquityAsset" minOccurs="0"/>
 *         &lt;element name="redemptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertibleBond", propOrder = {
    "underlyingEquity",
    "redemptionDate"
})
public class ConvertibleBond
    extends Bond
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected EquityAsset underlyingEquity;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar redemptionDate;

    /**
     * Gets the value of the underlyingEquity property.
     * 
     * @return
     *     possible object is
     *     {@link EquityAsset }
     *     
     */
    public EquityAsset getUnderlyingEquity() {
        return underlyingEquity;
    }

    /**
     * Sets the value of the underlyingEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityAsset }
     *     
     */
    public void setUnderlyingEquity(EquityAsset value) {
        this.underlyingEquity = value;
    }

    /**
     * Gets the value of the redemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * Sets the value of the redemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedemptionDate(XMLGregorianCalendar value) {
        this.redemptionDate = value;
    }

}
