package com.zhongwang.data.controller;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.dao.SupplierInfoMapper;
import com.zhongwang.data.dao.SupplierRankMapper;
import com.zhongwang.data.entity.Risk.PageBean;
import com.zhongwang.data.entity.SupplierInfo;
import com.zhongwang.data.entity.SupplierRank;
import com.zhongwang.data.service.SupplierInfoService;
import com.zhongwang.data.service.SupplierRankService;
import com.zhongwang.data.service.TerritoryService;
import com.zhongwang.data.vo.SupplierOverview;
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
@RequestMapping("supplierInfo")
public class SupplierInfoController<supplierInfoMapper> {
    @Autowired
    SupplierInfoService infoService;
    @Autowired
    SupplierInfoMapper supplierInfoMapper;
    @Autowired
    SupplierRankService rankService;
    @Autowired
    TerritoryService territoryService;

    /**
     * 供应商总览
     * @param overview
     * @return
     */
    @PostMapping("selectPandec")
    public ApiResult selectByPandect(SupplierOverview overview){
        return infoService.selectByPandect(overview);
    }

    /**
     * 查询企业列表
     * @return
     */
    @PostMapping("selectSupplierName")
    public ApiResult selectBySupplierName(String companyId){
        ApiResult apiResult = new ApiResult();
        ApiResult apiResult1 = infoService.selectBySupplierName(companyId);
        apiResult.setData(apiResult1);
        return apiResult;
    }

    /**
     * 企业级别
     * @return
     */
    @PostMapping("selectRank")
    public ApiResult selectByRank(){
        ApiResult apiResult = new ApiResult();
        ApiResult supplierRank = rankService.selectByRank();
        apiResult.setData(supplierRank);
        return apiResult;
    }

    /**
     * 地域列表
     * @return
     */
    @PostMapping("selectTerritory")
    public ApiResult selectTerritory(){
        ApiResult apiResult = new ApiResult();
        ApiResult supplierRank = territoryService.selectTerritory();
        apiResult.setData(supplierRank);
        return apiResult;
    }

    /**
     * 供应商信息管理>供应商管理
     * @param page
     * @return
     */
    @PostMapping("selectSupplierInfo")
    public ApiResult selectBySupplierInfo(PageBean page){
        int totalCount = supplierInfoMapper.SupplierInfoCont(page);
        //获取当前页
        Integer currentPage  =  page.getCurrentPage();
        //获取每页显示条数
        Integer currentCount =  page.getCurrentCount();
        page.setTotalCount(totalCount);
        //封装总页数=总条数/每页显示条数
        int totalPage=(int)Math.ceil(totalCount*1.0/currentCount); //向上取整
        page.setTotalPage(totalPage);
        //起始索引=(当前页-1)*每页显示条数
        int index=(currentPage-1)*currentCount;
        page.setIndex(index);
        ApiResult apiResult = infoService.selectBySupplierInfo(page);
        return apiResult;
    }



}
