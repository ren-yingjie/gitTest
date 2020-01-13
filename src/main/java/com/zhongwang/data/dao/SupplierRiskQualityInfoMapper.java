package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierRiskQualityInfo;
import java.util.List;
import com.zhongwang.data.request.RiskMonitoringRequest;


public interface SupplierRiskQualityInfoMapper {

    List<SupplierRiskQualityInfo>  selectSupplierRiskQualityInfo(RiskMonitoringRequest riskMonitoringRequest);

}