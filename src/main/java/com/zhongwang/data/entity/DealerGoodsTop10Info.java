package com.zhongwang.data.entity;

import java.util.Date;

public class DealerGoodsTop10Info {
    private Integer id;

    private String companyId;

    private String goodsId;

    private String goodsName;

    private String amountScale;

    private Date addTime;

    private String yearTime;

    private String type;

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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getAmountScale() {
        return amountScale;
    }

    public void setAmountScale(String amountScale) {
        this.amountScale = amountScale == null ? null : amountScale.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getYearTime() {
        return yearTime;
    }

    public void setYearTime(String yearTime) {
        this.yearTime = yearTime == null ? null : yearTime.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}