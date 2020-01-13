package com.zhongwang.data.entity.Risk;

/**
 * 风险等级分布
 */
public class RiskLevelInfo {

    //等级
    private String rishgrade;
    //个数
    private String count;
    //
    private String companyId;

    public void setRishgrade(String rishgrade) {
        this.rishgrade = rishgrade;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getRishgrade() {
        return rishgrade;
    }

    public String getCount() {
        return count;
    }

    public String getCompanyId() {
        return companyId;
    }
}
