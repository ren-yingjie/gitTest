package com.zhongwang.data.controller;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.SupplierExponentInfo;
import com.zhongwang.data.service.SupplierExponentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口控制层
 */
@CrossOrigin
@RestController
@RequestMapping("supplierIndex")
public class SupplierExponentInfoController {

    @Autowired
    SupplierExponentInfoService infoService;

    /**
     *供应商履约指数查询
     * @param info
     * @return
     */
    @PostMapping("honAnAIndex")
    public ApiResult selectByLvYueindex(SupplierExponentInfo info){
        return infoService.selectByLvYueindex(info);
    }
    /**
     *供应商稳定指数
     * @param info
     * @return
     */
    @PostMapping("stabilizationIndex")
    public ApiResult selectByWenDingindex(SupplierExponentInfo info){
        return infoService.selectByWenDingindex(info);
    }
    /**
     *供应商风险指数
     * @param info
     * @return
     */
    @PostMapping("riskIndex")
    public ApiResult selectByFengXianindex(SupplierExponentInfo info){
        return infoService.selectByFengXianindex(info);
    }
    /**
     *供应商成长指数
     * @param info
     * @return
     */
    @PostMapping("growUpIndex")
    public ApiResult selectByChengZhangindex(SupplierExponentInfo info){
        return infoService.selectByChengZhangindex(info);
    }
}
