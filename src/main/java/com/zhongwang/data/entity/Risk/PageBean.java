package com.zhongwang.data.entity.Risk;

/**
 * 分页工具类
 */
public class PageBean {

    //当前页
    private int currentPage;
    //总条数
    private int totalCount;
    //每页显示条数
    private int currentCount;
    //总页数
    private int totalPage;
    //分页开始数
    private int index;

    private String suppliername;
    private String rishgrade;
    private String rishstatus;
    private String warningDateStart;
    private String warningDateEnd;
    private String companyId;
    private String riskeventtype;
    private String riskevent;
    private String status;
    private String comname;
    private String parentname;

    public void setComname(String comname) {
        this.comname = comname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getComname() {
        return comname;
    }

    public String getParentname() {
        return parentname;
    }

    public void setRiskevent(String riskevent) {
        this.riskevent = riskevent;
    }

    public String getRiskevent() {
        return riskevent;
    }

    public void setRiskeventtype(String riskeventtype) {
        this.riskeventtype = riskeventtype;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRiskeventtype() {
        return riskeventtype;
    }

    public String getStatus() {
        return status;
    }

    private String supplierName;        //企业名称
    private String internalRating;      //企业级别
    private String supplierStatus;      //供应商状态
    private String territory;           //所属地区

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getInternalRating() {
        return internalRating;
    }

    public void setInternalRating(String internalRating) {
        this.internalRating = internalRating;
    }

    public String getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public void setRishgrade(String rishgrade) {
        this.rishgrade = rishgrade;
    }

    public void setRishstatus(String rishstatus) {
        this.rishstatus = rishstatus;
    }

    public void setWarningDateStart(String warningDateStart) {
        this.warningDateStart = warningDateStart;
    }

    public void setWarningDateEnd(String warningDateEnd) {
        this.warningDateEnd = warningDateEnd;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public String getRishgrade() {
        return rishgrade;
    }

    public String getRishstatus() {
        return rishstatus;
    }

    public String getWarningDateStart() {
        return warningDateStart;
    }

    public String getWarningDateEnd() {
        return warningDateEnd;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
