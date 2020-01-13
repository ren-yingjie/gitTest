package com.zhongwang.data.entity.Risk;

/**
 *新增风险供应商列表信息
 */
public class AddRiskListInfo {

    private String  companyId;
    private String  id;
    private String  suppliername;
    private String  rishgrade;
    private String  rishscore;
    private String  warningevents;
    private String  purchasingranking;

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getSuppliername() {
        return suppliername;
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

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
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

}
