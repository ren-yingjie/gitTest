package com.zhongwang.data.entity;

public class SupplierZs0158WithBLOBs extends SupplierZs0158 {
    private String plaintiffs;

    private String plaintiffid;

    private String uni;

    private String connlist;

    private String lawsuiturl;

    private String defendants;

    public String getPlaintiffs() {
        return plaintiffs;
    }

    public void setPlaintiffs(String plaintiffs) {
        this.plaintiffs = plaintiffs == null ? null : plaintiffs.trim();
    }

    public String getPlaintiffid() {
        return plaintiffid;
    }

    public void setPlaintiffid(String plaintiffid) {
        this.plaintiffid = plaintiffid == null ? null : plaintiffid.trim();
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni == null ? null : uni.trim();
    }

    public String getConnlist() {
        return connlist;
    }

    public void setConnlist(String connlist) {
        this.connlist = connlist == null ? null : connlist.trim();
    }

    public String getLawsuiturl() {
        return lawsuiturl;
    }

    public void setLawsuiturl(String lawsuiturl) {
        this.lawsuiturl = lawsuiturl == null ? null : lawsuiturl.trim();
    }

    public String getDefendants() {
        return defendants;
    }

    public void setDefendants(String defendants) {
        this.defendants = defendants == null ? null : defendants.trim();
    }
}