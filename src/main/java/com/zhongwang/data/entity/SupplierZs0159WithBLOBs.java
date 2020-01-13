package com.zhongwang.data.entity;

public class SupplierZs0159WithBLOBs extends SupplierZs0159 {
    private String content;

    private String party1;

    private String party2;

    private String companylist;

    private String party1str;

    private String party2str;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getParty1() {
        return party1;
    }

    public void setParty1(String party1) {
        this.party1 = party1 == null ? null : party1.trim();
    }

    public String getParty2() {
        return party2;
    }

    public void setParty2(String party2) {
        this.party2 = party2 == null ? null : party2.trim();
    }

    public String getCompanylist() {
        return companylist;
    }

    public void setCompanylist(String companylist) {
        this.companylist = companylist == null ? null : companylist.trim();
    }

    public String getParty1str() {
        return party1str;
    }

    public void setParty1str(String party1str) {
        this.party1str = party1str == null ? null : party1str.trim();
    }

    public String getParty2str() {
        return party2str;
    }

    public void setParty2str(String party2str) {
        this.party2str = party2str == null ? null : party2str.trim();
    }
}