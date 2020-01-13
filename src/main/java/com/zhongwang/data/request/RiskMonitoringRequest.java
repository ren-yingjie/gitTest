package com.zhongwang.data.request;

import org.apache.commons.lang3.StringUtils;

public class RiskMonitoringRequest {
    protected static final String VAGUE_MODEL5 = "%%%s%%";
    private String  companyId;
    private String monitorTime;
    private Integer currentCount;
    private Integer currentPage;
    private String  queryTime;
    private  String  monitoringType;
    private String  supplierName;
    private String dataType;
    private String invoiceType;


    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public String getMonitoringType() {
        return monitoringType;
    }

    public void setMonitoringType(String monitoringType) {
        this.monitoringType = monitoringType;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = StringUtils.isBlank(supplierName) ? null : String.format(VAGUE_MODEL5, supplierName);
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(String monitorTime) {
        this.monitorTime = monitorTime;
    }

    @Override
    public String toString() {
        return "RiskMonitoringRequest{" +
                "companyId='" + companyId + '\'' +
                ", monitorTime='" + monitorTime + '\'' +
                ", currentCount=" + currentCount +
                ", currentPage=" + currentPage +
                ", queryTime='" + queryTime + '\'' +
                ", monitoringType='" + monitoringType + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", dataType='" + dataType + '\'' +
                ", invoiceType='" + invoiceType + '\'' +
                '}';
    }
}
