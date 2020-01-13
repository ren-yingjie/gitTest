package com.zhongwang.data.entity.fulfill;

/**
 * 失信信息
 */
public class BrokenPromiseInfo {

    private String companyId;
    private String id;
    private String supplierid;
    private String businessentity;
    private String courtname;
    private String regdate;
    private String disrupttypename;

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

    public void setBusinessentity(String businessentity) {
        this.businessentity = businessentity;
    }

    public void setCourtname(String courtname) {
        this.courtname = courtname;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public void setDisrupttypename(String disrupttypename) {
        this.disrupttypename = disrupttypename;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getBusinessentity() {
        return businessentity;
    }

    public String getCourtname() {
        return courtname;
    }

    public String getRegdate() {
        return regdate;
    }

    public String getDisrupttypename() {
        return disrupttypename;
    }
}
