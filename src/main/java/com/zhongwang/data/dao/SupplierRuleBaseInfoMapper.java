package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierRuleBaseInfo;
import com.zhongwang.data.entity.SupplierRuleBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierRuleBaseInfoMapper {
    int countByExample(SupplierRuleBaseInfoExample example);

    int deleteByExample(SupplierRuleBaseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierRuleBaseInfo record);

    int insertSelective(SupplierRuleBaseInfo record);

    List<SupplierRuleBaseInfo> selectByExample(SupplierRuleBaseInfoExample example);

    SupplierRuleBaseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierRuleBaseInfo record, @Param("example") SupplierRuleBaseInfoExample example);

    int updateByExample(@Param("record") SupplierRuleBaseInfo record, @Param("example") SupplierRuleBaseInfoExample example);

    int updateByPrimaryKeySelective(SupplierRuleBaseInfo record);

    int updateByPrimaryKey(SupplierRuleBaseInfo record);
}