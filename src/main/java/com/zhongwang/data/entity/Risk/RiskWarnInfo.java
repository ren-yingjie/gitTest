package com.zhongwang.data.entity.Risk;

/**
 * 本月统计数据
 */
public class RiskWarnInfo {

    private String companyId;
    private String type;
    private String info;
    private String count;

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getType() {
        return type;
    }

    public String getInfo() {
        return info;
    }

    public String getCount() {
        return count;
    }
}
