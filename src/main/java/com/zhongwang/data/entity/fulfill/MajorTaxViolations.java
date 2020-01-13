package com.zhongwang.data.entity.fulfill;

/**
 * 重大税收违法
 */
public class MajorTaxViolations {

    private String companyId;
    private String supplierid;
    private String id;
    private String suppliername;
    private String removeDepartment;
    private String putDate;
    private String putReason;

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getSupplierid() {
        return supplierid;
    }
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public void setRemoveDepartment(String removeDepartment) {
        this.removeDepartment = removeDepartment;
    }

    public void setPutDate(String putDate) {
        this.putDate = putDate;
    }

    public void setPutReason(String putReason) {
        this.putReason = putReason;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public String getRemoveDepartment() {
        return removeDepartment;
    }

    public String getPutDate() {
        return putDate;
    }

    public String getPutReason() {
        return putReason;
    }
}
