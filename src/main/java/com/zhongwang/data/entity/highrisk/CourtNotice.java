package com.zhongwang.data.entity.highrisk;

/**
 * 法院公告
 */
public class CourtNotice {

    private String companyId;
    private String id;
    private String supplierid;
    private String publishdate;
    private String courtcode;
    private String bltntype;
    private String content;

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public void setCourtcode(String courtcode) {
        this.courtcode = courtcode;
    }

    public void setBltntype(String bltntype) {
        this.bltntype = bltntype;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getId() {
        return id;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public String getCourtcode() {
        return courtcode;
    }

    public String getBltntype() {
        return bltntype;
    }

    public String getContent() {
        return content;
    }
}
