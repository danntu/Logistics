//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.24 at 01:59:30 PM ALMT 
//


package soap.logistic.district;

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
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="districtNameKk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="districtNameRu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="districtNameEn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "regionId",
    "cityId",
    "districtNameKk",
    "districtNameRu",
    "districtNameEn"
})
@XmlRootElement(name = "addDistrictRequest")
public class AddDistrictRequest {

    protected long regionId;
    protected long cityId;
    @XmlElement(required = true)
    protected String districtNameKk;
    @XmlElement(required = true)
    protected String districtNameRu;
    @XmlElement(required = true)
    protected String districtNameEn;

    /**
     * Gets the value of the regionId property.
     * 
     */
    public long getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     */
    public void setRegionId(long value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the cityId property.
     * 
     */
    public long getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     */
    public void setCityId(long value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the districtNameKk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictNameKk() {
        return districtNameKk;
    }

    /**
     * Sets the value of the districtNameKk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictNameKk(String value) {
        this.districtNameKk = value;
    }

    /**
     * Gets the value of the districtNameRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictNameRu() {
        return districtNameRu;
    }

    /**
     * Sets the value of the districtNameRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictNameRu(String value) {
        this.districtNameRu = value;
    }

    /**
     * Gets the value of the districtNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictNameEn() {
        return districtNameEn;
    }

    /**
     * Sets the value of the districtNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictNameEn(String value) {
        this.districtNameEn = value;
    }

}
