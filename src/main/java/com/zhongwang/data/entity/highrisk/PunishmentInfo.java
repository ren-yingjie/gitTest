package com.zhongwang.data.entity.highrisk;

/**
 *出发预警
 */
public class PunishmentInfo {

    private String  companyId;
    private String  id;
    private String  supplierid;
    private String  decisiondate;
    private String  punishnumber;
    private String  content;
    private String  departmentname;

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public void setDecisiondate(String decisiondate) {
        this.decisiondate = decisiondate;
    }

    public void setPunishnumber(String punishnumber) {
        this.punishnumber = punishnumber;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
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

    public String getDecisiondate() {
        return decisiondate;
    }

    public String getPunishnumber() {
        return punishnumber;
    }

    public String getContent() {
        return content;
    }

    public String getDepartmentname() {
        return departmentname;
    }
}
