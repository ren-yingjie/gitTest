package com.zhongwang.data.dao;


import com.zhongwang.data.entity.SupplierZs0241;
import com.zhongwang.data.entity.SuppliperMonitorTaxInfo;
import com.zhongwang.data.request.RiskMonitoringRequest;

import java.util.List;

public interface SuppliperMonitorTaxInfoMapper {

    List<SuppliperMonitorTaxInfo>   selectSuppliperMonitorTaxInfo(RiskMonitoringRequest riskMonitoringRequest);

    List<SupplierZs0241> selectSupplierZs0241(RiskMonitoringRequest riskMonitoringRequest);

}