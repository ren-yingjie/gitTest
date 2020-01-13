package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierRiskQualityInfo {
    private Integer id;

    private String companyId;

    private String supplierId;

    private String supplierName;

    private String supplierGoods;

    private String specification;

    private String batchNumber;

    private String belowStandard;

    private Date addTime;

    private String publishDate;

    private String status;

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

    public String getSupplierGoods() {
        return supplierGoods;
    }

    public void setSupplierGoods(String supplierGoods) {
        this.supplierGoods = supplierGoods == null ? null : supplierGoods.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public String getBelowStandard() {
        return belowStandard;
    }

    public void setBelowStandard(String belowStandard) {
        this.belowStandard = belowStandard == null ? null : belowStandard.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate == null ? null : publishDate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}