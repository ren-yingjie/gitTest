package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierSeniorInfo;
import java.util.List;
import com.zhongwang.data.request.RiskMonitoringRequest;


public interface SupplierSeniorInfoMapper {
    /**
     * 高管职位信息
     * @return
     */
    List<SupplierSeniorInfo>  selectSupplierSeniorInfo(RiskMonitoringRequest riskMonitoringRequest);
}