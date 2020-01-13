package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierRiskWarningAllocation;


public interface SupplierRiskWarningAllocationMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(SupplierRiskWarningAllocation record);

    int insertSelective(SupplierRiskWarningAllocation record);



    SupplierRiskWarningAllocation selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(SupplierRiskWarningAllocation record);

    int updateByPrimaryKey(SupplierRiskWarningAllocation record);
}