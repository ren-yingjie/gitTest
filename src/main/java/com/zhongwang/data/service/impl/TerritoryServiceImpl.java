package com.zhongwang.data.service.impl;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.TerritoryMapper;
import com.zhongwang.data.entity.SupplierRank;
import com.zhongwang.data.entity.Territory;
import com.zhongwang.data.service.TerritoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerritoryServiceImpl implements TerritoryService {

    @Autowired
    TerritoryMapper territoryMapper;
    /**
     * 地域查询
     * @return
     */
    @Override
    public ApiResult selectTerritory() {
        ApiResult apiResult = new ApiResult();
        List<Territory> supplierRanks = territoryMapper.selectTerritory();
        apiResult.setCode(ResultCodes.SUCCESSS.getCode());
        apiResult.setMsg(ResultCodes.SUCCESSS.getMessage());
        apiResult.setData(supplierRanks);
        return apiResult;
    }
}
