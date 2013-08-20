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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the exercise period for a European style option together with any rules governing the notional amount of the underlying which can be exercised on any given exercise date and any associated exercise fees.
 * 
 * <p>Java class for EuropeanExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EuropeanExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Exercise">
 *       &lt;sequence>
 *         &lt;element name="expirationDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDate"/>
 *         &lt;element name="relevantUnderlyingDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDates" minOccurs="0"/>
 *         &lt;element name="earliestExerciseTime" type="{http://www.fpml.org/FpML-5/confirmation}BusinessCenterTime"/>
 *         &lt;element name="expirationTime" type="{http://www.fpml.org/FpML-5/confirmation}BusinessCenterTime"/>
 *         &lt;element name="partialExercise" type="{http://www.fpml.org/FpML-5/confirmation}PartialExercise" minOccurs="0"/>
 *         &lt;element name="exerciseFee" type="{http://www.fpml.org/FpML-5/confirmation}ExerciseFee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EuropeanExercise", propOrder = {
    "expirationDate",
    "relevantUnderlyingDate",
    "earliestExerciseTime",
    "expirationTime",
    "partialExercise",
    "exerciseFee"
})
public class EuropeanExercise
    extends Exercise
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AdjustableOrRelativeDate expirationDate;
    protected AdjustableOrRelativeDates relevantUnderlyingDate;
    @XmlElement(required = true)
    protected BusinessCenterTime earliestExerciseTime;
    @XmlElement(required = true)
    protected BusinessCenterTime expirationTime;
    protected PartialExercise partialExercise;
    protected ExerciseFee exerciseFee;

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
     * Gets the value of the relevantUnderlyingDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public AdjustableOrRelativeDates getRelevantUnderlyingDate() {
        return relevantUnderlyingDate;
    }

    /**
     * Sets the value of the relevantUnderlyingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public void setRelevantUnderlyingDate(AdjustableOrRelativeDates value) {
        this.relevantUnderlyingDate = value;
    }

    /**
     * Gets the value of the earliestExerciseTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getEarliestExerciseTime() {
        return earliestExerciseTime;
    }

    /**
     * Sets the value of the earliestExerciseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setEarliestExerciseTime(BusinessCenterTime value) {
        this.earliestExerciseTime = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setExpirationTime(BusinessCenterTime value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the partialExercise property.
     * 
     * @return
     *     possible object is
     *     {@link PartialExercise }
     *     
     */
    public PartialExercise getPartialExercise() {
        return partialExercise;
    }

    /**
     * Sets the value of the partialExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialExercise }
     *     
     */
    public void setPartialExercise(PartialExercise value) {
        this.partialExercise = value;
    }

    /**
     * Gets the value of the exerciseFee property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseFee }
     *     
     */
    public ExerciseFee getExerciseFee() {
        return exerciseFee;
    }

    /**
     * Sets the value of the exerciseFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseFee }
     *     
     */
    public void setExerciseFee(ExerciseFee value) {
        this.exerciseFee = value;
    }

}
