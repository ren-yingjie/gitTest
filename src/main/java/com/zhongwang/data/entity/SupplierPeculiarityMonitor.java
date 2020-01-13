package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierPeculiarityMonitor {
    private Integer id;

    private String companyId;

    private String supplierId;

    private String supplierName;

    private Date addTime;

    private String evaluateTime;

    private String evaluateIndex;

    private String grade;

    private String evaluateDirection;

    private String changeInfo;

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

    public String getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(String evaluateTime) {
        this.evaluateTime = evaluateTime == null ? null : evaluateTime.trim();
    }

    public String getEvaluateIndex() {
        return evaluateIndex;
    }

    public void setEvaluateIndex(String evaluateIndex) {
        this.evaluateIndex = evaluateIndex == null ? null : evaluateIndex.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getEvaluateDirection() {
        return evaluateDirection;
    }

    public void setEvaluateDirection(String evaluateDirection) {
        this.evaluateDirection = evaluateDirection == null ? null : evaluateDirection.trim();
    }

    public String getChangeInfo() {
        return changeInfo;
    }

    public void setChangeInfo(String changeInfo) {
        this.changeInfo = changeInfo == null ? null : changeInfo.trim();
    }
}