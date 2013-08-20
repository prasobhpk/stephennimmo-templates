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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxConversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="amountRelativeTo" type="{http://www.fpml.org/FpML-5/reporting}AmountReference" minOccurs="0"/>
 *         &lt;element name="fxRate" type="{http://www.fpml.org/FpML-5/reporting}FxRate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxConversion", propOrder = {
    "amountRelativeTo",
    "fxRate"
})
public class FxConversion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AmountReference amountRelativeTo;
    protected List<FxRate> fxRate;

    /**
     * Gets the value of the amountRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link AmountReference }
     *     
     */
    public AmountReference getAmountRelativeTo() {
        return amountRelativeTo;
    }

    /**
     * Sets the value of the amountRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountReference }
     *     
     */
    public void setAmountRelativeTo(AmountReference value) {
        this.amountRelativeTo = value;
    }

    /**
     * Gets the value of the fxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxRate }
     * 
     * 
     */
    public List<FxRate> getFxRate() {
        if (fxRate == null) {
            fxRate = new ArrayList<FxRate>();
        }
        return this.fxRate;
    }

}
