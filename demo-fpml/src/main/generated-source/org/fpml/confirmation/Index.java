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
import javax.xml.bind.annotation.XmlType;


/**
 * A published index whose price depends on exchange traded constituents.
 * 
 * <p>Java class for Index complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Index">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}ExchangeTradedCalculatedPrice">
 *       &lt;sequence>
 *         &lt;element name="futureId" type="{http://www.fpml.org/FpML-5/confirmation}FutureId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Index", propOrder = {
    "futureId"
})
public class Index
    extends ExchangeTradedCalculatedPrice
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected FutureId futureId;

    /**
     * Gets the value of the futureId property.
     * 
     * @return
     *     possible object is
     *     {@link FutureId }
     *     
     */
    public FutureId getFutureId() {
        return futureId;
    }

    /**
     * Sets the value of the futureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureId }
     *     
     */
    public void setFutureId(FutureId value) {
        this.futureId = value;
    }

}
