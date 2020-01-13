package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierParamInfo;


public interface SupplierParamInfoMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(SupplierParamInfo record);

    int insertSelective(SupplierParamInfo record);

    SupplierParamInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SupplierParamInfo record);

    int updateByPrimaryKey(SupplierParamInfo record);
}