package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierPermissionInfo;
import com.zhongwang.data.entity.SupplierPermissionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierPermissionInfoMapper {
    int countByExample(SupplierPermissionInfoExample example);

    int deleteByExample(SupplierPermissionInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierPermissionInfo record);

    int insertSelective(SupplierPermissionInfo record);

    List<SupplierPermissionInfo> selectByExample(SupplierPermissionInfoExample example);

    SupplierPermissionInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierPermissionInfo record, @Param("example") SupplierPermissionInfoExample example);

    int updateByExample(@Param("record") SupplierPermissionInfo record, @Param("example") SupplierPermissionInfoExample example);

    int updateByPrimaryKeySelective(SupplierPermissionInfo record);

    int updateByPrimaryKey(SupplierPermissionInfo record);
}