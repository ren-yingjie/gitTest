package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierZs0162 {
    private Integer id;

    private String companyId;

    private String supplierId;

    private Date addTime;

    private String casecode;

    private String execcourtname;

    private String pname;

    private String partycardnum;

    private String casecreatetime;

    private String execmoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getCasecode() {
        return casecode;
    }

    public void setCasecode(String casecode) {
        this.casecode = casecode == null ? null : casecode.trim();
    }

    public String getExeccourtname() {
        return execcourtname;
    }

    public void setExeccourtname(String execcourtname) {
        this.execcourtname = execcourtname == null ? null : execcourtname.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPartycardnum() {
        return partycardnum;
    }

    public void setPartycardnum(String partycardnum) {
        this.partycardnum = partycardnum == null ? null : partycardnum.trim();
    }

    public String getCasecreatetime() {
        return casecreatetime;
    }

    public void setCasecreatetime(String casecreatetime) {
        this.casecreatetime = casecreatetime == null ? null : casecreatetime.trim();
    }

    public String getExecmoney() {
        return execmoney;
    }

    public void setExecmoney(String execmoney) {
        this.execmoney = execmoney == null ? null : execmoney.trim();
    }
}