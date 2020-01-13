package com.zhongwang.data.controller;


import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.request.RiskMonitoringRequest;
import com.zhongwang.data.service.RiskMonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 风险监控统计模块
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("riskMonitoring")
public class RiskMonitoringController {


    @Autowired
    RiskMonitoringService riskMonitoringService;

    /**
     *风险监控统计
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getTatistics")
    public ApiResult RiskMonitoringStatistics( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.RiskMonitoringStatistics(riskMonitoringRequest);
        return result;

    }

    /**
     * 风险监控统计top10
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getTatisticsTop10")
    public ApiResult RiskMonitoringStatisticsTop10(RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.RiskMonitoringStatisticsTop10(riskMonitoringRequest);
        return result;

    }

    /**
     * 分页查询
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getDetailsList")
    public ApiResult RiskMonitoringDetailsList( RiskMonitoringRequest riskMonitoringRequest){
        int index=(riskMonitoringRequest.getCurrentPage()-1)*riskMonitoringRequest.getCurrentCount();
        riskMonitoringRequest.setCurrentPage(index);
        ApiResult result = riskMonitoringService.RiskMonitoringDetailsList(riskMonitoringRequest);
        return result;

    }

    /**
     * 分组统计
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getGroupByType")
    public ApiResult selectRishMonitorGroupByType( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectRishMonitorGroupByType(riskMonitoringRequest);
        return result;

    }

    /**
     * 特质监控 评分
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getSupplierPeculiarity")
    public ApiResult selectSupplierPeculiarityMonitor( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectSupplierPeculiarityMonitor(riskMonitoringRequest);
        return result;

    }

    /**
     * 特质监控  高管职位
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getSupplierSeniorInfo")
    public ApiResult selectSupplierSeniorInfo( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectSupplierSeniorInfo(riskMonitoringRequest);
        return result;

    }

    /**
     * 特质监控  控股信息
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getSupplierShareInfo")
    public ApiResult selectSupplierShareInfo( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectSupplierShareInfo(riskMonitoringRequest);
        return result;

    }

    /**
     * 特质监控  股东信息
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getSubsciribedInfo")
    public ApiResult selectSubsciribedInfo( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectSubsciribedInfo(riskMonitoringRequest);
        return result;

    }

    /**
     * 特质监控  企业基本
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getSupplierInfo")
    public ApiResult selectSupplierInfo( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectSupplierInfo(riskMonitoringRequest);
        return result;

    }

    /**
     * 产品质量
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getQualityInfo")
    public ApiResult selectRiskQualityInfo( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectSupplierRiskQualityInfo(riskMonitoringRequest);
        return result;

    }
    //selectsupplierRiskSentimentInfo

    /**
     * 舆情监控
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getSentimentInfo")
    public ApiResult selectsupplierRiskSentimentInfo( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectsupplierRiskSentimentInfo(riskMonitoringRequest);
        return result;

    }

    /**
     * 税务信息
     * @param riskMonitoringRequest
     * @return
     */
    //selectSuppliperMonitorTaxInfo
    @PostMapping("getTaxInfo")
    public ApiResult selectSuppliperMonitorTaxInfo( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectSuppliperMonitorTaxInfo(riskMonitoringRequest);
        return result;

    }

    /**
     * 进项红冲
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getInvoiceInfoRedCountIn")
    public ApiResult selectSupplierMonitorInvoiceInfoRedCountInPut( RiskMonitoringRequest riskMonitoringRequest){
        riskMonitoringRequest.setDataType("1");
        ApiResult result = riskMonitoringService.selectSupplierMonitorInvoiceInfoRedCount(riskMonitoringRequest);
        return result;

    }
    /**
     * 销项红冲
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getInvoiceInfoRedCountOut")
    public ApiResult selectSupplierMonitorInvoiceInfoRedCountOut( RiskMonitoringRequest riskMonitoringRequest){
        riskMonitoringRequest.setDataType("2");
        ApiResult result = riskMonitoringService.selectSupplierMonitorInvoiceInfoRedCount(riskMonitoringRequest);
        return result;

    }
    //selectSupplierMonitorInvoiceInfoRedAmount

    /**
     * 进项红冲金额
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getInvoiceInfoRedAmountIn")
    public ApiResult selectSupplierMonitorInvoiceInfoRedAmountIn( RiskMonitoringRequest riskMonitoringRequest){
        riskMonitoringRequest.setDataType("1");
        ApiResult result = riskMonitoringService.selectSupplierMonitorInvoiceInfoRedAmount(riskMonitoringRequest);
        return result;

    }
    /**
     * 销项红冲金额
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getInvoiceInfoRedAmountOut")
    public ApiResult selectSupplierMonitorInvoiceInfoRedAmountOut( RiskMonitoringRequest riskMonitoringRequest){
        riskMonitoringRequest.setDataType("2");
        ApiResult result = riskMonitoringService.selectSupplierMonitorInvoiceInfoRedAmount(riskMonitoringRequest);
        return result;

    }
    //selectSupplierMonitorInvoiceInfoDelCount

    /**
     * 进项作废份数
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getInvoiceInfoDelCountIn")
    public ApiResult selectSupplierMonitorInvoiceInfoDelCountIn( RiskMonitoringRequest riskMonitoringRequest){
        riskMonitoringRequest.setDataType("1");
        ApiResult result = riskMonitoringService.selectSupplierMonitorInvoiceInfoDelCount(riskMonitoringRequest);
        return result;

    }
    /**
     * 销项作废份数
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getInvoiceInfoDelCountOut")
    public ApiResult selectSupplierMonitorInvoiceInfoDelCountOut( RiskMonitoringRequest riskMonitoringRequest){
        riskMonitoringRequest.setDataType("2");
        ApiResult result = riskMonitoringService.selectSupplierMonitorInvoiceInfoDelCount(riskMonitoringRequest);
        return result;

    }
    //selectSupplierMonitorInvoiceInfoDelAmount
    /**
     * 进项作废金额
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getInvoiceInfoDelAmountIn")
    public ApiResult selectSupplierMonitorInvoiceInfoDelAmountIn( RiskMonitoringRequest riskMonitoringRequest){
        riskMonitoringRequest.setDataType("1");
        ApiResult result = riskMonitoringService.selectSupplierMonitorInvoiceInfoDelAmount(riskMonitoringRequest);
        return result;

    }
    /**
     * 销项作废金额
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getInvoiceInfoDelAmountOut")
    public ApiResult selectSupplierMonitorInvoiceInfoDelAmountOut( RiskMonitoringRequest riskMonitoringRequest){
        riskMonitoringRequest.setDataType("2");
        ApiResult result = riskMonitoringService.selectSupplierMonitorInvoiceInfoDelAmount(riskMonitoringRequest);
        return result;

    }
    //selectSupplierMonitorInvoiceInfoconsecutive

    /**
     * 连号的占比
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getInvoiceInfoConsecutive")
    public ApiResult selectSupplierMonitorInvoiceInfoconsecutive( RiskMonitoringRequest riskMonitoringRequest){

        ApiResult result = riskMonitoringService.selectSupplierMonitorInvoiceInfoconsecutive(riskMonitoringRequest);
        return result;

    }

    /**
     * 外部黑名单
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getSupplierJointPunishInfo")
    public ApiResult selectSupplierJointPunishInfo( RiskMonitoringRequest riskMonitoringRequest){
        ApiResult result = riskMonitoringService.selectSupplierJointPunishInfo(riskMonitoringRequest);
        return result;

    }


    @PostMapping("getSelectSupplierZs0241")
    public ApiResult selectSupplierZs0241( RiskMonitoringRequest riskMonitoringRequest){
        ApiResult result = riskMonitoringService.selectSupplierZs0241(riskMonitoringRequest);
        return result;

    }

    //

    /**
     * 改变的监控数量
     * @param riskMonitoringRequest
     * @return
     */
    @PostMapping("getCountChange")
    public ApiResult selectSupplierMonitorChaneVo( RiskMonitoringRequest riskMonitoringRequest){
        ApiResult result = riskMonitoringService.selectSupplierMonitorChaneVo(riskMonitoringRequest);
        return result;

    }


}
