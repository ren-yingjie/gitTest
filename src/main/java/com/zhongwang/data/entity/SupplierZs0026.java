package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierZs0026 {
    private Integer id;

    private String supplierId;

    private String companyId;

    private Date addTime;

    private String decisionDate;

    private String regNumber;

    private String legalPersonName;

    private String departmentName;

    private String punishNumber;

    private String publishDate;

    private String base;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(String decisionDate) {
        this.decisionDate = decisionDate == null ? null : decisionDate.trim();
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber == null ? null : regNumber.trim();
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName == null ? null : legalPersonName.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getPunishNumber() {
        return punishNumber;
    }

    public void setPunishNumber(String punishNumber) {
        this.punishNumber = punishNumber == null ? null : punishNumber.trim();
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate == null ? null : publishDate.trim();
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base == null ? null : base.trim();
    }
}