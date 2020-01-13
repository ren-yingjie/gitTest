package com.zhongwang.data.dao;


import com.zhongwang.data.entity.SupplierZs0134;
import com.zhongwang.data.request.RiskMonitoringRequest;

import java.util.List;

public interface SupplierZs0134Mapper {

    List<SupplierZs0134> selectSupplierInfo(RiskMonitoringRequest riskMonitoringRequest);

}