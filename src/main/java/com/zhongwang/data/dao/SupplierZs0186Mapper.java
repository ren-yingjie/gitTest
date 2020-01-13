package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierZs0186;
import com.zhongwang.data.entity.SupplierZs0186Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierZs0186Mapper {
    int countByExample(SupplierZs0186Example example);

    int deleteByExample(SupplierZs0186Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierZs0186 record);

    int insertSelective(SupplierZs0186 record);

    List<SupplierZs0186> selectByExample(SupplierZs0186Example example);

    SupplierZs0186 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierZs0186 record, @Param("example") SupplierZs0186Example example);

    int updateByExample(@Param("record") SupplierZs0186 record, @Param("example") SupplierZs0186Example example);

    int updateByPrimaryKeySelective(SupplierZs0186 record);

    int updateByPrimaryKey(SupplierZs0186 record);
}