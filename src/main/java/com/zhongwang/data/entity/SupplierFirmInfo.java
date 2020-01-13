package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierFirmInfo {
    private Integer id;

    private String companyName;

    private String firmName;

    private String riskEvent;

    private String certificationInstitution;

    private Date addTime;

    private String causeAction;

    private String causeNo;

    private String thatTime;

    private String status;

    private String riskScore;

    private String riskGrade;

    private String firmUuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName == null ? null : firmName.trim();
    }

    public String getRiskEvent() {
        return riskEvent;
    }

    public void setRiskEvent(String riskEvent) {
        this.riskEvent = riskEvent == null ? null : riskEvent.trim();
    }

    public String getCertificationInstitution() {
        return certificationInstitution;
    }

    public void setCertificationInstitution(String certificationInstitution) {
        this.certificationInstitution = certificationInstitution == null ? null : certificationInstitution.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getCauseAction() {
        return causeAction;
    }

    public void setCauseAction(String causeAction) {
        this.causeAction = causeAction == null ? null : causeAction.trim();
    }

    public String getCauseNo() {
        return causeNo;
    }

    public void setCauseNo(String causeNo) {
        this.causeNo = causeNo == null ? null : causeNo.trim();
    }

    public String getThatTime() {
        return thatTime;
    }

    public void setThatTime(String thatTime) {
        this.thatTime = thatTime == null ? null : thatTime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(String riskScore) {
        this.riskScore = riskScore == null ? null : riskScore.trim();
    }

    public String getRiskGrade() {
        return riskGrade;
    }

    public void setRiskGrade(String riskGrade) {
        this.riskGrade = riskGrade == null ? null : riskGrade.trim();
    }

    public String getFirmUuid() {
        return firmUuid;
    }

    public void setFirmUuid(String firmUuid) {
        this.firmUuid = firmUuid == null ? null : firmUuid.trim();
    }
}