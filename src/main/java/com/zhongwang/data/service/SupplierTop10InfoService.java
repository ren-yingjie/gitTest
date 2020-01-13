package com.zhongwang.data.service;

import com.zhongwang.data.common.ApiResult;

public interface SupplierTop10InfoService {
    /**
     *TOP10供应商采购金额占比
     * @param companyId
     * @return
     */
    ApiResult selectByPurchaseTop10(String companyId);

    /**
     * TOP10供应商区域覆盖
     * @param companyId
     * @return
     */
    ApiResult selectByAreaTop10(String companyId);
}
