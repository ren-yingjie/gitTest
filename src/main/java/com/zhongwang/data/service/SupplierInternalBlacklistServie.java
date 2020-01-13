package com.zhongwang.data.service;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.Risk.PageBean;

public interface SupplierInternalBlacklistServie {
    /**
     * 查询内部黑名单
     * @return
     */
    ApiResult selectBySupplierName(PageBean page);

    /**
     * 移除黑名单
     * @param uuid
     * @return
     */
    ApiResult deleteExternal(String uuid);
}
