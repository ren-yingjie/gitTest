package com.zhongwang.data.entity;

public class SuppliserRishInfo {
    private Integer id;
    private String companyId;
    private String supplierId;

    private String supplierName;

    private String rishGrade;

    private String rishScore;

    private String warningEvents;

    private String purchasingRanking;
    private  String warningAmount;
    private String warningDate;

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
        this.companyId = companyId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getRishGrade() {
        return rishGrade;
    }

    public void setRishGrade(String rishGrade) {
        this.rishGrade = rishGrade;
    }

    public String getRishScore() {
        return rishScore;
    }

    public void setRishScore(String rishScore) {
        this.rishScore = rishScore;
    }

    public String getWarningEvents() {
        return warningEvents;
    }

    public void setWarningEvents(String warningEvents) {
        this.warningEvents = warningEvents;
    }

    public String getPurchasingRanking() {
        return purchasingRanking;
    }

    public void setPurchasingRanking(String purchasingRanking) {
        this.purchasingRanking = purchasingRanking;
    }

    public String getWarningAmount() {
        return warningAmount;
    }

    public void setWarningAmount(String warningAmount) {
        this.warningAmount = warningAmount;
    }

    public String getWarningDate() {
        return warningDate;
    }

    public void setWarningDate(String warningDate) {
        this.warningDate = warningDate;
    }
}