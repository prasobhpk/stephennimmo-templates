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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContractualMatrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractualMatrix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matrixType" type="{http://www.fpml.org/FpML-5/reporting}MatrixType" minOccurs="0"/>
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="matrixTerm" type="{http://www.fpml.org/FpML-5/reporting}MatrixTerm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractualMatrix", propOrder = {
    "matrixType",
    "publicationDate",
    "matrixTerm"
})
public class ContractualMatrix
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MatrixType matrixType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;
    protected MatrixTerm matrixTerm;

    /**
     * Gets the value of the matrixType property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixType }
     *     
     */
    public MatrixType getMatrixType() {
        return matrixType;
    }

    /**
     * Sets the value of the matrixType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixType }
     *     
     */
    public void setMatrixType(MatrixType value) {
        this.matrixType = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the matrixTerm property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixTerm }
     *     
     */
    public MatrixTerm getMatrixTerm() {
        return matrixTerm;
    }

    /**
     * Sets the value of the matrixTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixTerm }
     *     
     */
    public void setMatrixTerm(MatrixTerm value) {
        this.matrixTerm = value;
    }

}
