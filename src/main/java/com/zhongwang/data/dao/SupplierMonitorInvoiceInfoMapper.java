package com.zhongwang.data.dao;


import com.zhongwang.data.entity.SupplierJointPunishInfo;
import com.zhongwang.data.entity.SupplierMonitorInvoiceInfo;
import com.zhongwang.data.request.RiskMonitoringRequest;

import java.util.List;

public interface SupplierMonitorInvoiceInfoMapper {

    List<SupplierMonitorInvoiceInfo>   selectSupplierMonitorInvoiceInfo(RiskMonitoringRequest riskMonitoringRequest);

    List<SupplierJointPunishInfo>   selectSupplierJointPunishInfo(RiskMonitoringRequest riskMonitoringRequest);

}