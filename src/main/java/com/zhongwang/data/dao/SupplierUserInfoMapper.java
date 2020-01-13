package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierUserInfo;
import com.zhongwang.data.entity.SupplierUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierUserInfoMapper {
    int countByExample(SupplierUserInfoExample example);

    int deleteByExample(SupplierUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierUserInfo record);

    int insertSelective(SupplierUserInfo record);

    List<SupplierUserInfo> selectByExample(SupplierUserInfoExample example);

    SupplierUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierUserInfo record, @Param("example") SupplierUserInfoExample example);

    int updateByExample(@Param("record") SupplierUserInfo record, @Param("example") SupplierUserInfoExample example);

    int updateByPrimaryKeySelective(SupplierUserInfo record);

    int updateByPrimaryKey(SupplierUserInfo record);
}