package com.zhongwang.data.controller;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.service.SupplierTop10InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口控制层
 */
@CrossOrigin
@RestController
@RequestMapping("supplierTop")
public class SupplierTop10InfoController {

    @Autowired
    SupplierTop10InfoService top10InfoService;

    /**
     * TOP10供应商采购金额占比
     * @param companyId
     * @return
     */
    @PostMapping("selectSiLingTop10")
    public ApiResult selectByPurchaseTop10(String companyId) {
        return top10InfoService.selectByPurchaseTop10(companyId);
    }

    /**
     * TOP10供应商区域覆盖
     * @param companyId
     * @return
     */
    @PostMapping("selectAreaTop10")
    public ApiResult selectByAreaTop10(String companyId) {
        return top10InfoService.selectByAreaTop10(companyId);
    }

}
