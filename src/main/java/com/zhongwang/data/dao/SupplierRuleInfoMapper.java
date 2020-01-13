package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierRuleInfo;
import com.zhongwang.data.entity.SupplierRuleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierRuleInfoMapper {
    int countByExample(SupplierRuleInfoExample example);

    int deleteByExample(SupplierRuleInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierRuleInfo record);

    int insertSelective(SupplierRuleInfo record);

    List<SupplierRuleInfo> selectByExample(SupplierRuleInfoExample example);

    SupplierRuleInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierRuleInfo record, @Param("example") SupplierRuleInfoExample example);

    int updateByExample(@Param("record") SupplierRuleInfo record, @Param("example") SupplierRuleInfoExample example);

    int updateByPrimaryKeySelective(SupplierRuleInfo record);

    int updateByPrimaryKey(SupplierRuleInfo record);
}