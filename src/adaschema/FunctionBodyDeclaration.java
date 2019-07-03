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
 * <p>Java class for Function_Body_Declaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Function_Body_Declaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="is_overriding_declaration_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="overriding" type="{}Overriding"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="is_not_overriding_declaration_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="not_overriding" type="{}Not_Overriding"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="parameter_profile_ql" type="{}Parameter_Specification_List"/>
 *         &lt;element name="is_not_null_return_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="not_null_return" type="{}Not_Null_Return"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="result_profile_q" type="{}Element_Class"/>
 *         &lt;element name="aspect_specifications_ql" type="{}Element_List"/>
 *         &lt;element name="body_declarative_items_ql" type="{}Element_List"/>
 *         &lt;element name="body_statements_ql" type="{}Statement_List"/>
 *         &lt;element name="body_exception_handlers_ql" type="{}Exception_Handler_List"/>
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
@XmlType(name = "Function_Body_Declaration", propOrder = {
    "sloc",
    "isOverridingDeclarationQ",
    "isNotOverridingDeclarationQ",
    "namesQl",
    "parameterProfileQl",
    "isNotNullReturnQ",
    "resultProfileQ",
    "aspectSpecificationsQl",
    "bodyDeclarativeItemsQl",
    "bodyStatementsQl",
    "bodyExceptionHandlersQl"
})
public class FunctionBodyDeclaration {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "is_overriding_declaration_q", required = true)
    protected IsOverridingDeclarationQ isOverridingDeclarationQ;
    @XmlElement(name = "is_not_overriding_declaration_q", required = true)
    protected IsNotOverridingDeclarationQ isNotOverridingDeclarationQ;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "parameter_profile_ql", required = true)
    protected ParameterSpecificationList parameterProfileQl;
    @XmlElement(name = "is_not_null_return_q", required = true)
    protected IsNotNullReturnQ isNotNullReturnQ;
    @XmlElement(name = "result_profile_q", required = true)
    protected ElementClass resultProfileQ;
    @XmlElement(name = "aspect_specifications_ql", required = true)
    protected ElementList aspectSpecificationsQl;
    @XmlElement(name = "body_declarative_items_ql", required = true)
    protected ElementList bodyDeclarativeItemsQl;
    @XmlElement(name = "body_statements_ql", required = true)
    protected StatementList bodyStatementsQl;
    @XmlElement(name = "body_exception_handlers_ql", required = true)
    protected ExceptionHandlerList bodyExceptionHandlersQl;
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
     * Gets the value of the isOverridingDeclarationQ property.
     * 
     * @return
     *     possible object is
     *     {@link IsOverridingDeclarationQ }
     *     
     */
    public IsOverridingDeclarationQ getIsOverridingDeclarationQ() {
        return isOverridingDeclarationQ;
    }

    /**
     * Sets the value of the isOverridingDeclarationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsOverridingDeclarationQ }
     *     
     */
    public void setIsOverridingDeclarationQ(IsOverridingDeclarationQ value) {
        this.isOverridingDeclarationQ = value;
    }

    /**
     * Gets the value of the isNotOverridingDeclarationQ property.
     * 
     * @return
     *     possible object is
     *     {@link IsNotOverridingDeclarationQ }
     *     
     */
    public IsNotOverridingDeclarationQ getIsNotOverridingDeclarationQ() {
        return isNotOverridingDeclarationQ;
    }

    /**
     * Sets the value of the isNotOverridingDeclarationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsNotOverridingDeclarationQ }
     *     
     */
    public void setIsNotOverridingDeclarationQ(IsNotOverridingDeclarationQ value) {
        this.isNotOverridingDeclarationQ = value;
    }

    /**
     * Gets the value of the namesQl property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameList }
     *     
     */
    public DefiningNameList getNamesQl() {
        return namesQl;
    }

    /**
     * Sets the value of the namesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameList }
     *     
     */
    public void setNamesQl(DefiningNameList value) {
        this.namesQl = value;
    }

    /**
     * Gets the value of the parameterProfileQl property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterSpecificationList }
     *     
     */
    public ParameterSpecificationList getParameterProfileQl() {
        return parameterProfileQl;
    }

    /**
     * Sets the value of the parameterProfileQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterSpecificationList }
     *     
     */
    public void setParameterProfileQl(ParameterSpecificationList value) {
        this.parameterProfileQl = value;
    }

    /**
     * Gets the value of the isNotNullReturnQ property.
     * 
     * @return
     *     possible object is
     *     {@link IsNotNullReturnQ }
     *     
     */
    public IsNotNullReturnQ getIsNotNullReturnQ() {
        return isNotNullReturnQ;
    }

    /**
     * Sets the value of the isNotNullReturnQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsNotNullReturnQ }
     *     
     */
    public void setIsNotNullReturnQ(IsNotNullReturnQ value) {
        this.isNotNullReturnQ = value;
    }

    /**
     * Gets the value of the resultProfileQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getResultProfileQ() {
        return resultProfileQ;
    }

    /**
     * Sets the value of the resultProfileQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setResultProfileQ(ElementClass value) {
        this.resultProfileQ = value;
    }

    /**
     * Gets the value of the aspectSpecificationsQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getAspectSpecificationsQl() {
        return aspectSpecificationsQl;
    }

    /**
     * Sets the value of the aspectSpecificationsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setAspectSpecificationsQl(ElementList value) {
        this.aspectSpecificationsQl = value;
    }

    /**
     * Gets the value of the bodyDeclarativeItemsQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getBodyDeclarativeItemsQl() {
        return bodyDeclarativeItemsQl;
    }

    /**
     * Sets the value of the bodyDeclarativeItemsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setBodyDeclarativeItemsQl(ElementList value) {
        this.bodyDeclarativeItemsQl = value;
    }

    /**
     * Gets the value of the bodyStatementsQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getBodyStatementsQl() {
        return bodyStatementsQl;
    }

    /**
     * Sets the value of the bodyStatementsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setBodyStatementsQl(StatementList value) {
        this.bodyStatementsQl = value;
    }

    /**
     * Gets the value of the bodyExceptionHandlersQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionHandlerList }
     *     
     */
    public ExceptionHandlerList getBodyExceptionHandlersQl() {
        return bodyExceptionHandlersQl;
    }

    /**
     * Sets the value of the bodyExceptionHandlersQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionHandlerList }
     *     
     */
    public void setBodyExceptionHandlersQl(ExceptionHandlerList value) {
        this.bodyExceptionHandlersQl = value;
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
     *         &lt;element name="not_null_return" type="{}Not_Null_Return"/>
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
        "notNullReturn",
        "notAnElement"
    })
    public static class IsNotNullReturnQ {

        @XmlElement(name = "not_null_return")
        protected NotNullReturn notNullReturn;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the notNullReturn property.
         * 
         * @return
         *     possible object is
         *     {@link NotNullReturn }
         *     
         */
        public NotNullReturn getNotNullReturn() {
            return notNullReturn;
        }

        /**
         * Sets the value of the notNullReturn property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotNullReturn }
         *     
         */
        public void setNotNullReturn(NotNullReturn value) {
            this.notNullReturn = value;
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
     *         &lt;element name="not_overriding" type="{}Not_Overriding"/>
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
        "notOverriding",
        "notAnElement"
    })
    public static class IsNotOverridingDeclarationQ {

        @XmlElement(name = "not_overriding")
        protected NotOverriding notOverriding;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the notOverriding property.
         * 
         * @return
         *     possible object is
         *     {@link NotOverriding }
         *     
         */
        public NotOverriding getNotOverriding() {
            return notOverriding;
        }

        /**
         * Sets the value of the notOverriding property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotOverriding }
         *     
         */
        public void setNotOverriding(NotOverriding value) {
            this.notOverriding = value;
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
     *         &lt;element name="overriding" type="{}Overriding"/>
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
        "overriding",
        "notAnElement"
    })
    public static class IsOverridingDeclarationQ {

        protected Overriding overriding;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the overriding property.
         * 
         * @return
         *     possible object is
         *     {@link Overriding }
         *     
         */
        public Overriding getOverriding() {
            return overriding;
        }

        /**
         * Sets the value of the overriding property.
         * 
         * @param value
         *     allowed object is
         *     {@link Overriding }
         *     
         */
        public void setOverriding(Overriding value) {
            this.overriding = value;
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
