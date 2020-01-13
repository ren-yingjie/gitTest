package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierZs0159;
import com.zhongwang.data.entity.SupplierZs0159Example;
import com.zhongwang.data.entity.SupplierZs0159WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierZs0159Mapper {
    int countByExample(SupplierZs0159Example example);

    int deleteByExample(SupplierZs0159Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierZs0159WithBLOBs record);

    int insertSelective(SupplierZs0159WithBLOBs record);

    List<SupplierZs0159WithBLOBs> selectByExampleWithBLOBs(SupplierZs0159Example example);

    List<SupplierZs0159> selectByExample(SupplierZs0159Example example);

    SupplierZs0159WithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierZs0159WithBLOBs record, @Param("example") SupplierZs0159Example example);

    int updateByExampleWithBLOBs(@Param("record") SupplierZs0159WithBLOBs record, @Param("example") SupplierZs0159Example example);

    int updateByExample(@Param("record") SupplierZs0159 record, @Param("example") SupplierZs0159Example example);

    int updateByPrimaryKeySelective(SupplierZs0159WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SupplierZs0159WithBLOBs record);

    int updateByPrimaryKey(SupplierZs0159 record);
}