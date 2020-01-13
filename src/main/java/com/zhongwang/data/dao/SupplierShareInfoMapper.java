package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierShareInfo;

import java.util.List;

import com.zhongwang.data.request.RiskMonitoringRequest;


public interface SupplierShareInfoMapper {

    List<SupplierShareInfo>  selectSupplierShareInfo(RiskMonitoringRequest riskMonitoringRequest);
}