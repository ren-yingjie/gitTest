package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierHighRiskDetail {
    private Integer id;

    private String companyId;

    private String supplierId;

    private String supplierName;

    private Date updateTime;

    private Date addTime;

    private String riskWarningType;

    private String riskWarningDetail;

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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getRiskWarningType() {
        return riskWarningType;
    }

    public void setRiskWarningType(String riskWarningType) {
        this.riskWarningType = riskWarningType == null ? null : riskWarningType.trim();
    }

    public String getRiskWarningDetail() {
        return riskWarningDetail;
    }

    public void setRiskWarningDetail(String riskWarningDetail) {
        this.riskWarningDetail = riskWarningDetail == null ? null : riskWarningDetail.trim();
    }
}