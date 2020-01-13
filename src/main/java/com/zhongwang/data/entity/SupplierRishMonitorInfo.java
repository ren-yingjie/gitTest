package com.zhongwang.data.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class SupplierRishMonitorInfo {
    private Integer id;
    private String companyId;
    private String supplierId;

    private String supplierName;
    @JSONField(format="yyyy-MM-dd")
    private Date addTime;

    private String monitoringType;

    private String monitoringSource;

    private String monitoringTime;

    private String beforeChange;

    private String afterChange;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

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

    public String getMonitoringType() {
        return monitoringType;
    }

    public void setMonitoringType(String monitoringType) {
        this.monitoringType = monitoringType == null ? null : monitoringType.trim();
    }

    public String getMonitoringSource() {
        return monitoringSource;
    }

    public void setMonitoringSource(String monitoringSource) {
        this.monitoringSource = monitoringSource == null ? null : monitoringSource.trim();
    }

    public String getMonitoringTime() {
        return monitoringTime;
    }

    public void setMonitoringTime(String monitoringTime) {
        this.monitoringTime = monitoringTime == null ? null : monitoringTime.trim();
    }

    public String getBeforeChange() {
        return beforeChange;
    }

    public void setBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange == null ? null : beforeChange.trim();
    }

    public String getAfterChange() {
        return afterChange;
    }

    public void setAfterChange(String afterChange) {
        this.afterChange = afterChange == null ? null : afterChange.trim();
    }
}