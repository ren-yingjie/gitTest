package com.zhongwang.data.entity;

public class SupplierSeniorInfo {
    private Integer id;

    private String companyId;

    private String supplierId;

    private String seniorName;

    private String position;

    private String changeSituation;

    private String supplierName;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getChangeSituation() {
        return changeSituation;
    }

    public void setChangeSituation(String changeSituation) {
        this.changeSituation = changeSituation;
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

    public String getSeniorName() {
        return seniorName;
    }

    public void setSeniorName(String seniorName) {
        this.seniorName = seniorName == null ? null : seniorName.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}