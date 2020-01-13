package com.zhongwang.data.service.impl;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.SupplierSilingInfoMapper;
import com.zhongwang.data.entity.SupplierExponentInfo;
import com.zhongwang.data.entity.SupplierSilingInfo;
import com.zhongwang.data.service.SupplierSilingInfoService;
import com.zhongwang.data.vo.SupplierSiling;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierSilingInfoServiceImpl implements SupplierSilingInfoService {
    private Logger logger = LoggerFactory.getLogger(SupplierSilingInfoServiceImpl.class);

    @Autowired
    SupplierSilingInfoMapper silingInfoMapper;

    /**
     * 供应商司龄统计
     * @param silingInfo
     * @return
     */
    @Override
    public ApiResult selectBySiLing(SupplierSilingInfo silingInfo) {
        silingInfo.setYearTime("2019");
        ApiResult ar = new ApiResult();
        List<SupplierSiling> list = new ArrayList<>();
        SupplierSiling siling1dow = new SupplierSiling();
        SupplierSiling siling1 = new SupplierSiling();
        SupplierSiling siling2 = new SupplierSiling();
        SupplierSiling siling3 = new SupplierSiling();
        SupplierSiling siling4 = new SupplierSiling();
        SupplierSiling siling5 = new SupplierSiling();
        SupplierSiling siling5up = new SupplierSiling();
        try {
            if(silingInfo !=null|| !silingInfo.equals("")){
                SupplierSilingInfo info = silingInfoMapper.selectBySiLing(silingInfo);
                siling5up.setName("5年以上");
                siling5up.setProportion(info.getSilingYear5Up());
                list.add(siling5up);
                siling5.setName("5年");
                siling5.setProportion(info.getSilingYear5());
                list.add(siling5);
                siling4.setName("4年");
                siling4.setProportion(info.getSilingYear4());
                list.add(siling4);
                siling3.setName("3年");
                siling3.setProportion(info.getSilingYear3());
                list.add(siling3);
                siling2.setName("2年");
                siling2.setProportion(info.getSilingYear2());
                list.add(siling2);
                siling1.setName("1年");
                siling1.setProportion(info.getSilingYear1());
                list.add(siling1);

                siling1dow.setName("1年以下");
                siling1dow.setProportion(info.getSilingYear1Down());
                list.add(siling1dow);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(list);
                return ar;
            }
        }catch (Exception e){
            logger.error("司龄统计失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    /**
     * 供应商合作时长统计
     * @param silingInfo
     * @return
     */
    @Override
    public ApiResult selectByCooperation(SupplierSilingInfo silingInfo) {
        silingInfo.setYearTime("2019");
        ApiResult ar = new ApiResult();
        List<SupplierSiling> list = new ArrayList<>();
        SupplierSiling siling1dow = new SupplierSiling();
        SupplierSiling siling1 = new SupplierSiling();
        SupplierSiling siling2 = new SupplierSiling();
        SupplierSiling siling3 = new SupplierSiling();
        SupplierSiling siling4 = new SupplierSiling();
        SupplierSiling siling5 = new SupplierSiling();
        SupplierSiling siling5up = new SupplierSiling();
        try {
            if(silingInfo !=null || !silingInfo.equals("")){
                SupplierSilingInfo info = silingInfoMapper.selectByCooperation(silingInfo);
                siling5up.setName("5年以上");
                siling5up.setProportion(info.getSilingYear5Up());
                list.add(siling5up);
                siling5.setName("5年");
                siling5.setProportion(info.getSilingYear5());
                list.add(siling5);
                siling4.setName("4年");
                siling4.setProportion(info.getSilingYear4());
                list.add(siling4);
                siling3.setName("3年");
                siling3.setProportion(info.getSilingYear3());
                list.add(siling3);
                siling2.setName("2年");
                siling2.setProportion(info.getSilingYear2());
                list.add(siling2);
                siling1.setName("1年");
                siling1.setProportion(info.getSilingYear1());
                list.add(siling1);

                siling1dow.setName("1年以下");
                siling1dow.setProportion(info.getSilingYear1Down());
                list.add(siling1dow);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(list);
                return ar;
            }
        }catch (Exception e){
            logger.error("合作时长统计失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }
}
