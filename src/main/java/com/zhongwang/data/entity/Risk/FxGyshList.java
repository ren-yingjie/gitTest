package com.zhongwang.data.entity.Risk;

/**
 * 风险供应商列表
 */
public class FxGyshList {

    private String companyId;
    private String id;
    private String suppliername;
    private String addtime;
    private String rishgrade;
    private String rishscore;
    private String warningevents;
    private String purchasingranking;
    private String rishstatus;
    private String updatedate;
    private String updatepersonnel;

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

    public void setUpdatepersonnel(String updatepersonnel) {
        this.updatepersonnel = updatepersonnel;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public String getUpdatepersonnel() {
        return updatepersonnel;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public void setRishgrade(String rishgrade) {
        this.rishgrade = rishgrade;
    }

    public void setRishscore(String rishscore) {
        this.rishscore = rishscore;
    }

    public void setWarningevents(String warningevents) {
        this.warningevents = warningevents;
    }

    public void setPurchasingranking(String purchasingranking) {
        this.purchasingranking = purchasingranking;
    }

    public void setRishstatus(String rishstatus) {
        this.rishstatus = rishstatus;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public String getAddtime() {
        return addtime;
    }

    public String getRishgrade() {
        return rishgrade;
    }

    public String getRishscore() {
        return rishscore;
    }

    public String getWarningevents() {
        return warningevents;
    }

    public String getPurchasingranking() {
        return purchasingranking;
    }

    public String getRishstatus() {
        return rishstatus;
    }
}
