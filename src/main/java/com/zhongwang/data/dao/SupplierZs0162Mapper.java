package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierZs0162;
import com.zhongwang.data.entity.SupplierZs0162Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierZs0162Mapper {
    int countByExample(SupplierZs0162Example example);

    int deleteByExample(SupplierZs0162Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierZs0162 record);

    int insertSelective(SupplierZs0162 record);

    List<SupplierZs0162> selectByExample(SupplierZs0162Example example);

    SupplierZs0162 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierZs0162 record, @Param("example") SupplierZs0162Example example);

    int updateByExample(@Param("record") SupplierZs0162 record, @Param("example") SupplierZs0162Example example);

    int updateByPrimaryKeySelective(SupplierZs0162 record);

    int updateByPrimaryKey(SupplierZs0162 record);
}