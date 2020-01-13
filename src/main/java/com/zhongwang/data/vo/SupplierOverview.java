package com.zhongwang.data.vo;

public class SupplierOverview {

    private String companyId;   //公司id
    private String warningDate;//预警时间
    private String infoCont;    //供应商总数
    private String rishCont;    //本月高风险供应商合计
    private String heighCont;   //本月高风险事件合计
    private String LvYueIndex;  //供应商履约能力指数
    private String infoContlink; //供应商总数环比
    private String rishContlink; //本月高风险供应商合计环比
    private String heighContlink; //本月高风险事件合计环比
    private String LvYueIndexlink; //供应商履约能力指数环比

    public String getInfoContlink() {
        return infoContlink;
    }

    public void setInfoContlink(String infoContlink) {
        this.infoContlink = infoContlink;
    }

    public String getRishContlink() {
        return rishContlink;
    }

    public void setRishContlink(String rishContlink) {
        this.rishContlink = rishContlink;
    }

    public String getHeighContlink() {
        return heighContlink;
    }

    public void setHeighContlink(String heighContlink) {
        this.heighContlink = heighContlink;
    }

    public String getLvYueIndexlink() {
        return LvYueIndexlink;
    }

    public void setLvYueIndexlink(String lvYueIndexlink) {
        LvYueIndexlink = lvYueIndexlink;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getWarningDate() {
        return warningDate;
    }

    public void setWarningDate(String warningDate) {
        this.warningDate = warningDate;
    }

    public String getInfoCont() {
        return infoCont;
    }

    public void setInfoCont(String infoCont) {
        this.infoCont = infoCont;
    }

    public String getRishCont() {
        return rishCont;
    }

    public void setRishCont(String rishCont) {
        this.rishCont = rishCont;
    }

    public String getHeighCont() {
        return heighCont;
    }

    public void setHeighCont(String heighCont) {
        this.heighCont = heighCont;
    }

    public String getLvYueIndex() {
        return LvYueIndex;
    }

    public void setLvYueIndex(String lvYueIndex) {
        LvYueIndex = lvYueIndex;
    }
}
