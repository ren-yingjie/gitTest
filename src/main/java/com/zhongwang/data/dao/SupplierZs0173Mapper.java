package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierZs0173;
import com.zhongwang.data.entity.SupplierZs0173Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierZs0173Mapper {
    int countByExample(SupplierZs0173Example example);

    int deleteByExample(SupplierZs0173Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierZs0173 record);

    int insertSelective(SupplierZs0173 record);

    List<SupplierZs0173> selectByExample(SupplierZs0173Example example);

    SupplierZs0173 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierZs0173 record, @Param("example") SupplierZs0173Example example);

    int updateByExample(@Param("record") SupplierZs0173 record, @Param("example") SupplierZs0173Example example);

    int updateByPrimaryKeySelective(SupplierZs0173 record);

    int updateByPrimaryKey(SupplierZs0173 record);
}