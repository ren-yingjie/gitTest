package com.zhongwang.data.entity;

import java.util.Date;

public class SupplierSilingInfo {
    private Integer id;

    private String companyId;

    private String supplierId;

    private String supplierName;

    private String silingYear5Up;

    private String silingYear5;

    private String silingYear4;

    private String silingYear3;

    private String silingYear2;

    private String silingYear1;

    private String silingYear1Down;

    private Date addTime;

    private String silingType;

    private String yearTime;

    public String getYearTime() {
        return yearTime;
    }

    public void setYearTime(String yearTime) {
        this.yearTime = yearTime;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSilingYear5Up() {
        return silingYear5Up;
    }

    public void setSilingYear5Up(String silingYear5Up) {
        this.silingYear5Up = silingYear5Up == null ? null : silingYear5Up.trim();
    }

    public String getSilingYear5() {
        return silingYear5;
    }

    public void setSilingYear5(String silingYear5) {
        this.silingYear5 = silingYear5 == null ? null : silingYear5.trim();
    }

    public String getSilingYear4() {
        return silingYear4;
    }

    public void setSilingYear4(String silingYear4) {
        this.silingYear4 = silingYear4 == null ? null : silingYear4.trim();
    }

    public String getSilingYear3() {
        return silingYear3;
    }

    public void setSilingYear3(String silingYear3) {
        this.silingYear3 = silingYear3 == null ? null : silingYear3.trim();
    }

    public String getSilingYear2() {
        return silingYear2;
    }

    public void setSilingYear2(String silingYear2) {
        this.silingYear2 = silingYear2 == null ? null : silingYear2.trim();
    }

    public String getSilingYear1() {
        return silingYear1;
    }

    public void setSilingYear1(String silingYear1) {
        this.silingYear1 = silingYear1 == null ? null : silingYear1.trim();
    }

    public String getSilingYear1Down() {
        return silingYear1Down;
    }

    public void setSilingYear1Down(String silingYear1Down) {
        this.silingYear1Down = silingYear1Down == null ? null : silingYear1Down.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getSilingType() {
        return silingType;
    }

    public void setSilingType(String silingType) {
        this.silingType = silingType == null ? null : silingType.trim();
    }
}