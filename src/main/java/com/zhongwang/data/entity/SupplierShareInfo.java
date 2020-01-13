package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierShareInfo {
    private Integer id;

    private String companyId;

    private String supplierId;
    private String supplierName;

    private Date addTime;

    private String shareholder;

    private String monitorDate;

    private String equityChain;

    private  String changeSituation;

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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getShareholder() {
        return shareholder;
    }

    public void setShareholder(String shareholder) {
        this.shareholder = shareholder == null ? null : shareholder.trim();
    }

    public String getMonitorDate() {
        return monitorDate;
    }

    public void setMonitorDate(String monitorDate) {
        this.monitorDate = monitorDate == null ? null : monitorDate.trim();
    }

    public String getEquityChain() {
        return equityChain;
    }

    public void setEquityChain(String equityChain) {
        this.equityChain = equityChain == null ? null : equityChain.trim();
    }
}