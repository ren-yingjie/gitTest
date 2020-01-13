package com.zhongwang.data.service.impl;


import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.SupplierExponentInfoMapper;
import com.zhongwang.data.entity.SupplierExponentInfo;
import com.zhongwang.data.service.SupplierExponentInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierExponentInfoServiceImpl implements SupplierExponentInfoService {
    private Logger logger = LoggerFactory.getLogger(SupplierExponentInfoServiceImpl.class);

    @Autowired
    private SupplierExponentInfoMapper supplierExponentInfoMapper;

    /**
     * 供应商履约指数查询(折线图)
     * @param info
     * @return
     */
    @Override
    public ApiResult selectByLvYueindex(SupplierExponentInfo info) {
        info.setIndexYearTime("2019");
        ApiResult ar = new ApiResult();
        try {
            if(info !=null || !info.equals("")){
                SupplierExponentInfo exponentInfo = supplierExponentInfoMapper.selectByLvYueindex(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(exponentInfo);
                return ar;
            }
        }catch (Exception e){
            logger.error("供应商履约指数分析失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    /**
     * 供应商稳定指数
     * @param info
     * @return
     */
    @Override
    public ApiResult selectByWenDingindex(SupplierExponentInfo info) {
        info.setIndexYearTime("2019");
        ApiResult ar = new ApiResult();
        try {
            if(info !=null){
                SupplierExponentInfo exponentInfo = supplierExponentInfoMapper.selectByWenDingindex(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(exponentInfo);
                return ar;
            }
        }catch (Exception e){
            logger.error("供应商稳定指数分析失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    /**
     * 供应商风险指数
     * @param info
     * @return
     */
    @Override
    public ApiResult selectByFengXianindex(SupplierExponentInfo info) {
        info.setIndexYearTime("2019");
        ApiResult ar = new ApiResult();
        try {
            if(info !=null){
                SupplierExponentInfo exponentInfo = supplierExponentInfoMapper.selectByFengXianindex(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(exponentInfo);
                return ar;
            }
        }catch (Exception e){
            logger.error("供应商风险指数分析失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    /**
     * 供应商成长指数
     * @param info
     * @return
     */
    @Override
    public ApiResult selectByChengZhangindex(SupplierExponentInfo info) {
        info.setIndexYearTime("2019");
        ApiResult ar = new ApiResult();
        try {
            if(info !=null){
                SupplierExponentInfo exponentInfo = supplierExponentInfoMapper.selectByChengZhangindex(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(exponentInfo);
                return ar;
            }
        }catch (Exception e){
            logger.error("供应商成长指数分析失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }
}
