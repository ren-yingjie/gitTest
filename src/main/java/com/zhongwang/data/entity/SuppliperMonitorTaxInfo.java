package com.zhongwang.data.entity;

import java.util.Date;

public class SuppliperMonitorTaxInfo {
    private Integer id;

    private String companyId;

    private String supplierId;

    private String supplierName;

    private Date addTime;

    private Date updateTime;

    private String evaluateDate;

    private String evaluationType;

    private String evaluationPursuant;

    private String changingSituation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getEvaluateDate() {
        return evaluateDate;
    }

    public void setEvaluateDate(String evaluateDate) {
        this.evaluateDate = evaluateDate == null ? null : evaluateDate.trim();
    }

    public String getEvaluationType() {
        return evaluationType;
    }

    public void setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType == null ? null : evaluationType.trim();
    }

    public String getEvaluationPursuant() {
        return evaluationPursuant;
    }

    public void setEvaluationPursuant(String evaluationPursuant) {
        this.evaluationPursuant = evaluationPursuant == null ? null : evaluationPursuant.trim();
    }

    public String getChangingSituation() {
        return changingSituation;
    }

    public void setChangingSituation(String changingSituation) {
        this.changingSituation = changingSituation == null ? null : changingSituation.trim();
    }
}