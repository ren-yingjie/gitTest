package com.zhongwang.data.entity.highrisk;

/**
 * 高风险事件
 */
public class HighRiskEvent {

    private String  companyId;
    private String  id;
    private String supplierid;
    private String riskevent;
    private String riskeventtype;
    private String suppliername;
    private String addtime;

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRiskevent(String riskevent) {
        this.riskevent = riskevent;
    }

    public void setRiskeventtype(String riskeventtype) {
        this.riskeventtype = riskeventtype;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getRiskevent() {
        return riskevent;
    }

    public String getRiskeventtype() {
        return riskeventtype;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public String getAddtime() {
        return addtime;
    }
}
