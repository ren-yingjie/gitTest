package com.zhongwang.data.service;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.request.RiskMonitoringRequest;

public interface RiskMonitoringService {

    ApiResult RiskMonitoringStatistics(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult RiskMonitoringStatisticsTop10(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 分页查询
     * @param riskMonitoringRequest
     * @return
     */
    ApiResult RiskMonitoringDetailsList(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 类型分组统计
     * @param riskMonitoringRequest
     * @return
     */
    ApiResult selectRishMonitorGroupByType(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierPeculiarityMonitor(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierSeniorInfo(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierShareInfo(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSubsciribedInfo(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierInfo(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 商品质量
     * @param riskMonitoringRequest
     * @return
     */
    ApiResult selectSupplierRiskQualityInfo(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 舆情信息
     * @param riskMonitoringRequest
     * @return
     */
    ApiResult selectsupplierRiskSentimentInfo(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 税务监控
     * @param riskMonitoringRequest
     * @return
     */
    ApiResult selectSuppliperMonitorTaxInfo(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 经营监控 红冲
     * @param riskMonitoringRequest
     * @return
     */
    ApiResult selectSupplierMonitorInvoiceInfoRedCount(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierMonitorInvoiceInfoRedAmount(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierMonitorInvoiceInfoDelCount(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierMonitorInvoiceInfoDelAmount(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierMonitorInvoiceInfoconsecutive(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierJointPunishInfo(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierZs0241(RiskMonitoringRequest riskMonitoringRequest);

    ApiResult selectSupplierMonitorChaneVo(RiskMonitoringRequest riskMonitoringRequest);
}
