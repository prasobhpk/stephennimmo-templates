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
 * <p>Java class for ExerciseProcedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExerciseProcedure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="manualExercise" type="{http://www.fpml.org/FpML-5/confirmation}ManualExercise"/>
 *           &lt;element name="automaticExercise" type="{http://www.fpml.org/FpML-5/confirmation}AutomaticExercise"/>
 *         &lt;/choice>
 *         &lt;element name="followUpConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="limitedRightToConfirm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="splitTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExerciseProcedure", propOrder = {
    "manualExercise",
    "automaticExercise",
    "followUpConfirmation",
    "limitedRightToConfirm",
    "splitTicket"
})
public class ExerciseProcedure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ManualExercise manualExercise;
    protected AutomaticExercise automaticExercise;
    protected boolean followUpConfirmation;
    protected Boolean limitedRightToConfirm;
    protected Boolean splitTicket;

    /**
     * Gets the value of the manualExercise property.
     * 
     * @return
     *     possible object is
     *     {@link ManualExercise }
     *     
     */
    public ManualExercise getManualExercise() {
        return manualExercise;
    }

    /**
     * Sets the value of the manualExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualExercise }
     *     
     */
    public void setManualExercise(ManualExercise value) {
        this.manualExercise = value;
    }

    /**
     * Gets the value of the automaticExercise property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticExercise }
     *     
     */
    public AutomaticExercise getAutomaticExercise() {
        return automaticExercise;
    }

    /**
     * Sets the value of the automaticExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticExercise }
     *     
     */
    public void setAutomaticExercise(AutomaticExercise value) {
        this.automaticExercise = value;
    }

    /**
     * Gets the value of the followUpConfirmation property.
     * 
     */
    public boolean isFollowUpConfirmation() {
        return followUpConfirmation;
    }

    /**
     * Sets the value of the followUpConfirmation property.
     * 
     */
    public void setFollowUpConfirmation(boolean value) {
        this.followUpConfirmation = value;
    }

    /**
     * Gets the value of the limitedRightToConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLimitedRightToConfirm() {
        return limitedRightToConfirm;
    }

    /**
     * Sets the value of the limitedRightToConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLimitedRightToConfirm(Boolean value) {
        this.limitedRightToConfirm = value;
    }

    /**
     * Gets the value of the splitTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitTicket() {
        return splitTicket;
    }

    /**
     * Sets the value of the splitTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitTicket(Boolean value) {
        this.splitTicket = value;
    }

}
