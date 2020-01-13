package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierCorrelationInfo {
    private Integer id;
    private String companyId;
    private String supplierId;

    private String supplierName;

    private Date addTime;

    private String comprehensiveCorrelation;

    private String basedCorrelation;

    private String regionalCorrelation;

    private String productsAssociation;

    private String otherAssociation;

    private String correlationSupplier;

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

    public String getComprehensiveCorrelation() {
        return comprehensiveCorrelation;
    }

    public void setComprehensiveCorrelation(String comprehensiveCorrelation) {
        this.comprehensiveCorrelation = comprehensiveCorrelation == null ? null : comprehensiveCorrelation.trim();
    }

    public String getBasedCorrelation() {
        return basedCorrelation;
    }

    public void setBasedCorrelation(String basedCorrelation) {
        this.basedCorrelation = basedCorrelation == null ? null : basedCorrelation.trim();
    }

    public String getRegionalCorrelation() {
        return regionalCorrelation;
    }

    public void setRegionalCorrelation(String regionalCorrelation) {
        this.regionalCorrelation = regionalCorrelation == null ? null : regionalCorrelation.trim();
    }

    public String getProductsAssociation() {
        return productsAssociation;
    }

    public void setProductsAssociation(String productsAssociation) {
        this.productsAssociation = productsAssociation == null ? null : productsAssociation.trim();
    }

    public String getOtherAssociation() {
        return otherAssociation;
    }

    public void setOtherAssociation(String otherAssociation) {
        this.otherAssociation = otherAssociation == null ? null : otherAssociation.trim();
    }

    public String getCorrelationSupplier() {
        return correlationSupplier;
    }

    public void setCorrelationSupplier(String correlationSupplier) {
        this.correlationSupplier = correlationSupplier == null ? null : correlationSupplier.trim();
    }
}