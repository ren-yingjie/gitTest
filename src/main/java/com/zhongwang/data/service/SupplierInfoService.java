package com.zhongwang.data.service;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.Risk.PageBean;
import com.zhongwang.data.entity.SupplierInfo;
import com.zhongwang.data.vo.SupplierOverview;

public interface SupplierInfoService {
    /**
     * 供应商总览
     * @param overview
     * @return
     */
    ApiResult selectByPandect(SupplierOverview overview);

    /**
     * 供应商信息管理>供应商管理
     * @param page
     * @return
     */
    ApiResult selectBySupplierInfo(PageBean page);

    /**
     * 查询企业列表
     * @param companyId
     * @return
     */
    ApiResult selectBySupplierName(String companyId);
}
