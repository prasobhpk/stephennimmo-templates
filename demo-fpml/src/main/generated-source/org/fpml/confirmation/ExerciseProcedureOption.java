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
 * A type describing how notice of exercise should be given. This can be either manual or automatic.
 * 
 * <p>Java class for ExerciseProcedureOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExerciseProcedureOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="manualExercise" type="{http://www.fpml.org/FpML-5/confirmation}Empty"/>
 *         &lt;element name="automaticExercise" type="{http://www.fpml.org/FpML-5/confirmation}Empty"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExerciseProcedureOption", propOrder = {
    "manualExercise",
    "automaticExercise"
})
public class ExerciseProcedureOption
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Empty manualExercise;
    protected Empty automaticExercise;

    /**
     * Gets the value of the manualExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getManualExercise() {
        return manualExercise;
    }

    /**
     * Sets the value of the manualExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setManualExercise(Empty value) {
        this.manualExercise = value;
    }

    /**
     * Gets the value of the automaticExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getAutomaticExercise() {
        return automaticExercise;
    }

    /**
     * Sets the value of the automaticExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setAutomaticExercise(Empty value) {
        this.automaticExercise = value;
    }

}
