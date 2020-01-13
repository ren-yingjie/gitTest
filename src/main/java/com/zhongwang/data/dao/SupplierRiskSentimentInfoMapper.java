package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierRiskSentimentInfo;
import com.zhongwang.data.request.RiskMonitoringRequest;

import java.util.List;

public interface SupplierRiskSentimentInfoMapper {
    List<SupplierRiskSentimentInfo>  selectsupplierRiskSentimentInfo(RiskMonitoringRequest riskMonitoringRequest);
}