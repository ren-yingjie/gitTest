package com.zhongwang.data.service;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.SupplierRank;

public interface SupplierRankService {
    /**
     * 企业评级
     * @return
     */
    ApiResult selectByRank();
}
