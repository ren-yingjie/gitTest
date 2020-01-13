package com.zhongwang.data.service.impl;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.*;
import com.zhongwang.data.entity.*;
import com.zhongwang.data.request.RiskMonitoringRequest;
import com.zhongwang.data.service.RiskMonitoringService;
import com.zhongwang.data.vo.SupplierMonitorChaneVo;
import com.zhongwang.data.vo.SupplierRishMonitorVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RiskMonitoringServiceImpl  implements RiskMonitoringService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SupplierRishMonitorInfoMapper supplierRishMonitorInfoMapper;

    @Autowired
    private SupplierPeculiarityMonitorMapper supplierPeculiarityMonitorMapper;

    @Autowired
    private SupplierSeniorInfoMapper supplierSeniorInfoMapper;

    @Autowired
    private SupplierShareInfoMapper supplierShareInfoMapper;

    @Autowired
    private SupplierSubsciribedInfoMapper supplierSubsciribedInfoMapper;

    @Autowired
    private SupplierRiskQualityInfoMapper supplierRiskQualityInfoMapper;

    @Autowired
    private SupplierRiskSentimentInfoMapper supplierRiskSentimentInfoMapper;

    @Autowired
    private SupplierZs0134Mapper supplierZs0134Mapper;

    @Autowired
    private SuppliperMonitorTaxInfoMapper suppliperMonitorTaxInfoMapper;
    @Autowired
    private SupplierMonitorInvoiceInfoMapper supplierMonitorInvoiceInfoMapper;


    @Override
    public ApiResult RiskMonitoringStatistics(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险监控的统计入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        try {
            int rishMonitorCount = supplierRishMonitorInfoMapper.selectRishMonitorCount(riskMonitoringRequest);
            int rishMonitorCountBG=supplierRishMonitorInfoMapper.selectRishMonitorCountBG(riskMonitoringRequest);
            int rishMonitorCountBGEvent=supplierRishMonitorInfoMapper.selectRishMonitorCountBGEvent(riskMonitoringRequest);
            map.put("rishMonitorCount",rishMonitorCount);
            map.put("rishMonitorCountBG" ,rishMonitorCountBG);
            map.put("rishMonitorCountBGEvent",rishMonitorCountBGEvent);
        } catch (Exception e) {
            logger.error("风险监控的统计异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }

        return ApiResult.success(map);
    }

    @Override
    public ApiResult RiskMonitoringStatisticsTop10(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险监控的统计top10入参{}"+riskMonitoringRequest);
        List<SupplierRishMonitorVo> list=null;
        Map<String ,Object> map=new HashMap<>();
        try {
            list = supplierRishMonitorInfoMapper.selectRishMonitorTop10(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险监控的统计top10异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult RiskMonitoringDetailsList(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险监控信息入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        try {
            int count = supplierRishMonitorInfoMapper.selectRishMonitorListCount(riskMonitoringRequest);
            List<SupplierRishMonitorVo> list = supplierRishMonitorInfoMapper.selectRishMonitorList(riskMonitoringRequest);
            map.put("tatal",count);
            map.put("list",list);
        } catch (Exception e) {
            logger.error("风险监控信息异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }

        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectRishMonitorGroupByType(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险监控类型分组统计入参{}"+riskMonitoringRequest);
        Map<String ,Object> map1=new HashMap<>();
        List<Map<String,Object>> map = null;
        try {
            map = supplierRishMonitorInfoMapper.selectRishMonitorGroupByType(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险监控类型分组统计异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map1.put("list",map);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierPeculiarityMonitor(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险特质监控信息入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierPeculiarityMonitor> list = null;
        try {
            list = supplierPeculiarityMonitorMapper.selectSupplierPeculiarityMonitor(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险特质监控信息异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierSeniorInfo(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险特质监控高管职位信息入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierSeniorInfo> list = null;
        try {
            list = supplierSeniorInfoMapper.selectSupplierSeniorInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险特质监控高管职位信息异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierShareInfo(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险特质监控控股信息入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierShareInfo> list=null;
        try {
            list = supplierShareInfoMapper.selectSupplierShareInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险特质监控控股信息异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSubsciribedInfo(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险特质监控股东信息入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierSubsciribedInfo> list = null;
        try {
            list = supplierSubsciribedInfoMapper.selectSupplierSubsciribedInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险特质监控股东信息异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierInfo(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险特质监控企业基本信息入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierZs0134> list=null;
        try {
             list = supplierZs0134Mapper.selectSupplierInfo(riskMonitoringRequest);
            if(list.size()>0){
                map.put("SupplierInfo",list.get(0));
            }else{
                map.put("SupplierInfo","");
            }
        } catch (Exception e) {
            logger.error("风险特质监控企业基本信息异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierRiskQualityInfo(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险商品质量监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierRiskQualityInfo> list = null;
        try {
            list = supplierRiskQualityInfoMapper.selectSupplierRiskQualityInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险特质监控企业异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectsupplierRiskSentimentInfo(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("风险舆情监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierRiskSentimentInfo> list = null;
        try {
            list = supplierRiskSentimentInfoMapper.selectsupplierRiskSentimentInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险舆情监控异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSuppliperMonitorTaxInfo(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("税务监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SuppliperMonitorTaxInfo> list = null;
        try {
            list = suppliperMonitorTaxInfoMapper.selectSuppliperMonitorTaxInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险税务监控异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierMonitorInvoiceInfoRedCount(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("经营监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierMonitorInvoiceInfo> list=null;
        try {
            riskMonitoringRequest.setInvoiceType("2");
            list = supplierMonitorInvoiceInfoMapper.selectSupplierMonitorInvoiceInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险经营红冲分数监控异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        if(list.size()>0){
            map.put("redCountScale",list.get(0).getCountScale());
            Double normalCountScale=100.00-(Double.parseDouble(list.get(0).getCountScale()));
            map.put("normalCountScale",normalCountScale.toString());
            map.put("redCountScaleStatus","正常");
        }
        return  ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierMonitorInvoiceInfoRedAmount(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("经营监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierMonitorInvoiceInfo> list=null;
        try {
            riskMonitoringRequest.setInvoiceType("2");
            list = supplierMonitorInvoiceInfoMapper.selectSupplierMonitorInvoiceInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险经营红冲金额监控异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        if(list.size()>0){
            map.put("redAmountScale",list.get(0).getAmountScale());
            Double normalCountScale=100.00-(Double.parseDouble(list.get(0).getAmountScale()));
            map.put("normalAmountScale",normalCountScale.toString());
            map.put("redAmountScaleStatus","正常");
        }
        return  ApiResult.success(map);

    }

    @Override
    public ApiResult selectSupplierMonitorInvoiceInfoDelCount(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("经营监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierMonitorInvoiceInfo> list=null;
        try {
            riskMonitoringRequest.setInvoiceType("1");
            list = supplierMonitorInvoiceInfoMapper.selectSupplierMonitorInvoiceInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险经营作废分数监控异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        if(list.size()>0){
            map.put("cancelCountScale",list.get(0).getCountScale());
            Double normalCountScale=100.00-(Double.parseDouble(list.get(0).getCountScale()));
            map.put("normalCountScale",normalCountScale.toString());
            map.put("cancelCountScaleStatus","正常");
        }
        return  ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierMonitorInvoiceInfoDelAmount(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("经营监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierMonitorInvoiceInfo> list=null;
        try {
            riskMonitoringRequest.setInvoiceType("1");
            list = supplierMonitorInvoiceInfoMapper.selectSupplierMonitorInvoiceInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险经营作废金额监控异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        if(list.size()>0){
            map.put("cancelAmountScale",list.get(0).getAmountScale());
            Double normalCountScale=100.00-(Double.parseDouble(list.get(0).getAmountScale()));
            map.put("normalAmountScale",normalCountScale.toString());
            map.put("cancelAmountScaleStatus","正常");
        }
        return  ApiResult.success(map);

    }

    @Override
    public ApiResult selectSupplierMonitorInvoiceInfoconsecutive(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("经营监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierMonitorInvoiceInfo> list=null;
        try {
            riskMonitoringRequest.setInvoiceType("2");
            riskMonitoringRequest.setDataType("2");
            list = supplierMonitorInvoiceInfoMapper.selectSupplierMonitorInvoiceInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("风险经营连号监控异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        if(list.size()>0){
            map.put("consecutiveNumberScale",list.get(0).getConsecutiveNumbersScale());
            Double normalCountScale=100.00-(Double.parseDouble(list.get(0).getConsecutiveNumbersScale()));
            map.put("normalScale",normalCountScale.toString());
            map.put("status","无虚假开票");
        }
        return  ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierJointPunishInfo(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("黑名单监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierJointPunishInfo> list = null;
        try {
            list = supplierMonitorInvoiceInfoMapper.selectSupplierJointPunishInfo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("黑名单监控异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierZs0241(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("司法监控入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierZs0241> list = null;
        try {
            list = suppliperMonitorTaxInfoMapper.selectSupplierZs0241(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("司法监控异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }

    @Override
    public ApiResult selectSupplierMonitorChaneVo(RiskMonitoringRequest riskMonitoringRequest) {
        logger.info("新增监控数量入参{}"+riskMonitoringRequest);
        Map<String ,Object> map=new HashMap<>();
        List<SupplierMonitorChaneVo> list = null;
        try {
            list = supplierRishMonitorInfoMapper.selectSupplierMonitorChaneVo(riskMonitoringRequest);
        } catch (Exception e) {
            logger.error("新增监控数量异常{}",e);
            return ApiResult.error(ResultCodes.ERROR);
        }
        map.put("list",list);
        return ApiResult.success(map);
    }


}
