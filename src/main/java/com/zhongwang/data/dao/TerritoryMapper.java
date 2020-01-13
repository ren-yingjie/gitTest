package com.zhongwang.data.dao;

import com.zhongwang.data.entity.Territory;

import java.util.List;

public interface TerritoryMapper {
    /**
     * 查询地区
     * @return
     */
    List<Territory> selectTerritory();
}
