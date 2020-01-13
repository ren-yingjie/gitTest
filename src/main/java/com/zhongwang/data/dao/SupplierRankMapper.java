package com.zhongwang.data.dao;

import com.zhongwang.data.entity.SupplierRank;

import java.util.List;

public interface SupplierRankMapper {

    /**
     * 企业级别
     * @return
     */
    List<SupplierRank> selectByRank();
}
