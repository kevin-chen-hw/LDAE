//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.22 at 11:46:25 AM CST 
//


package org.hibernate.internal.jaxb.mapping.hbm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for key-property-element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="key-property-element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meta" type="{http://www.hibernate.org/xsd/hibernate-mapping}meta-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="column" type="{http://www.hibernate.org/xsd/hibernate-mapping}column-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.hibernate.org/xsd/hibernate-mapping}type-element" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "key-property-element", propOrder = {
    "meta",
    "column",
    "type"
})
public class JaxbKeyPropertyElement {

    protected List<JaxbMetaElement> meta;
    protected List<JaxbColumnElement> column;
    protected JaxbTypeElement type;
    @XmlAttribute
    protected String access;
    @XmlAttribute(name = "column")
    protected String columnAttribute;
    @XmlAttribute
    protected String length;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String node;
    @XmlAttribute(name = "type")
    protected String typeAttribute;

    /**
     * Gets the value of the meta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbMetaElement }
     * 
     * 
     */
    public List<JaxbMetaElement> getMeta() {
        if (meta == null) {
            meta = new ArrayList<JaxbMetaElement>();
        }
        return this.meta;
    }

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbColumnElement }
     * 
     * 
     */
    public List<JaxbColumnElement> getColumn() {
        if (column == null) {
            column = new ArrayList<JaxbColumnElement>();
        }
        return this.column;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbTypeElement }
     *     
     */
    public JaxbTypeElement getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbTypeElement }
     *     
     */
    public void setType(JaxbTypeElement value) {
        this.type = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccess(String value) {
        this.access = value;
    }

    /**
     * Gets the value of the columnAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnAttribute() {
        return columnAttribute;
    }

    /**
     * Sets the value of the columnAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnAttribute(String value) {
        this.columnAttribute = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the typeAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAttribute() {
        return typeAttribute;
    }

    /**
     * Sets the value of the typeAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAttribute(String value) {
        this.typeAttribute = value;
    }

}