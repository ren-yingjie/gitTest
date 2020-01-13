package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierTop10Info;

import java.util.List;
import java.util.Map;


public interface SupplierTop10InfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierTop10Info record);

    int insertSelective(SupplierTop10Info record);

    SupplierTop10Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SupplierTop10Info record);

    int updateByPrimaryKey(SupplierTop10Info record);

    /**
     * TOP10供应商采购金额占比
     * @param companyId
     * @return
     */
    List<SupplierTop10Info> selectByPurchaseTop10(String companyId);

    /**
     * TOP10供应商区域覆盖
     * @param companyId
     * @return
     */
    List<SupplierTop10Info> selectByAreaTop10(String companyId);
}