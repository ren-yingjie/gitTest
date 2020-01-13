package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierCorrelationInfo;

public interface SupplierCorrelationInfoMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(SupplierCorrelationInfo record);

    int insertSelective(SupplierCorrelationInfo record);

    SupplierCorrelationInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SupplierCorrelationInfo record);

    int updateByPrimaryKey(SupplierCorrelationInfo record);
}