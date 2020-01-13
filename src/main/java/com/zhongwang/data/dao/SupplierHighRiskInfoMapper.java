package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierHighRiskInfo;
import com.zhongwang.data.entity.SupplierHighRiskInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierHighRiskInfoMapper {
    int countByExample(SupplierHighRiskInfoExample example);

    int deleteByExample(SupplierHighRiskInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierHighRiskInfo record);

    int insertSelective(SupplierHighRiskInfo record);

    List<SupplierHighRiskInfo> selectByExample(SupplierHighRiskInfoExample example);

    SupplierHighRiskInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierHighRiskInfo record, @Param("example") SupplierHighRiskInfoExample example);

    int updateByExample(@Param("record") SupplierHighRiskInfo record, @Param("example") SupplierHighRiskInfoExample example);

    int updateByPrimaryKeySelective(SupplierHighRiskInfo record);

    int updateByPrimaryKey(SupplierHighRiskInfo record);
}