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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * Descibes the averaging period properties for an asian option.
 * 
 * <p>Java class for FxAsianFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAsianFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryRateSource" type="{http://www.fpml.org/FpML-5/confirmation}InformationSource"/>
 *         &lt;element name="secondaryRateSource" type="{http://www.fpml.org/FpML-5/confirmation}InformationSource" minOccurs="0"/>
 *         &lt;element name="fixingTime" type="{http://www.fpml.org/FpML-5/confirmation}BusinessCenterTime"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="observationSchedule" type="{http://www.fpml.org/FpML-5/confirmation}FxAverageRateObservationSchedule"/>
 *             &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FxRateObservation.model" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FxRateObservation.model"/>
 *         &lt;/choice>
 *         &lt;element name="payoutFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAsianFeature", propOrder = {
    "content"
})
public class FxAsianFeature implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "rateObservation", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "observationSchedule", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "payoutFormula", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "fixingTime", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "primaryRateSource", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "precision", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "rateObservationQuoteBasis", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class),
        @XmlElementRef(name = "secondaryRateSource", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "RateObservation" is used by two different parts of a schema. See: 
     * line 827 of file:/C:/eclipse/workspace/fpml/src/main/schema/confirmation/fpml-fx-5-1.xsd
     * line 827 of file:/C:/eclipse/workspace/fpml/src/main/schema/confirmation/fpml-fx-5-1.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FxAverageRateObservation }{@code >}
     * {@link JAXBElement }{@code <}{@link FxAverageRateObservationSchedule }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BusinessCenterTime }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationSource }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link StrikeQuoteBasisEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationSource }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
