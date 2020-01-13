package com.zhongwang.data.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.SupplierExponentInfoMapper;
import com.zhongwang.data.dao.SupplierInfoMapper;
import com.zhongwang.data.dao.SupplierSilingInfoMapper;
import com.zhongwang.data.entity.Risk.PageBean;
import com.zhongwang.data.entity.SupplierExponentInfo;
import com.zhongwang.data.entity.SupplierInfo;
import com.zhongwang.data.entity.SupplierTop10Info;
import com.zhongwang.data.entity.Territory;
import com.zhongwang.data.service.SupplierExponentInfoService;
import com.zhongwang.data.service.SupplierInfoService;
import com.zhongwang.data.vo.SupplierOverview;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SupplierInfoServiceImpl implements SupplierInfoService {
    private Logger logger = LoggerFactory.getLogger(SupplierInfoServiceImpl.class);

    @Autowired
    private SupplierInfoMapper supplierInfoMapper;
    @Autowired
    private SupplierExponentInfoMapper supplierExponentInfoMapper;

    /**
     * 查询企业列表
     * @param companyId
     * @return
     */
    @Override
    public ApiResult selectBySupplierName(String companyId) {
        ApiResult ar = new ApiResult();
        try {
            List<Territory> territories = supplierInfoMapper.selectBySupplierName(companyId);
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            ar.setData(territories);
        }catch (Exception e){
            logger.error("查询企业列表分析失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }

        return ar;
    }

    /**
     * 供应商总览
     * @param overview
     * @return
     */
    @Override
    public ApiResult selectByPandect(SupplierOverview overview) {
        SupplierExponentInfo info = new SupplierExponentInfo();
        info.setCompanyId(overview.getCompanyId());
        info.setIndexYearTime("2019");
        ApiResult ar = new ApiResult();
        SupplierOverview overview1 = null;
        try {
            overview1 = supplierInfoMapper.selectByPandect(overview);
            String companyId = overview.getCompanyId();
            SupplierExponentInfo supplierExponentInfo = supplierExponentInfoMapper.selectByLvYueindex(info);//供应商履约能力指数
            overview1.setLvYueIndex(supplierExponentInfo.getMonth1());
            overview1.setInfoContlink("8");//供应商总数环比
            overview1.setRishContlink("15");//本月高风险供应商合计环比
            overview1.setHeighContlink("20");//本月高风险事件合计环比
            overview1.setLvYueIndexlink("13"); //供应商履约能力指数环比
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            ar.setData(overview1);
        }catch (Exception e){
            logger.error("供应商总览分析失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    /**
     *  供应商信息管理>供应商管理
     * @param page
     * @return
     */
    @Override
    public ApiResult selectBySupplierInfo(PageBean page) {
        ApiResult ar = new ApiResult();

        try {


            List<SupplierInfo> list = supplierInfoMapper.selectBySupplierInfo(page);

            String json= JSONObject.toJSONString(list);
            String resultStr="{" +
                    "\"count\":\""+list.size()+"\"," +//当前返回条数
                    "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                    "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                    "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                    "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                    "\"dataList\":"+json+
                    "}";
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            ar.setData(resultStr);
        } catch (Exception e) {
            logger.error("供应商管理分析失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;

    }


}
