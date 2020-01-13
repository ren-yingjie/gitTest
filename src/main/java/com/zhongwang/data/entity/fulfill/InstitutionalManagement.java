package com.zhongwang.data.entity.fulfill;

/**
 * 机构管理
 */
public class InstitutionalManagement {

    private String id;
    private String comid;
    private String comnumber;
    private String comname;
    private String parentname;
    private String addtime;
    private String addname;
    private String parentid;

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getParentid() {
        return parentid;
    }

    public void setComnumber(String comnumber) {
        this.comnumber = comnumber;
    }

    public String getComnumber() {
        return comnumber;
    }

    public String getComid() {
        return comid;
    }

    public void setComid(String comid) {
        this.comid = comid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public void setAddname(String addname) {
        this.addname = addname;
    }

    public String getId() {
        return id;
    }

    public String getComname() {
        return comname;
    }

    public String getParentname() {
        return parentname;
    }

    public String getAddtime() {
        return addtime;
    }

    public String getAddname() {
        return addname;
    }
}
