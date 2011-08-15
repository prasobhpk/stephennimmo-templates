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
 * A type for defining exercise procedures associated with a European style exercise of an equity option.
 * 
 * <p>Java class for EquityEuropeanExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityEuropeanExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/reporting}Exercise">
 *       &lt;sequence>
 *         &lt;element name="expirationDate" type="{http://www.fpml.org/FpML-5/reporting}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/reporting}EquityExpiration.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityEuropeanExercise", propOrder = {
    "expirationDate",
    "equityExpirationTimeType",
    "equityExpirationTime",
    "expirationTimeDetermination"
})
public class EquityEuropeanExercise
    extends Exercise
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AdjustableOrRelativeDate expirationDate;
    protected TimeTypeEnum equityExpirationTimeType;
    protected BusinessCenterTime equityExpirationTime;
    protected DeterminationMethod expirationTimeDetermination;

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setExpirationDate(AdjustableOrRelativeDate value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the equityExpirationTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTypeEnum }
     *     
     */
    public TimeTypeEnum getEquityExpirationTimeType() {
        return equityExpirationTimeType;
    }

    /**
     * Sets the value of the equityExpirationTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTypeEnum }
     *     
     */
    public void setEquityExpirationTimeType(TimeTypeEnum value) {
        this.equityExpirationTimeType = value;
    }

    /**
     * Gets the value of the equityExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getEquityExpirationTime() {
        return equityExpirationTime;
    }

    /**
     * Sets the value of the equityExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setEquityExpirationTime(BusinessCenterTime value) {
        this.equityExpirationTime = value;
    }

    /**
     * Gets the value of the expirationTimeDetermination property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getExpirationTimeDetermination() {
        return expirationTimeDetermination;
    }

    /**
     * Sets the value of the expirationTimeDetermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setExpirationTimeDetermination(DeterminationMethod value) {
        this.expirationTimeDetermination = value;
    }

}
