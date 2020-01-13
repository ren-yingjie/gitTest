package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierRuleBaseInfo {
    private Integer id;

    private String ruleBaseId;

    private String ruleBaseCode;

    private String ruleBaseName;

    private String ruleBaseStatus;

    private String ruleExplain;

    private String companyId;

    private Date addTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleBaseId() {
        return ruleBaseId;
    }

    public void setRuleBaseId(String ruleBaseId) {
        this.ruleBaseId = ruleBaseId == null ? null : ruleBaseId.trim();
    }

    public String getRuleBaseCode() {
        return ruleBaseCode;
    }

    public void setRuleBaseCode(String ruleBaseCode) {
        this.ruleBaseCode = ruleBaseCode == null ? null : ruleBaseCode.trim();
    }

    public String getRuleBaseName() {
        return ruleBaseName;
    }

    public void setRuleBaseName(String ruleBaseName) {
        this.ruleBaseName = ruleBaseName == null ? null : ruleBaseName.trim();
    }

    public String getRuleBaseStatus() {
        return ruleBaseStatus;
    }

    public void setRuleBaseStatus(String ruleBaseStatus) {
        this.ruleBaseStatus = ruleBaseStatus == null ? null : ruleBaseStatus.trim();
    }

    public String getRuleExplain() {
        return ruleExplain;
    }

    public void setRuleExplain(String ruleExplain) {
        this.ruleExplain = ruleExplain == null ? null : ruleExplain.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}