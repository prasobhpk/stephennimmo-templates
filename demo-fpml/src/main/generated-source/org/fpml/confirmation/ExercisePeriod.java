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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This defines the time interval to the start of the exercise period, i.e. the earliest exercise date, and the frequency of subsequent exercise dates (if any).
 * 
 * <p>Java class for ExercisePeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExercisePeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="earliestExerciseDateTenor" type="{http://www.fpml.org/FpML-5/confirmation}Period"/>
 *         &lt;element name="exerciseFrequency" type="{http://www.fpml.org/FpML-5/confirmation}Period" minOccurs="0"/>
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
@XmlType(name = "ExercisePeriod", propOrder = {
    "earliestExerciseDateTenor",
    "exerciseFrequency"
})
public class ExercisePeriod implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Period earliestExerciseDateTenor;
    protected Period exerciseFrequency;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the earliestExerciseDateTenor property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEarliestExerciseDateTenor() {
        return earliestExerciseDateTenor;
    }

    /**
     * Sets the value of the earliestExerciseDateTenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEarliestExerciseDateTenor(Period value) {
        this.earliestExerciseDateTenor = value;
    }

    /**
     * Gets the value of the exerciseFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getExerciseFrequency() {
        return exerciseFrequency;
    }

    /**
     * Sets the value of the exerciseFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setExerciseFrequency(Period value) {
        this.exerciseFrequency = value;
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
