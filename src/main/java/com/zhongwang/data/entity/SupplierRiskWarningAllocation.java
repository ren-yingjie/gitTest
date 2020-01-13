package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierRiskWarningAllocation {
    private Integer id;

    private String uuid;

    private String companyId;

    private String supplierId;

    private String warningEvents;

    private Date addTime;

    private Date updateTime;

    private String lowGrade;

    private String highGrade;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
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

    public String getWarningEvents() {
        return warningEvents;
    }

    public void setWarningEvents(String warningEvents) {
        this.warningEvents = warningEvents == null ? null : warningEvents.trim();
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

    public String getLowGrade() {
        return lowGrade;
    }

    public void setLowGrade(String lowGrade) {
        this.lowGrade = lowGrade == null ? null : lowGrade.trim();
    }

    public String getHighGrade() {
        return highGrade;
    }

    public void setHighGrade(String highGrade) {
        this.highGrade = highGrade == null ? null : highGrade.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}