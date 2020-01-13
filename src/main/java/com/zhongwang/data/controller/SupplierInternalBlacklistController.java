package com.zhongwang.data.controller;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.dao.SupplierInternalBlacklistMapper;
import com.zhongwang.data.entity.Risk.PageBean;
import com.zhongwang.data.entity.SupplierInternalBlacklist;
import com.zhongwang.data.service.SupplierInternalBlacklistServie;
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
@RequestMapping("supplierInternalBlacklist")
public class SupplierInternalBlacklistController {
    @Autowired
    SupplierInternalBlacklistServie blacklistServie;
    @Autowired
    SupplierInternalBlacklistMapper blacklistMapper;

    /**
     * 查询内部黑名单
     * @return
     */
    @PostMapping("selectSupplierName")
    public ApiResult selectBySupplierName(PageBean page){
        int totalCount = blacklistMapper.selectByExtCont(page);
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
        ApiResult apiResult = blacklistServie.selectBySupplierName(page);
        return apiResult;
    }

    /**
     * 移除黑名单
     * @param uuid
     * @return
     */
    @PostMapping("deleteExternal")
    public ApiResult deleteExternal(String uuid){
        return blacklistServie.deleteExternal(uuid);
    }

}
