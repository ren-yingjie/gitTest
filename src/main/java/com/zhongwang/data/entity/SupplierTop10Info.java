package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierTop10Info {
    private Integer id;
    private String companyId;

    private String supplierId;

    private String supplierName;

    private String supplierArea;

    private String amountScale;

    private Date addTime;

    private String yearTime;

    private String areaScale;

    public String getAreaScale() {
        return areaScale;
    }

    public void setAreaScale(String areaScale) {
        this.areaScale = areaScale;
    }

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

    public String getSupplierArea() {
        return supplierArea;
    }

    public void setSupplierArea(String supplierArea) {
        this.supplierArea = supplierArea == null ? null : supplierArea.trim();
    }

    public String getAmountScale() {
        return amountScale;
    }

    public void setAmountScale(String amountScale) {
        this.amountScale = amountScale == null ? null : amountScale.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getYearTime() {
        return yearTime;
    }

    public void setYearTime(String yearTime) {
        this.yearTime = yearTime == null ? null : yearTime.trim();
    }
}