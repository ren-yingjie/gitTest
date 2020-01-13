package com.zhongwang.data.entity;

public class SupplierSubsciribedInfo {
    private Integer id;

    private String companyId;

    private String supplierId;

    private String supplierName;

    private String shareholderType;

    private String shareholderName;

    private String subscribedWay;

    private String subscribedAmount;

    private String shareScale;

    private String changeSituation;

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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getShareholderType() {
        return shareholderType;
    }

    public void setShareholderType(String shareholderType) {
        this.shareholderType = shareholderType == null ? null : shareholderType.trim();
    }

    public String getShareholderName() {
        return shareholderName;
    }

    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName == null ? null : shareholderName.trim();
    }

    public String getSubscribedWay() {
        return subscribedWay;
    }

    public void setSubscribedWay(String subscribedWay) {
        this.subscribedWay = subscribedWay == null ? null : subscribedWay.trim();
    }

    public String getSubscribedAmount() {
        return subscribedAmount;
    }

    public void setSubscribedAmount(String subscribedAmount) {
        this.subscribedAmount = subscribedAmount == null ? null : subscribedAmount.trim();
    }

    public String getShareScale() {
        return shareScale;
    }

    public void setShareScale(String shareScale) {
        this.shareScale = shareScale == null ? null : shareScale.trim();
    }
}