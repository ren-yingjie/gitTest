package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierZs0158;
import com.zhongwang.data.entity.SupplierZs0158Example;
import com.zhongwang.data.entity.SupplierZs0158WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierZs0158Mapper {
    int countByExample(SupplierZs0158Example example);

    int deleteByExample(SupplierZs0158Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierZs0158WithBLOBs record);

    int insertSelective(SupplierZs0158WithBLOBs record);

    List<SupplierZs0158WithBLOBs> selectByExampleWithBLOBs(SupplierZs0158Example example);

    List<SupplierZs0158> selectByExample(SupplierZs0158Example example);

    SupplierZs0158WithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierZs0158WithBLOBs record, @Param("example") SupplierZs0158Example example);

    int updateByExampleWithBLOBs(@Param("record") SupplierZs0158WithBLOBs record, @Param("example") SupplierZs0158Example example);

    int updateByExample(@Param("record") SupplierZs0158 record, @Param("example") SupplierZs0158Example example);

    int updateByPrimaryKeySelective(SupplierZs0158WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SupplierZs0158WithBLOBs record);

    int updateByPrimaryKey(SupplierZs0158 record);
}