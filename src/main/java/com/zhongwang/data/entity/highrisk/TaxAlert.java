package com.zhongwang.data.entity.highrisk;

/**
 * 税务预警
 */
public class TaxAlert {

    private String companyId;
    private String id;
    private String supplierid;
    private String type;
    private String riskwarningdetail;

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

    public void setType(String type) {
        this.type = type;
    }

    public void setRiskwarningdetail(String riskwarningdetail) {
        this.riskwarningdetail = riskwarningdetail;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getRiskwarningdetail() {
        return riskwarningdetail;
    }
}
