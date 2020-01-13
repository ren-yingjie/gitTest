package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierMonitorInvoiceInfo {
    private Integer id;

    private String companyId;

    private String supplierId;

    private String supplierName;

    private Date addTime;

    private Date updateTime;

    private String countScale;

    private String amountScale;

    private String invoiceType;

    private String dataType;

    private String monitorDate;

    private String consecutiveNumbersScale;

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

    public String getCountScale() {
        return countScale;
    }

    public void setCountScale(String countScale) {
        this.countScale = countScale == null ? null : countScale.trim();
    }

    public String getAmountScale() {
        return amountScale;
    }

    public void setAmountScale(String amountScale) {
        this.amountScale = amountScale == null ? null : amountScale.trim();
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getMonitorDate() {
        return monitorDate;
    }

    public void setMonitorDate(String monitorDate) {
        this.monitorDate = monitorDate == null ? null : monitorDate.trim();
    }

    public String getConsecutiveNumbersScale() {
        return consecutiveNumbersScale;
    }

    public void setConsecutiveNumbersScale(String consecutiveNumbersScale) {
        this.consecutiveNumbersScale = consecutiveNumbersScale == null ? null : consecutiveNumbersScale.trim();
    }
}