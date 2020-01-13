package com.zhongwang.data.dao;


import com.zhongwang.data.entity.SupplierSubsciribedInfo;
import com.zhongwang.data.request.RiskMonitoringRequest;

import java.util.List;

public interface SupplierSubsciribedInfoMapper {




    List<SupplierSubsciribedInfo>  selectSupplierSubsciribedInfo(RiskMonitoringRequest riskMonitoringRequest);

}