package com.zhongwang.data.entity.fulfill;

/**
 * 履约指数
 */
public class PerformanceIndex {

    private String companyId;
    private String id;
    private String supplierid;
    private String suppliername;
    private String addtime;
    private String rishgrade;
    private String perfindex;
    private String generatereportdate;

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public void setRishgrade(String rishgrade) {
        this.rishgrade = rishgrade;
    }

    public void setPerfindex(String perfindex) {
        this.perfindex = perfindex;
    }

    public void setGeneratereportdate(String generatereportdate) {
        this.generatereportdate = generatereportdate;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public String getAddtime() {
        return addtime;
    }

    public String getRishgrade() {
        return rishgrade;
    }

    public String getPerfindex() {
        return perfindex;
    }

    public String getGeneratereportdate() {
        return generatereportdate;
    }
}
