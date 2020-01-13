package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierSilingInfo;


public interface SupplierSilingInfoMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(SupplierSilingInfo record);

    int insertSelective(SupplierSilingInfo record);

    SupplierSilingInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SupplierSilingInfo record);

    int updateByPrimaryKey(SupplierSilingInfo record);

    /**
     * 供应商司龄统计
     * @param silingInfo
     * @return
     */
    SupplierSilingInfo selectBySiLing(SupplierSilingInfo silingInfo);

    /**
     * 供应商合作时长统计
     * @param silingInfo
     * @return
     */
    SupplierSilingInfo selectByCooperation(SupplierSilingInfo silingInfo);

}