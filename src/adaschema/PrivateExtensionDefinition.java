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
 * <p>Java class for Private_Extension_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Private_Extension_Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="has_abstract_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="abstract" type="{}Abstract"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="has_limited_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="limited" type="{}Limited"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="has_synchronized_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="synchronized" type="{}Synchronized"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ancestor_subtype_indication_q" type="{}Element_Class"/>
 *         &lt;element name="definition_interface_list_ql" type="{}Expression_List"/>
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
@XmlType(name = "Private_Extension_Definition", propOrder = {
    "sloc",
    "hasAbstractQ",
    "hasLimitedQ",
    "hasSynchronizedQ",
    "ancestorSubtypeIndicationQ",
    "definitionInterfaceListQl"
})
public class PrivateExtensionDefinition {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "has_abstract_q", required = true)
    protected HasAbstractQ hasAbstractQ;
    @XmlElement(name = "has_limited_q", required = true)
    protected HasLimitedQ hasLimitedQ;
    @XmlElement(name = "has_synchronized_q", required = true)
    protected HasSynchronizedQ hasSynchronizedQ;
    @XmlElement(name = "ancestor_subtype_indication_q", required = true)
    protected ElementClass ancestorSubtypeIndicationQ;
    @XmlElement(name = "definition_interface_list_ql", required = true)
    protected ExpressionList definitionInterfaceListQl;
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
     * Gets the value of the hasAbstractQ property.
     * 
     * @return
     *     possible object is
     *     {@link HasAbstractQ }
     *     
     */
    public HasAbstractQ getHasAbstractQ() {
        return hasAbstractQ;
    }

    /**
     * Sets the value of the hasAbstractQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link HasAbstractQ }
     *     
     */
    public void setHasAbstractQ(HasAbstractQ value) {
        this.hasAbstractQ = value;
    }

    /**
     * Gets the value of the hasLimitedQ property.
     * 
     * @return
     *     possible object is
     *     {@link HasLimitedQ }
     *     
     */
    public HasLimitedQ getHasLimitedQ() {
        return hasLimitedQ;
    }

    /**
     * Sets the value of the hasLimitedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link HasLimitedQ }
     *     
     */
    public void setHasLimitedQ(HasLimitedQ value) {
        this.hasLimitedQ = value;
    }

    /**
     * Gets the value of the hasSynchronizedQ property.
     * 
     * @return
     *     possible object is
     *     {@link HasSynchronizedQ }
     *     
     */
    public HasSynchronizedQ getHasSynchronizedQ() {
        return hasSynchronizedQ;
    }

    /**
     * Sets the value of the hasSynchronizedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link HasSynchronizedQ }
     *     
     */
    public void setHasSynchronizedQ(HasSynchronizedQ value) {
        this.hasSynchronizedQ = value;
    }

    /**
     * Gets the value of the ancestorSubtypeIndicationQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getAncestorSubtypeIndicationQ() {
        return ancestorSubtypeIndicationQ;
    }

    /**
     * Sets the value of the ancestorSubtypeIndicationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setAncestorSubtypeIndicationQ(ElementClass value) {
        this.ancestorSubtypeIndicationQ = value;
    }

    /**
     * Gets the value of the definitionInterfaceListQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionList }
     *     
     */
    public ExpressionList getDefinitionInterfaceListQl() {
        return definitionInterfaceListQl;
    }

    /**
     * Sets the value of the definitionInterfaceListQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionList }
     *     
     */
    public void setDefinitionInterfaceListQl(ExpressionList value) {
        this.definitionInterfaceListQl = value;
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
     *         &lt;element name="abstract" type="{}Abstract"/>
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
        "_abstract",
        "notAnElement"
    })
    public static class HasAbstractQ {

        @XmlElement(name = "abstract")
        protected Abstract _abstract;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the abstract property.
         * 
         * @return
         *     possible object is
         *     {@link Abstract }
         *     
         */
        public Abstract getAbstract() {
            return _abstract;
        }

        /**
         * Sets the value of the abstract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Abstract }
         *     
         */
        public void setAbstract(Abstract value) {
            this._abstract = value;
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
     *         &lt;element name="limited" type="{}Limited"/>
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
        "limited",
        "notAnElement"
    })
    public static class HasLimitedQ {

        protected Limited limited;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the limited property.
         * 
         * @return
         *     possible object is
         *     {@link Limited }
         *     
         */
        public Limited getLimited() {
            return limited;
        }

        /**
         * Sets the value of the limited property.
         * 
         * @param value
         *     allowed object is
         *     {@link Limited }
         *     
         */
        public void setLimited(Limited value) {
            this.limited = value;
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
     *         &lt;element name="synchronized" type="{}Synchronized"/>
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
        "_synchronized",
        "notAnElement"
    })
    public static class HasSynchronizedQ {

        @XmlElement(name = "synchronized")
        protected Synchronized _synchronized;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the synchronized property.
         * 
         * @return
         *     possible object is
         *     {@link Synchronized }
         *     
         */
        public Synchronized getSynchronized() {
            return _synchronized;
        }

        /**
         * Sets the value of the synchronized property.
         * 
         * @param value
         *     allowed object is
         *     {@link Synchronized }
         *     
         */
        public void setSynchronized(Synchronized value) {
            this._synchronized = value;
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
