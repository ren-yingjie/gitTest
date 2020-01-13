package com.zhongwang.data.entity.Risk;

/**
 * 高风险列表
 */
public class HighRiskEvents {

    private String id;
    private String riskevent;
    private String riskeventtype;
    private String suppliername;
    private String addtime;
    private String status;

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

    public void setStatus(String status) {
        this.status = status;
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

    public String getStatus() {
        return status;
    }
}
