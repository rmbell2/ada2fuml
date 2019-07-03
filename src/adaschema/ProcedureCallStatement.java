//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.27 at 12:30:50 PM EDT 
//


package adaschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Procedure_Call_Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Procedure_Call_Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="label_names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="called_name_q" type="{}Expression_Class"/>
 *         &lt;element name="call_statement_parameters_ql" type="{}Association_List"/>
 *         &lt;element name="is_prefix_notation_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="is_prefix_notation" type="{}Is_Prefix_Notation"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="checks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procedure_Call_Statement", propOrder = {
    "sloc",
    "labelNamesQl",
    "calledNameQ",
    "callStatementParametersQl",
    "isPrefixNotationQ"
})
public class ProcedureCallStatement {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "label_names_ql", required = true)
    protected DefiningNameList labelNamesQl;
    @XmlElement(name = "called_name_q", required = true)
    protected ExpressionClass calledNameQ;
    @XmlElement(name = "call_statement_parameters_ql", required = true)
    protected AssociationList callStatementParametersQl;
    @XmlElement(name = "is_prefix_notation_q", required = true)
    protected IsPrefixNotationQ isPrefixNotationQ;
    @XmlAttribute(name = "checks")
    protected String checks;

    /**
     * Gets the value of the sloc property.
     * 
     * @return
     *     possible object is
     *     {@link SourceLocation }
     *     
     */
    public SourceLocation getSloc() {
        return sloc;
    }

    /**
     * Sets the value of the sloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceLocation }
     *     
     */
    public void setSloc(SourceLocation value) {
        this.sloc = value;
    }

    /**
     * Gets the value of the labelNamesQl property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameList }
     *     
     */
    public DefiningNameList getLabelNamesQl() {
        return labelNamesQl;
    }

    /**
     * Sets the value of the labelNamesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameList }
     *     
     */
    public void setLabelNamesQl(DefiningNameList value) {
        this.labelNamesQl = value;
    }

    /**
     * Gets the value of the calledNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getCalledNameQ() {
        return calledNameQ;
    }

    /**
     * Sets the value of the calledNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setCalledNameQ(ExpressionClass value) {
        this.calledNameQ = value;
    }

    /**
     * Gets the value of the callStatementParametersQl property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationList }
     *     
     */
    public AssociationList getCallStatementParametersQl() {
        return callStatementParametersQl;
    }

    /**
     * Sets the value of the callStatementParametersQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationList }
     *     
     */
    public void setCallStatementParametersQl(AssociationList value) {
        this.callStatementParametersQl = value;
    }

    /**
     * Gets the value of the isPrefixNotationQ property.
     * 
     * @return
     *     possible object is
     *     {@link IsPrefixNotationQ }
     *     
     */
    public IsPrefixNotationQ getIsPrefixNotationQ() {
        return isPrefixNotationQ;
    }

    /**
     * Sets the value of the isPrefixNotationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsPrefixNotationQ }
     *     
     */
    public void setIsPrefixNotationQ(IsPrefixNotationQ value) {
        this.isPrefixNotationQ = value;
    }

    /**
     * Gets the value of the checks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecks() {
        return checks;
    }

    /**
     * Sets the value of the checks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecks(String value) {
        this.checks = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="is_prefix_notation" type="{}Is_Prefix_Notation"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isPrefixNotation",
        "notAnElement"
    })
    public static class IsPrefixNotationQ {

        @XmlElement(name = "is_prefix_notation")
        protected IsPrefixNotation isPrefixNotation;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the isPrefixNotation property.
         * 
         * @return
         *     possible object is
         *     {@link IsPrefixNotation }
         *     
         */
        public IsPrefixNotation getIsPrefixNotation() {
            return isPrefixNotation;
        }

        /**
         * Sets the value of the isPrefixNotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link IsPrefixNotation }
         *     
         */
        public void setIsPrefixNotation(IsPrefixNotation value) {
            this.isPrefixNotation = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

    }

}
