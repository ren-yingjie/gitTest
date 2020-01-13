package com.zhongwang.data.entity.fulfill;

/**
 * 预警配置
 */
public class EarlyWarningConfiguration {

    private String companyId;
    private String id;
    private String supplierid;
    private String uuid;
    private String warningevents;
    private String lowgrade;
    private String highgrade;
    private String status;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public void setWarningevents(String warningevents) {
        this.warningevents = warningevents;
    }

    public void setLowgrade(String lowgrade) {
        this.lowgrade = lowgrade;
    }

    public void setHighgrade(String highgrade) {
        this.highgrade = highgrade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public String getWarningevents() {
        return warningevents;
    }

    public String getLowgrade() {
        return lowgrade;
    }

    public String getHighgrade() {
        return highgrade;
    }

    public String getStatus() {
        return status;
    }
}
