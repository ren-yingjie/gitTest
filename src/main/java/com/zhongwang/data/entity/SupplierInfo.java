package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierInfo {
    //当前页
    private int currentPage;
    //总条数
    private int totalCount;
    //每页显示条数
    private int currentCount;
    //总页数
    private int totalPage;
    //分页开始数
    private int index;
    private Integer id;
    private String companyId;
    private String supplierId;

    private String internalBlacklist;//企业内部黑名单:0 外部黑名单1是内部黑名单

    public String getInternalBlacklist() {
        return internalBlacklist;
    }

    public void setInternalBlacklist(String internalBlacklist) {
        this.internalBlacklist = internalBlacklist;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    private String supplierName;

    private Date addTime;

    private String staffnumrange;

    private String fromtime;

    private String type;

    private String ismicroent;

    private String regnumber;

    private String percentilescore;

    private String regcapital;

    private String reginstitute;

    private String reglocation;

    private String industry;

    private String approvedtime;

    private String socialstaffnum;

    private String taxnumber;

    private String orgnumber;

    private String regstatus;

    private String estiblishtime;

    private String legalpersonname;

    private String totime;

    private String actualcapital;

    private String companyorgtype;

    private String creditcode;

    private String actualcapitalcurrency;

    private String orgapprovedinstitute;

    private String email;

    private String websitelist;

    private String phonenumber;

    private String territory;

    private String internalRating;

    private String forTime;

    private String failureTime;

    private String supplierStatus;

    private String inspectStatus;

    private String riskState;

    private String collectType;
    private String subjectStatus;




    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getStaffnumrange() {
        return staffnumrange;
    }

    public void setStaffnumrange(String staffnumrange) {
        this.staffnumrange = staffnumrange == null ? null : staffnumrange.trim();
    }

    public String getFromtime() {
        return fromtime;
    }

    public void setFromtime(String fromtime) {
        this.fromtime = fromtime == null ? null : fromtime.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIsmicroent() {
        return ismicroent;
    }

    public void setIsmicroent(String ismicroent) {
        this.ismicroent = ismicroent == null ? null : ismicroent.trim();
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber == null ? null : regnumber.trim();
    }

    public String getPercentilescore() {
        return percentilescore;
    }

    public void setPercentilescore(String percentilescore) {
        this.percentilescore = percentilescore == null ? null : percentilescore.trim();
    }

    public String getRegcapital() {
        return regcapital;
    }

    public void setRegcapital(String regcapital) {
        this.regcapital = regcapital == null ? null : regcapital.trim();
    }

    public String getReginstitute() {
        return reginstitute;
    }

    public void setReginstitute(String reginstitute) {
        this.reginstitute = reginstitute == null ? null : reginstitute.trim();
    }

    public String getReglocation() {
        return reglocation;
    }

    public void setReglocation(String reglocation) {
        this.reglocation = reglocation == null ? null : reglocation.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getApprovedtime() {
        return approvedtime;
    }

    public void setApprovedtime(String approvedtime) {
        this.approvedtime = approvedtime == null ? null : approvedtime.trim();
    }

    public String getSocialstaffnum() {
        return socialstaffnum;
    }

    public void setSocialstaffnum(String socialstaffnum) {
        this.socialstaffnum = socialstaffnum == null ? null : socialstaffnum.trim();
    }

    public String getTaxnumber() {
        return taxnumber;
    }

    public void setTaxnumber(String taxnumber) {
        this.taxnumber = taxnumber == null ? null : taxnumber.trim();
    }

    public String getOrgnumber() {
        return orgnumber;
    }

    public void setOrgnumber(String orgnumber) {
        this.orgnumber = orgnumber == null ? null : orgnumber.trim();
    }

    public String getRegstatus() {
        return regstatus;
    }

    public void setRegstatus(String regstatus) {
        this.regstatus = regstatus == null ? null : regstatus.trim();
    }

    public String getEstiblishtime() {
        return estiblishtime;
    }

    public void setEstiblishtime(String estiblishtime) {
        this.estiblishtime = estiblishtime == null ? null : estiblishtime.trim();
    }

    public String getLegalpersonname() {
        return legalpersonname;
    }

    public void setLegalpersonname(String legalpersonname) {
        this.legalpersonname = legalpersonname == null ? null : legalpersonname.trim();
    }

    public String getTotime() {
        return totime;
    }

    public void setTotime(String totime) {
        this.totime = totime == null ? null : totime.trim();
    }

    public String getActualcapital() {
        return actualcapital;
    }

    public void setActualcapital(String actualcapital) {
        this.actualcapital = actualcapital == null ? null : actualcapital.trim();
    }

    public String getCompanyorgtype() {
        return companyorgtype;
    }

    public void setCompanyorgtype(String companyorgtype) {
        this.companyorgtype = companyorgtype == null ? null : companyorgtype.trim();
    }

    public String getCreditcode() {
        return creditcode;
    }

    public void setCreditcode(String creditcode) {
        this.creditcode = creditcode == null ? null : creditcode.trim();
    }

    public String getActualcapitalcurrency() {
        return actualcapitalcurrency;
    }

    public void setActualcapitalcurrency(String actualcapitalcurrency) {
        this.actualcapitalcurrency = actualcapitalcurrency == null ? null : actualcapitalcurrency.trim();
    }

    public String getOrgapprovedinstitute() {
        return orgapprovedinstitute;
    }

    public void setOrgapprovedinstitute(String orgapprovedinstitute) {
        this.orgapprovedinstitute = orgapprovedinstitute == null ? null : orgapprovedinstitute.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWebsitelist() {
        return websitelist;
    }

    public void setWebsitelist(String websitelist) {
        this.websitelist = websitelist == null ? null : websitelist.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory == null ? null : territory.trim();
    }

    public String getInternalRating() {
        return internalRating;
    }

    public void setInternalRating(String internalRating) {
        this.internalRating = internalRating == null ? null : internalRating.trim();
    }

    public String getForTime() {
        return forTime;
    }

    public void setForTime(String forTime) {
        this.forTime = forTime == null ? null : forTime.trim();
    }

    public String getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(String failureTime) {
        this.failureTime = failureTime == null ? null : failureTime.trim();
    }

    public String getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus == null ? null : supplierStatus.trim();
    }

    public String getInspectStatus() {
        return inspectStatus;
    }

    public void setInspectStatus(String inspectStatus) {
        this.inspectStatus = inspectStatus == null ? null : inspectStatus.trim();
    }

    public String getRiskState() {
        return riskState;
    }

    public void setRiskState(String riskState) {
        this.riskState = riskState == null ? null : riskState.trim();
    }

    public String getCollectType() {
        return collectType;
    }

    public void setCollectType(String collectType) {
        this.collectType = collectType == null ? null : collectType.trim();
    }
}