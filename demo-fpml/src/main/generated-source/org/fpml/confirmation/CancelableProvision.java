//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.01 at 08:58:05 AM CDT 
//


package org.fpml.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the right of a party to cancel a swap transaction on the specified exercise dates. The provision is for 'walkaway' cancellation (i.e. the fair value of the swap is not paid). A fee payable on exercise can be specified.
 * 
 * <p>Java class for CancelableProvision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelableProvision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}BuyerSeller.model"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}exercise"/>
 *         &lt;element name="exerciseNotice" type="{http://www.fpml.org/FpML-5/confirmation}ExerciseNotice" minOccurs="0"/>
 *         &lt;element name="followUpConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancelableProvisionAdjustedDates" type="{http://www.fpml.org/FpML-5/confirmation}CancelableProvisionAdjustedDates" minOccurs="0"/>
 *         &lt;element name="finalCalculationPeriodDateAdjustment" type="{http://www.fpml.org/FpML-5/confirmation}FinalCalculationPeriodDateAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="initialFee" type="{http://www.fpml.org/FpML-5/confirmation}SimplePayment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelableProvision", propOrder = {
    "buyerPartyReference",
    "buyerAccountReference",
    "sellerPartyReference",
    "sellerAccountReference",
    "exercise",
    "exerciseNotice",
    "followUpConfirmation",
    "cancelableProvisionAdjustedDates",
    "finalCalculationPeriodDateAdjustment",
    "initialFee"
})
public class CancelableProvision
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PartyReference buyerPartyReference;
    protected AccountReference buyerAccountReference;
    @XmlElement(required = true)
    protected PartyReference sellerPartyReference;
    protected AccountReference sellerAccountReference;
    @XmlElementRef(name = "exercise", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class)
    protected JAXBElement<? extends Exercise> exercise;
    protected ExerciseNotice exerciseNotice;
    protected boolean followUpConfirmation;
    protected CancelableProvisionAdjustedDates cancelableProvisionAdjustedDates;
    protected List<FinalCalculationPeriodDateAdjustment> finalCalculationPeriodDateAdjustment;
    protected SimplePayment initialFee;

    /**
     * Gets the value of the buyerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBuyerPartyReference() {
        return buyerPartyReference;
    }

    /**
     * Sets the value of the buyerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBuyerPartyReference(PartyReference value) {
        this.buyerPartyReference = value;
    }

    /**
     * Gets the value of the buyerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getBuyerAccountReference() {
        return buyerAccountReference;
    }

    /**
     * Sets the value of the buyerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setBuyerAccountReference(AccountReference value) {
        this.buyerAccountReference = value;
    }

    /**
     * Gets the value of the sellerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getSellerPartyReference() {
        return sellerPartyReference;
    }

    /**
     * Sets the value of the sellerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setSellerPartyReference(PartyReference value) {
        this.sellerPartyReference = value;
    }

    /**
     * Gets the value of the sellerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getSellerAccountReference() {
        return sellerAccountReference;
    }

    /**
     * Sets the value of the sellerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setSellerAccountReference(AccountReference value) {
        this.sellerAccountReference = value;
    }

    /**
     * Gets the value of the exercise property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BermudaExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmericanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link EuropeanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exercise }{@code >}
     *     
     */
    public JAXBElement<? extends Exercise> getExercise() {
        return exercise;
    }

    /**
     * Sets the value of the exercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BermudaExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmericanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link EuropeanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exercise }{@code >}
     *     
     */
    public void setExercise(JAXBElement<? extends Exercise> value) {
        this.exercise = ((JAXBElement<? extends Exercise> ) value);
    }

    /**
     * Gets the value of the exerciseNotice property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseNotice }
     *     
     */
    public ExerciseNotice getExerciseNotice() {
        return exerciseNotice;
    }

    /**
     * Sets the value of the exerciseNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseNotice }
     *     
     */
    public void setExerciseNotice(ExerciseNotice value) {
        this.exerciseNotice = value;
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
     * Gets the value of the cancelableProvisionAdjustedDates property.
     * 
     * @return
     *     possible object is
     *     {@link CancelableProvisionAdjustedDates }
     *     
     */
    public CancelableProvisionAdjustedDates getCancelableProvisionAdjustedDates() {
        return cancelableProvisionAdjustedDates;
    }

    /**
     * Sets the value of the cancelableProvisionAdjustedDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelableProvisionAdjustedDates }
     *     
     */
    public void setCancelableProvisionAdjustedDates(CancelableProvisionAdjustedDates value) {
        this.cancelableProvisionAdjustedDates = value;
    }

    /**
     * Gets the value of the finalCalculationPeriodDateAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalCalculationPeriodDateAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalCalculationPeriodDateAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinalCalculationPeriodDateAdjustment }
     * 
     * 
     */
    public List<FinalCalculationPeriodDateAdjustment> getFinalCalculationPeriodDateAdjustment() {
        if (finalCalculationPeriodDateAdjustment == null) {
            finalCalculationPeriodDateAdjustment = new ArrayList<FinalCalculationPeriodDateAdjustment>();
        }
        return this.finalCalculationPeriodDateAdjustment;
    }

    /**
     * Gets the value of the initialFee property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePayment }
     *     
     */
    public SimplePayment getInitialFee() {
        return initialFee;
    }

    /**
     * Sets the value of the initialFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePayment }
     *     
     */
    public void setInitialFee(SimplePayment value) {
        this.initialFee = value;
    }

}
