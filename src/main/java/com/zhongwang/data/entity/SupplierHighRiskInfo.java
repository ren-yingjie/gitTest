package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierHighRiskInfo {
    private Integer id;

    private String companyId;

    private String supplierId;

    private Date addTime;

    private String riskEvent;

    private String riskEventType;

    private String warningDate;

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getRiskEvent() {
        return riskEvent;
    }

    public void setRiskEvent(String riskEvent) {
        this.riskEvent = riskEvent == null ? null : riskEvent.trim();
    }

    public String getRiskEventType() {
        return riskEventType;
    }

    public void setRiskEventType(String riskEventType) {
        this.riskEventType = riskEventType == null ? null : riskEventType.trim();
    }

    public String getWarningDate() {
        return warningDate;
    }

    public void setWarningDate(String warningDate) {
        this.warningDate = warningDate == null ? null : warningDate.trim();
    }
}