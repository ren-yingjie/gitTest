package com.zhongwang.data.dao;
import com.zhongwang.data.request.RiskMonitoringRequest;
import com.zhongwang.data.vo.SupplierMonitorChaneVo;
import com.zhongwang.data.vo.SupplierRishMonitorVo;
import java.util.List;
import java.util.Map;

public interface SupplierRishMonitorInfoMapper {
    /**
     * 风险监控的数量
     * @param riskMonitoringRequest
     * @return
     */
    int selectRishMonitorCount(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 风险信息变更
     * @param riskMonitoringRequest
     * @return
     */
    int  selectRishMonitorCountBG(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 发生信息变更的数量
     * @param riskMonitoringRequest
     * @return
     */
    int  selectRishMonitorCountBGEvent(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * top10
     * @param riskMonitoringRequest
     * @return
     */
    List<SupplierRishMonitorVo> selectRishMonitorTop10(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 分页查询
     * @param riskMonitoringRequest
     * @return
     */
    List<SupplierRishMonitorVo>  selectRishMonitorList(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 总数
     * @param riskMonitoringRequest
     * @return
     */
    int  selectRishMonitorListCount(RiskMonitoringRequest riskMonitoringRequest);

    /**
     * 根据type分类查询
     * @param riskMonitoringRequest
     * @return
     */
    List<Map<String,Object>> selectRishMonitorGroupByType(RiskMonitoringRequest riskMonitoringRequest);


    List<SupplierMonitorChaneVo>  selectSupplierMonitorChaneVo(RiskMonitoringRequest riskMonitoringRequest);






}