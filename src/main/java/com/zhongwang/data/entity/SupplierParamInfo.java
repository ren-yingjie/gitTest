package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierParamInfo {
    private Integer id;

    private String uuid;

    private String companyId;

    private Date addTime;

    private Date updateTime;

    private String parameterCoding;

    private String parameterType;

    private String parameterName;

    private String parameterDescription;

    private String parameterValues;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
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

    public String getParameterCoding() {
        return parameterCoding;
    }

    public void setParameterCoding(String parameterCoding) {
        this.parameterCoding = parameterCoding == null ? null : parameterCoding.trim();
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType == null ? null : parameterType.trim();
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName == null ? null : parameterName.trim();
    }

    public String getParameterDescription() {
        return parameterDescription;
    }

    public void setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription == null ? null : parameterDescription.trim();
    }

    public String getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(String parameterValues) {
        this.parameterValues = parameterValues == null ? null : parameterValues.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}