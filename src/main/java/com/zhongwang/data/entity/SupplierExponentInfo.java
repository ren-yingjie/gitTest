package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierExponentInfo {
    private Integer id;

    private String companyId;

    private String supplierIndexType;

    private String month1;

    private String month2;

    private String month3;

    private String month4;

    private String month5;

    private String month6;

    private String month7;

    private String month8;

    private String month9;

    private String month10;

    private String month11;

    private String month12;

    private String indexYearTime;

    private String soppliercountwarning;

    private Date addTime;

    public void setSoppliercountwarning(String soppliercountwarning) {
        this.soppliercountwarning = soppliercountwarning;
    }

    public String getSoppliercountwarning() {
        return soppliercountwarning;
    }

    private String lvyueIndex;//警戒值

    private String IndexTrend;//评价期内供应商整体履约指数

    private String capabilityIndex;//评价期内供应商履约能力整体呈

    public String getIndexTrend() {
        return IndexTrend;
    }

    public void setIndexTrend(String indexTrend) {
        IndexTrend = indexTrend;
    }

    public String getCapabilityIndex() {
        return capabilityIndex;
    }

    public void setCapabilityIndex(String capabilityIndex) {
        this.capabilityIndex = capabilityIndex;
    }

    public String getLvyueIndex() {
        return lvyueIndex;
    }

    public void setLvyueIndex(String lvyueIndex) {
        this.lvyueIndex = lvyueIndex;
    }

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
        this.companyId = companyId;
    }

    public String getSupplierIndexType() {
        return supplierIndexType;
    }

    public void setSupplierIndexType(String supplierIndexType) {
        this.supplierIndexType = supplierIndexType == null ? null : supplierIndexType.trim();
    }

    public String getMonth1() {
        return month1;
    }

    public void setMonth1(String month1) {
        this.month1 = month1 == null ? null : month1.trim();
    }

    public String getMonth2() {
        return month2;
    }

    public void setMonth2(String month2) {
        this.month2 = month2 == null ? null : month2.trim();
    }

    public String getMonth3() {
        return month3;
    }

    public void setMonth3(String month3) {
        this.month3 = month3 == null ? null : month3.trim();
    }

    public String getMonth4() {
        return month4;
    }

    public void setMonth4(String month4) {
        this.month4 = month4 == null ? null : month4.trim();
    }

    public String getMonth5() {
        return month5;
    }

    public void setMonth5(String month5) {
        this.month5 = month5 == null ? null : month5.trim();
    }

    public String getMonth6() {
        return month6;
    }

    public void setMonth6(String month6) {
        this.month6 = month6 == null ? null : month6.trim();
    }

    public String getMonth7() {
        return month7;
    }

    public void setMonth7(String month7) {
        this.month7 = month7 == null ? null : month7.trim();
    }

    public String getMonth8() {
        return month8;
    }

    public void setMonth8(String month8) {
        this.month8 = month8 == null ? null : month8.trim();
    }

    public String getMonth9() {
        return month9;
    }

    public void setMonth9(String month9) {
        this.month9 = month9 == null ? null : month9.trim();
    }

    public String getMonth10() {
        return month10;
    }

    public void setMonth10(String month10) {
        this.month10 = month10 == null ? null : month10.trim();
    }

    public String getMonth11() {
        return month11;
    }

    public void setMonth11(String month11) {
        this.month11 = month11 == null ? null : month11.trim();
    }

    public String getMonth12() {
        return month12;
    }

    public void setMonth12(String month12) {
        this.month12 = month12 == null ? null : month12.trim();
    }

    public String getIndexYearTime() {
        return indexYearTime;
    }

    public void setIndexYearTime(String indexYearTime) {
        this.indexYearTime = indexYearTime == null ? null : indexYearTime.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}