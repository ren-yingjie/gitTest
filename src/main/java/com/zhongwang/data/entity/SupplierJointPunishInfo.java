package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierJointPunishInfo {
    private Integer id;

    private String companyId;

    private String jointPunishUuid;

    private String supplierId;

    private String subjectName;

    private Date addTime;

    private String idNumber;

    private String subjectType;

    private String riskGrade;

    private String riskEvent;

    private String riskScore;

    private String assessDate;

    private String assessSection;

    private String caseNo;

    private String shortlistedType;

    private String caseBrief;

    private String subjectStatus;

    private String internalBlacklist;

    private String reason;

    private String addName;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJointPunishUuid() {
        return jointPunishUuid;
    }

    public void setJointPunishUuid(String jointPunishUuid) {
        this.jointPunishUuid = jointPunishUuid == null ? null : jointPunishUuid.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType == null ? null : subjectType.trim();
    }

    public String getRiskGrade() {
        return riskGrade;
    }

    public void setRiskGrade(String riskGrade) {
        this.riskGrade = riskGrade == null ? null : riskGrade.trim();
    }

    public String getRiskEvent() {
        return riskEvent;
    }

    public void setRiskEvent(String riskEvent) {
        this.riskEvent = riskEvent == null ? null : riskEvent.trim();
    }

    public String getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(String riskScore) {
        this.riskScore = riskScore == null ? null : riskScore.trim();
    }

    public String getAssessDate() {
        return assessDate;
    }

    public void setAssessDate(String assessDate) {
        this.assessDate = assessDate == null ? null : assessDate.trim();
    }

    public String getAssessSection() {
        return assessSection;
    }

    public void setAssessSection(String assessSection) {
        this.assessSection = assessSection == null ? null : assessSection.trim();
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public String getShortlistedType() {
        return shortlistedType;
    }

    public void setShortlistedType(String shortlistedType) {
        this.shortlistedType = shortlistedType == null ? null : shortlistedType.trim();
    }

    public String getCaseBrief() {
        return caseBrief;
    }

    public void setCaseBrief(String caseBrief) {
        this.caseBrief = caseBrief == null ? null : caseBrief.trim();
    }

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus == null ? null : subjectStatus.trim();
    }

    public String getInternalBlacklist() {
        return internalBlacklist;
    }

    public void setInternalBlacklist(String internalBlacklist) {
        this.internalBlacklist = internalBlacklist == null ? null : internalBlacklist.trim();
    }
}