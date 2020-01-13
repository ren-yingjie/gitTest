package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierRoleInfo;
import com.zhongwang.data.entity.SupplierRoleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierRoleInfoMapper {
    int countByExample(SupplierRoleInfoExample example);

    int deleteByExample(SupplierRoleInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierRoleInfo record);

    int insertSelective(SupplierRoleInfo record);

    List<SupplierRoleInfo> selectByExample(SupplierRoleInfoExample example);

    SupplierRoleInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierRoleInfo record, @Param("example") SupplierRoleInfoExample example);

    int updateByExample(@Param("record") SupplierRoleInfo record, @Param("example") SupplierRoleInfoExample example);

    int updateByPrimaryKeySelective(SupplierRoleInfo record);

    int updateByPrimaryKey(SupplierRoleInfo record);
}