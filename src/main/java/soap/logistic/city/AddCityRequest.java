//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.15 at 04:58:19 PM ALMT 
//


package soap.logistic.city;

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
 *         &lt;element name="cityNameEn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityNameRu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityNameKk" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "cityNameEn",
    "cityNameRu",
    "cityNameKk"
})
@XmlRootElement(name = "addCityRequest")
public class AddCityRequest {

    @XmlElement(required = true)
    protected String cityNameEn;
    @XmlElement(required = true)
    protected String cityNameRu;
    @XmlElement(required = true)
    protected String cityNameKk;

    /**
     * Gets the value of the cityNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityNameEn() {
        return cityNameEn;
    }

    /**
     * Sets the value of the cityNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityNameEn(String value) {
        this.cityNameEn = value;
    }

    /**
     * Gets the value of the cityNameRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityNameRu() {
        return cityNameRu;
    }

    /**
     * Sets the value of the cityNameRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityNameRu(String value) {
        this.cityNameRu = value;
    }

    /**
     * Gets the value of the cityNameKk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityNameKk() {
        return cityNameKk;
    }

    /**
     * Sets the value of the cityNameKk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityNameKk(String value) {
        this.cityNameKk = value;
    }

}
