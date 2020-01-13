package com.zhongwang.data.entity.highrisk;

/**
 * 黑名单预警
 */
public class BlackList {

    private String companyId;
    private String supplierid;
    private String id;
    private String assesssection;
    private String casebrief;
    private String assessdate;
    private String subjectstatus;

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAssesssection(String assesssection) {
        this.assesssection = assesssection;
    }

    public void setCasebrief(String casebrief) {
        this.casebrief = casebrief;
    }

    public void setAssessdate(String assessdate) {
        this.assessdate = assessdate;
    }

    public void setSubjectstatus(String subjectstatus) {
        this.subjectstatus = subjectstatus;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public String getId() {
        return id;
    }

    public String getAssesssection() {
        return assesssection;
    }

    public String getCasebrief() {
        return casebrief;
    }

    public String getAssessdate() {
        return assessdate;
    }

    public String getSubjectstatus() {
        return subjectstatus;
    }
}
