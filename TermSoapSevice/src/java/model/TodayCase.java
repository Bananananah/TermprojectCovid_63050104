/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nickk
 */
@Entity
@Table(name = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TodayCase.findAll", query = "SELECT c FROM TodayCase c"),
    @NamedQuery(name = "TodayCase.findById", query = "SELECT c FROM TodayCase c WHERE c.id = :id"),
    @NamedQuery(name = "TodayCase.findByYearCovid", query = "SELECT c FROM TodayCase c WHERE c.yearCovid = :yearCovid"),
    @NamedQuery(name = "TodayCase.findByWeeknum", query = "SELECT c FROM TodayCase c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "TodayCase.findByNewCase", query = "SELECT c FROM TodayCase c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "TodayCase.findByTotalCase", query = "SELECT c FROM TodayCase c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "TodayCase.findByNewCaseExcludeabroad", query = "SELECT c FROM TodayCase c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "TodayCase.findByTotalCaseExcludeabroad", query = "SELECT c FROM TodayCase c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "TodayCase.findByNewRecovered", query = "SELECT c FROM TodayCase c WHERE c.newRecovered = :newRecovered"),
    @NamedQuery(name = "TodayCase.findByTotalRecovered", query = "SELECT c FROM TodayCase c WHERE c.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "TodayCase.findByNewDeath", query = "SELECT c FROM TodayCase c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "TodayCase.findByTotalDeath", query = "SELECT c FROM TodayCase c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "TodayCase.findByCaseForeign", query = "SELECT c FROM TodayCase c WHERE c.caseForeign = :caseForeign"),
    @NamedQuery(name = "TodayCase.findByCasePrison", query = "SELECT c FROM TodayCase c WHERE c.casePrison = :casePrison"),
    @NamedQuery(name = "TodayCase.findByCaseNewPrev", query = "SELECT c FROM TodayCase c WHERE c.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "TodayCase.findByCaseNewDiff", query = "SELECT c FROM TodayCase c WHERE c.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "TodayCase.findByCaseWalkin", query = "SELECT c FROM TodayCase c WHERE c.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "TodayCase.findByDeathNewPrev", query = "SELECT c FROM TodayCase c WHERE c.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "TodayCase.findByDeathNewDiff", query = "SELECT c FROM TodayCase c WHERE c.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "TodayCase.findByUpdateDate", query = "SELECT c FROM TodayCase c WHERE c.updateDate = :updateDate")})
public class TodayCase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "YEAR_COVID")
    private Integer yearCovid;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;
    @Size(max = 80)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public TodayCase() {
    }

    public TodayCase(Integer id, Integer yearCovid, Integer weeknum, Integer newCase, Integer totalCase, Integer newCaseExcludeabroad, Integer totalCaseExcludeabroad, Integer newRecovered, Integer totalRecovered, Integer newDeath, Integer totalDeath, Integer caseForeign, Integer casePrison, Integer caseNewPrev, Integer caseNewDiff, Integer caseWalkin, Integer deathNewPrev, Integer deathNewDiff, String updateDate) {
        this.id = id;
        this.yearCovid = yearCovid;
        this.weeknum = weeknum;
        this.newCase = newCase;
        this.totalCase = totalCase;
        this.newCaseExcludeabroad = newCaseExcludeabroad;
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
        this.newDeath = newDeath;
        this.totalDeath = totalDeath;
        this.caseForeign = caseForeign;
        this.casePrison = casePrison;
        this.caseNewPrev = caseNewPrev;
        this.caseNewDiff = caseNewDiff;
        this.caseWalkin = caseWalkin;
        this.deathNewPrev = deathNewPrev;
        this.deathNewDiff = deathNewDiff;
        this.updateDate = updateDate;
    }

    public TodayCase(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYearCovid() {
        return yearCovid;
    }

    public void setYearCovid(Integer yearCovid) {
        this.yearCovid = yearCovid;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TodayCase)) {
            return false;
        }
        TodayCase other = (TodayCase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TodayCasel[ id=" + id + " ]";
    }
    
}