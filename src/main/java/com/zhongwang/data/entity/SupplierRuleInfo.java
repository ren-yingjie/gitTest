package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierRuleInfo {
    private Integer id;

    private String ruleId;

    private String companyId;

    private String ruleCode;

    private String ruleName;

    private String ruleType;

    private String source;

    private String ruleObject;

    private String ruleStatus;

    private String ruleScoreGap;

    private Date addTime;

    private Date updateTime;

    private String ruleExplain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode == null ? null : ruleCode.trim();
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getRuleObject() {
        return ruleObject;
    }

    public void setRuleObject(String ruleObject) {
        this.ruleObject = ruleObject == null ? null : ruleObject.trim();
    }

    public String getRuleStatus() {
        return ruleStatus;
    }

    public void setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus == null ? null : ruleStatus.trim();
    }

    public String getRuleScoreGap() {
        return ruleScoreGap;
    }

    public void setRuleScoreGap(String ruleScoreGap) {
        this.ruleScoreGap = ruleScoreGap == null ? null : ruleScoreGap.trim();
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

    public String getRuleExplain() {
        return ruleExplain;
    }

    public void setRuleExplain(String ruleExplain) {
        this.ruleExplain = ruleExplain == null ? null : ruleExplain.trim();
    }
}