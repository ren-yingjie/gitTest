package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierZs0241;
import com.zhongwang.data.entity.SupplierZs0241Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierZs0241Mapper {
    int countByExample(SupplierZs0241Example example);

    int deleteByExample(SupplierZs0241Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierZs0241 record);

    int insertSelective(SupplierZs0241 record);

    List<SupplierZs0241> selectByExampleWithBLOBs(SupplierZs0241Example example);

    List<SupplierZs0241> selectByExample(SupplierZs0241Example example);

    SupplierZs0241 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierZs0241 record, @Param("example") SupplierZs0241Example example);

    int updateByExampleWithBLOBs(@Param("record") SupplierZs0241 record, @Param("example") SupplierZs0241Example example);

    int updateByExample(@Param("record") SupplierZs0241 record, @Param("example") SupplierZs0241Example example);

    int updateByPrimaryKeySelective(SupplierZs0241 record);

    int updateByPrimaryKeyWithBLOBs(SupplierZs0241 record);

    int updateByPrimaryKey(SupplierZs0241 record);
}