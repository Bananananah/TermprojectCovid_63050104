
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for todayCase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="todayCase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseForeign" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="caseNewDiff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="caseNewPrev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="casePrison" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="caseWalkin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deathNewDiff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deathNewPrev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newCaseExcludeabroad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newDeath" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newRecovered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCaseExcludeabroad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalDeath" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalRecovered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weeknum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yearCovid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "todayCase", propOrder = {
    "caseForeign",
    "caseNewDiff",
    "caseNewPrev",
    "casePrison",
    "caseWalkin",
    "deathNewDiff",
    "deathNewPrev",
    "id",
    "newCase",
    "newCaseExcludeabroad",
    "newDeath",
    "newRecovered",
    "totalCase",
    "totalCaseExcludeabroad",
    "totalDeath",
    "totalRecovered",
    "updateDate",
    "weeknum",
    "yearCovid"
})
public class TodayCase {

    protected Integer caseForeign;
    protected Integer caseNewDiff;
    protected Integer caseNewPrev;
    protected Integer casePrison;
    protected Integer caseWalkin;
    protected Integer deathNewDiff;
    protected Integer deathNewPrev;
    protected Integer id;
    protected Integer newCase;
    protected Integer newCaseExcludeabroad;
    protected Integer newDeath;
    protected Integer newRecovered;
    protected Integer totalCase;
    protected Integer totalCaseExcludeabroad;
    protected Integer totalDeath;
    protected Integer totalRecovered;
    protected String updateDate;
    protected Integer weeknum;
    protected Integer yearCovid;

    /**
     * Gets the value of the caseForeign property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseForeign() {
        return caseForeign;
    }

    /**
     * Sets the value of the caseForeign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseForeign(Integer value) {
        this.caseForeign = value;
    }

    /**
     * Gets the value of the caseNewDiff property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    /**
     * Sets the value of the caseNewDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseNewDiff(Integer value) {
        this.caseNewDiff = value;
    }

    /**
     * Gets the value of the caseNewPrev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    /**
     * Sets the value of the caseNewPrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseNewPrev(Integer value) {
        this.caseNewPrev = value;
    }

    /**
     * Gets the value of the casePrison property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCasePrison() {
        return casePrison;
    }

    /**
     * Sets the value of the casePrison property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCasePrison(Integer value) {
        this.casePrison = value;
    }

    /**
     * Gets the value of the caseWalkin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    /**
     * Sets the value of the caseWalkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseWalkin(Integer value) {
        this.caseWalkin = value;
    }

    /**
     * Gets the value of the deathNewDiff property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    /**
     * Sets the value of the deathNewDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeathNewDiff(Integer value) {
        this.deathNewDiff = value;
    }

    /**
     * Gets the value of the deathNewPrev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    /**
     * Sets the value of the deathNewPrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeathNewPrev(Integer value) {
        this.deathNewPrev = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the newCase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewCase() {
        return newCase;
    }

    /**
     * Sets the value of the newCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewCase(Integer value) {
        this.newCase = value;
    }

    /**
     * Gets the value of the newCaseExcludeabroad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    /**
     * Sets the value of the newCaseExcludeabroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewCaseExcludeabroad(Integer value) {
        this.newCaseExcludeabroad = value;
    }

    /**
     * Gets the value of the newDeath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewDeath() {
        return newDeath;
    }

    /**
     * Sets the value of the newDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewDeath(Integer value) {
        this.newDeath = value;
    }

    /**
     * Gets the value of the newRecovered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewRecovered() {
        return newRecovered;
    }

    /**
     * Sets the value of the newRecovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewRecovered(Integer value) {
        this.newRecovered = value;
    }

    /**
     * Gets the value of the totalCase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCase() {
        return totalCase;
    }

    /**
     * Sets the value of the totalCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCase(Integer value) {
        this.totalCase = value;
    }

    /**
     * Gets the value of the totalCaseExcludeabroad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    /**
     * Sets the value of the totalCaseExcludeabroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCaseExcludeabroad(Integer value) {
        this.totalCaseExcludeabroad = value;
    }

    /**
     * Gets the value of the totalDeath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDeath() {
        return totalDeath;
    }

    /**
     * Sets the value of the totalDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDeath(Integer value) {
        this.totalDeath = value;
    }

    /**
     * Gets the value of the totalRecovered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    /**
     * Sets the value of the totalRecovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecovered(Integer value) {
        this.totalRecovered = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the weeknum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeeknum() {
        return weeknum;
    }

    /**
     * Sets the value of the weeknum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeeknum(Integer value) {
        this.weeknum = value;
    }

    /**
     * Gets the value of the yearCovid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearCovid() {
        return yearCovid;
    }

    /**
     * Sets the value of the yearCovid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearCovid(Integer value) {
        this.yearCovid = value;
    }

    public static class TermWebService_Services {

        public TermWebService_Services() {
        }

        public TermWebService getTermWebServicePort() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static class TermWebService {

        public TermWebService() {
        }

        public TodayCase findById(int id) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
