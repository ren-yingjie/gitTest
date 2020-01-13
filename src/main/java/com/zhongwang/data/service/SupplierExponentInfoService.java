package com.zhongwang.data.service;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.SupplierExponentInfo;

public interface SupplierExponentInfoService {
    /**
     * 供应商履约指数查询
     * @param info
     * @return
     */
    ApiResult selectByLvYueindex(SupplierExponentInfo info);
    /**
     * 供应商稳定指数
     * @param info
     * @return
     */
    ApiResult selectByWenDingindex(SupplierExponentInfo info);
    /**
     * 供应商风险指数
     * @param info
     * @return
     */
    ApiResult selectByFengXianindex(SupplierExponentInfo info);
    /**
     * 供应商成长指数
     * @param info
     * @return
     */
    ApiResult selectByChengZhangindex(SupplierExponentInfo info);
}
