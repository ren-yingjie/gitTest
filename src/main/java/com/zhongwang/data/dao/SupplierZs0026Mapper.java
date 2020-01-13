package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierZs0026;
import com.zhongwang.data.entity.SupplierZs0026Example;
import com.zhongwang.data.entity.SupplierZs0026WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierZs0026Mapper {
    int countByExample(SupplierZs0026Example example);

    int deleteByExample(SupplierZs0026Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierZs0026WithBLOBs record);

    int insertSelective(SupplierZs0026WithBLOBs record);

    List<SupplierZs0026WithBLOBs> selectByExampleWithBLOBs(SupplierZs0026Example example);

    List<SupplierZs0026> selectByExample(SupplierZs0026Example example);

    SupplierZs0026WithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierZs0026WithBLOBs record, @Param("example") SupplierZs0026Example example);

    int updateByExampleWithBLOBs(@Param("record") SupplierZs0026WithBLOBs record, @Param("example") SupplierZs0026Example example);

    int updateByExample(@Param("record") SupplierZs0026 record, @Param("example") SupplierZs0026Example example);

    int updateByPrimaryKeySelective(SupplierZs0026WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SupplierZs0026WithBLOBs record);

    int updateByPrimaryKey(SupplierZs0026 record);
}