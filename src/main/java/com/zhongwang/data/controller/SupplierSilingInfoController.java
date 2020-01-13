package com.zhongwang.data.controller;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.SupplierSilingInfo;
import com.zhongwang.data.service.SupplierSilingInfoService;
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
@RequestMapping("supplierSiLing")
public class SupplierSilingInfoController {
    @Autowired
    SupplierSilingInfoService silingInfoService;

    /**
     * 供应商司龄统计
     * @param silingInfo
     * @return
     */
    @PostMapping("selectSiLing")
    public ApiResult selectBySiLing(SupplierSilingInfo silingInfo){

        return silingInfoService.selectBySiLing(silingInfo);
    }

    /**
     * 供应商合作时长统计
     * @param silingInfo
     * @return
     */
    @PostMapping("selectCooperation")
    public ApiResult selectByCooperation(SupplierSilingInfo silingInfo){

        return silingInfoService.selectByCooperation(silingInfo);
    }

}
