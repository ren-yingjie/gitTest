package com.zhongwang.data.service.impl;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.SupplierTop10InfoMapper;
import com.zhongwang.data.entity.SupplierTop10Info;
import com.zhongwang.data.service.SupplierTop10InfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SupplierTop10InfoServiceImpl implements SupplierTop10InfoService {
    private Logger logger = LoggerFactory.getLogger(SupplierTop10InfoServiceImpl.class);

    @Autowired
    SupplierTop10InfoMapper supplierTop10InfoMapper;

    /**
     *  TOP10供应商采购金额占比
     * @param companyId
     * @return
     */
    @Override
    public ApiResult selectByPurchaseTop10(String companyId) {
        ApiResult ar = new ApiResult();

        List<SupplierTop10Info> list = new ArrayList<>();
        try {
            if(companyId !=null){
                List<SupplierTop10Info> info = supplierTop10InfoMapper.selectByPurchaseTop10(companyId);
                for(int i=0;info.size()>i;i++){
                    SupplierTop10Info supplierTop10Info = new SupplierTop10Info();
                    supplierTop10Info.setSupplierName(info.get(i).getSupplierName());
                    supplierTop10Info.setAreaScale(info.get(i).getAmountScale());
                    list.add(supplierTop10Info);
                }

                ar.setData(list);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                return ar;
            }
        }catch (Exception e){
            logger.error("数据分析失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    /**
     *  TOP10供应商区域覆盖
     * @param companyId
     * @return
     */
    @Override
    public ApiResult selectByAreaTop10(String companyId) {

        ApiResult ar = new ApiResult();
        try {
            if(companyId !=null){
                List<SupplierTop10Info> info = supplierTop10InfoMapper.selectByAreaTop10(companyId);
                List<SupplierTop10Info> list = new ArrayList<SupplierTop10Info>();
                for(int i=0;info.size()>i;i++){
                    SupplierTop10Info supplierTop10Info = new SupplierTop10Info();
                    supplierTop10Info.setSupplierArea(info.get(i).getSupplierArea());
                    supplierTop10Info.setAreaScale(info.get(i).getAreaScale());
                    list.add(supplierTop10Info);
                }

                ar.setData(list);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                return ar;
            }
        }catch (Exception e){
            logger.error("数据分析失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }
}
