package com.zhongwang.data.entity.fulfill;

/**
 * 被执行人的信息
 */
public class ExecutedInfp {

    private String companyId;
    private String id;
    private String supplierid;
    private String caseCreateTime;
    private String caseCode;
    private String execCourtName;
    private String execMoney;

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

    public void setCaseCreateTime(String caseCreateTime) {
        this.caseCreateTime = caseCreateTime;
    }

    public void setCaseCode(String caseCode) {
        this.caseCode = caseCode;
    }

    public void setExecCourtName(String execCourtName) {
        this.execCourtName = execCourtName;
    }

    public void setExecMoney(String execMoney) {
        this.execMoney = execMoney;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getCaseCreateTime() {
        return caseCreateTime;
    }

    public String getCaseCode() {
        return caseCode;
    }

    public String getExecCourtName() {
        return execCourtName;
    }

    public String getExecMoney() {
        return execMoney;
    }
}
