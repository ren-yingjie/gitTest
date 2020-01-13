package com.zhongwang.data.service;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.SupplierSilingInfo;

public interface SupplierSilingInfoService {
    /**
     *  供应商司龄统计
     * @param silingInfo
     * @return
     */
    ApiResult selectBySiLing(SupplierSilingInfo silingInfo);

    /**
     *  供应商合作时长统计
     * @param silingInfo
     * @return
     */
    ApiResult selectByCooperation(SupplierSilingInfo silingInfo);
}
