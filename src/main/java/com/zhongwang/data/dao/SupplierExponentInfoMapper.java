package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierExponentInfo;


public interface SupplierExponentInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierExponentInfo record);

    int insertSelective(SupplierExponentInfo record);

    SupplierExponentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SupplierExponentInfo record);

    int updateByPrimaryKey(SupplierExponentInfo record);

    /**
     * 供应商履约指数查询
     * @param info
     * @return
     */
    SupplierExponentInfo selectByLvYueindex(SupplierExponentInfo info);
    /**
     * 供应商稳定指数
     * @param info
     * @return
     */
    SupplierExponentInfo selectByWenDingindex(SupplierExponentInfo info);
    /**
     * 供应商风险指数
     * @param info
     * @return
     */
    SupplierExponentInfo selectByFengXianindex(SupplierExponentInfo info);
    /**
     * 供应商成长指数
     * @param info
     * @return
     */
    SupplierExponentInfo selectByChengZhangindex(SupplierExponentInfo info);
}