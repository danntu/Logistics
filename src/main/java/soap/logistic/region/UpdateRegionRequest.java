//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.24 at 07:27:08 PM ALMT 
//


package soap.logistic.region;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="regionNameKk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regionNameRu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regionNameEn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "regionNameKk",
    "regionNameRu",
    "regionNameEn",
    "countryId"
})
@XmlRootElement(name = "updateRegionRequest")
public class UpdateRegionRequest {

    protected long id;
    @XmlElement(required = true)
    protected String regionNameKk;
    @XmlElement(required = true)
    protected String regionNameRu;
    @XmlElement(required = true)
    protected String regionNameEn;
    protected long countryId;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the regionNameKk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionNameKk() {
        return regionNameKk;
    }

    /**
     * Sets the value of the regionNameKk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionNameKk(String value) {
        this.regionNameKk = value;
    }

    /**
     * Gets the value of the regionNameRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionNameRu() {
        return regionNameRu;
    }

    /**
     * Sets the value of the regionNameRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionNameRu(String value) {
        this.regionNameRu = value;
    }

    /**
     * Gets the value of the regionNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionNameEn() {
        return regionNameEn;
    }

    /**
     * Sets the value of the regionNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionNameEn(String value) {
        this.regionNameEn = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(long value) {
        this.countryId = value;
    }

}