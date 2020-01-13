package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierFirmInfo;
import com.zhongwang.data.entity.SupplierFirmInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierFirmInfoMapper {
    int countByExample(SupplierFirmInfoExample example);

    int deleteByExample(SupplierFirmInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierFirmInfo record);

    int insertSelective(SupplierFirmInfo record);

    List<SupplierFirmInfo> selectByExample(SupplierFirmInfoExample example);

    SupplierFirmInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierFirmInfo record, @Param("example") SupplierFirmInfoExample example);

    int updateByExample(@Param("record") SupplierFirmInfo record, @Param("example") SupplierFirmInfoExample example);

    int updateByPrimaryKeySelective(SupplierFirmInfo record);

    int updateByPrimaryKey(SupplierFirmInfo record);
}