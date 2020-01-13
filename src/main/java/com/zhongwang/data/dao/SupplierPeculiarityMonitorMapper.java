package com.zhongwang.data.dao;


import com.zhongwang.data.entity.SupplierInfo;
import com.zhongwang.data.entity.SupplierPeculiarityMonitor;
import com.zhongwang.data.request.RiskMonitoringRequest;

import java.util.List;

public interface SupplierPeculiarityMonitorMapper {


   List<SupplierPeculiarityMonitor> selectSupplierPeculiarityMonitor(RiskMonitoringRequest riskMonitoringRequest);


}