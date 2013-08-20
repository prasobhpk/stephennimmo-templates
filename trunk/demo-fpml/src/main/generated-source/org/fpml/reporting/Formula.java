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
 * A type describing a financial formula, with its description and components.
 * 
 * <p>Java class for Formula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Formula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formulaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="math" type="{http://www.fpml.org/FpML-5/reporting}Math" minOccurs="0"/>
 *         &lt;element name="formulaComponent" type="{http://www.fpml.org/FpML-5/reporting}FormulaComponent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Formula", propOrder = {
    "formulaDescription",
    "math",
    "formulaComponent"
})
public class Formula
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String formulaDescription;
    protected Math math;
    protected List<FormulaComponent> formulaComponent;

    /**
     * Gets the value of the formulaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaDescription() {
        return formulaDescription;
    }

    /**
     * Sets the value of the formulaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaDescription(String value) {
        this.formulaDescription = value;
    }

    /**
     * Gets the value of the math property.
     * 
     * @return
     *     possible object is
     *     {@link Math }
     *     
     */
    public Math getMath() {
        return math;
    }

    /**
     * Sets the value of the math property.
     * 
     * @param value
     *     allowed object is
     *     {@link Math }
     *     
     */
    public void setMath(Math value) {
        this.math = value;
    }

    /**
     * Gets the value of the formulaComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formulaComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormulaComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormulaComponent }
     * 
     * 
     */
    public List<FormulaComponent> getFormulaComponent() {
        if (formulaComponent == null) {
            formulaComponent = new ArrayList<FormulaComponent>();
        }
        return this.formulaComponent;
    }

}
