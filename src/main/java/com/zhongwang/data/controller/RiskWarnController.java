package com.zhongwang.data.controller;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.Risk.*;
import com.zhongwang.data.entity.SupplierExponentInfo;
import com.zhongwang.data.entity.SupplierInternalBlacklist;
import com.zhongwang.data.entity.fulfill.*;
import com.zhongwang.data.entity.highrisk.BlackList;
import com.zhongwang.data.entity.highrisk.HighRiskEvent;
import com.zhongwang.data.entity.highrisk.PunishmentInfo;
import com.zhongwang.data.entity.highrisk.TaxAlert;
import com.zhongwang.data.service.RiskWarnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Component
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(value = "risk")
public class RiskWarnController {

    //统一日志处理
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RiskWarnService riskWarnService;

    /**
     * 获取本月统计数据
     * @return
     */
    @PostMapping(value = "querybytj")
    public ApiResult querybytj(RiskWarnInfo Info){
        ApiResult apiResult=riskWarnService.querybytj(Info);
        return apiResult;
    }

    /**
     * 本月新增供应商
     * @return
     */
    @PostMapping(value = "querybyxzgys")
    public ApiResult querybyxzgys(PageBean page){//封装总条数
        int totalCount=0;
        try {
            totalCount=riskWarnService.querybyxzgysCount(page);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
        ApiResult apiResult=riskWarnService.querybyxzgys(page);
        return apiResult;
    }

    /**
     * 获取本月统计数据2
     * @return
     */
    @PostMapping(value = "querybytj2")
    public ApiResult querybytj2(RiskWarnInfo Info){
        ApiResult apiResult=riskWarnService.querybytj2(Info);
        return apiResult;
    }

    /**
     * 风险等级分布
     * @return
     */
    @PostMapping(value = "queryfxdjfb")
    public ApiResult queryfxdjfb(RiskLevelInfo Info){
        ApiResult apiResult=riskWarnService.queryfxdjfb(Info);
        return apiResult;
    }

    /**
     *风险持续走高供应商
     * @return
     */
    @PostMapping(value = "querycxzg")
    public ApiResult querycxzg(PageBean page){
        int totalCount=0;
        try {
            totalCount=riskWarnService.querycxzgCount(page);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
        ApiResult apiResult=riskWarnService.querycxzg(page);
        return apiResult;

    }

    /**
     * 采购金额TOP10风险预警供应商
     * @return
     */
    @PostMapping(value = "querycgqsfxgys")
    public ApiResult querycgqsfxgys(GoupInfo Info){
        ApiResult apiResult=riskWarnService.querycgqsfxgys(Info);
        return apiResult;
    }

    /**
     * 预警供应商数量趋势图
     * @param info
     * @return
     */
    @PostMapping(value = "queryyjgysqst")
    public ApiResult queryyjgysqst(OperatingConditionsInfo info){
        ApiResult apiResult=riskWarnService.queryyjgysqst(info);
        return apiResult;
    }

    /**
     * 预警供应商名单
     * @param page
     * @return
     */
    @PostMapping(value = "queryfxgyshList")
    public ApiResult queryfxgyshList(PageBean page){
        int totalCount=0;
        try {
            totalCount=riskWarnService.queryfxgyshListCount(page);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
        ApiResult apiResult=riskWarnService.queryfxgyshList(page);
        return apiResult;
    }


    /**
     * 企业基本信息
     * @param info
     * @return
     */
    @PostMapping(value = "queryqyjbxx")
    public ApiResult queryqyjbxx(EnterpriseInfo info){
        ApiResult apiResult=riskWarnService.queryqyjbxx(info);
        return apiResult;
    }

    /**
     * 经营状况
     * @param info
     * @return
     */
    @PostMapping(value = "queryjyzk")
   public ApiResult queryjyzk(OperatingConditionsInfo info){
       ApiResult apiResult=riskWarnService.queryjyzk(info);
       return apiResult;
   }

    /**
     * 重大税收违法
     * @param info
     * @return
     */
    @PostMapping(value = "queryzdsswf")
    public ApiResult queryzdsswf(MajorTaxViolations info){
        ApiResult apiResult=riskWarnService.queryzdsswf(info);
        return apiResult;
    }

    /**
     * 行政处罚
     * @param info
     * @return
     */
    @PostMapping(value = "queryxzcf")
    public ApiResult queryxzcf(AdministrativePenalties info){
        ApiResult apiResult=riskWarnService.queryxzcf(info);
        return apiResult;
    }

    /**
     * 被执行人信息
     * @param info
     * @return
     */
    @PostMapping(value = "querybzxrxx")
    public ApiResult querybzxrxx(ExecutedInfp info){
        ApiResult apiResult=riskWarnService.querybzxrxx(info);
        return apiResult;
    }

    /**
     * 失信信息
     * @param info
     * @return
     */
    @PostMapping(value = "querysxxx")
    public ApiResult querysxxx(BrokenPromiseInfo info){
        ApiResult apiResult=riskWarnService.querysxxx(info);
        return apiResult;
    }

    /**
     * 首页获取本月统计数据
     * @return
     */
    @PostMapping(value = "querysytjsj")
    public ApiResult querysytjsj(RiskWarnInfo Info){
        ApiResult apiResult=riskWarnService.querysytjsj(Info);
        return apiResult;
    }

    /**
     * 供应商风险等级分布
     * @return
     */
    @PostMapping(value = "querygysfxdjfb")
    public ApiResult querygysfxdjfb(RiskWarnInfo Info){
        ApiResult apiResult=riskWarnService.querygysfxdjfb(Info);
        return apiResult;
    }

    /**
     * 预警高风险事件
     * @param page
     * @return
     */
    @PostMapping(value = "queryyjgfxsj")
    public ApiResult queryyjgfxsj(PageBean page){
        int totalCount=0;
        try {
            totalCount=riskWarnService.queryyjgfxsjCount(page);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
        ApiResult apiResult=riskWarnService.queryyjgfxsj(page);
        return apiResult;
    }

    /**
     * 司法预警详情
     * @return
     */
    @PostMapping(value = "querygsfyjxq")
    public ApiResult querygsfyjxq(HighRiskEvent Info){
        ApiResult apiResult=riskWarnService.querygsfyjxq(Info);
        return apiResult;
    }

    /**
     * 财务，税务，管理，经营预警详情
     * @return
     */
    @PostMapping(value = "querycsgjyj")
    public ApiResult querycsgjyj(TaxAlert Info){
        ApiResult apiResult=riskWarnService.querycsgjyj(Info);
        return apiResult;
    }

    /**
     * 出发预警
     * @param info
     * @return
     */
    @PostMapping(value = "querycfyj")
    public ApiResult querycfyj(PunishmentInfo info){
        ApiResult apiResult=riskWarnService.querycfyj(info);
        return apiResult;
    }

    /**
     * 违法预警
     * @param info
     * @return
     */
    @PostMapping(value = "querywfyj")
    public ApiResult querywfyj(MajorTaxViolations info){
        ApiResult apiResult=riskWarnService.querywfyj(info);
        return apiResult;
    }

    /**
     * 黑名单预警
     * @param info
     * @return
     */
    @PostMapping(value = "queryhmdyj")
    public ApiResult queryhmdyj(BlackList info){
        ApiResult apiResult=riskWarnService.queryhmdyj(info);
        return apiResult;
    }

    /**
     * 解除预警
     * @param info
     * @return
     */
    @PostMapping(value = "deleteEvent")
    public ApiResult queryhmdyj(HighRiskEvent info){
        ApiResult apiResult=riskWarnService.deleteEvent(info);
        return apiResult;
    }

    /**
     * 添加黑名单
     * @param info
     * @return
     */
    @PostMapping(value = "addhmd")
    public ApiResult addhmd(SupplierInternalBlacklist info){
        info.setUuid(getUuid());
        ApiResult apiResult=riskWarnService.addhmd(info);
        return apiResult;
    }


    /**
     * 预警配置
     * @param page
     * @return
     */
    @PostMapping(value = "queryyjpz")
    public ApiResult queryyjpz(PageBean page){
        int totalCount=0;
        try {
            totalCount=riskWarnService.queryyjpzCount(page);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
        ApiResult apiResult=riskWarnService.queryyjpz(page);
        return apiResult;
    }

    /**
     * 新增预警配置
     * @param info
     * @return
     */
    @PostMapping(value = "addyjpz")
    public ApiResult addyjpz(EarlyWarningConfiguration info){
        info.setUuid(getUuid());
        ApiResult apiResult=riskWarnService.addyjpz(info);
        return apiResult;
    }

    /**
     * 修改预警配置
     * @param info
     * @return
     */
    @PostMapping(value = "updateyjpz")
    public ApiResult updateyjpz(EarlyWarningConfiguration info){
        ApiResult apiResult=riskWarnService.updateyjpz(info);
        return apiResult;
    }

    /**
     * 预警配置
     * @param page
     * @return
     */
    @PostMapping(value = "queryjggl")
    public ApiResult queryjggl(PageBean page){
        int totalCount=0;
        try {
            totalCount=riskWarnService.queryjgglCount(page);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
        ApiResult apiResult=riskWarnService.queryjggl(page);
        return apiResult;
    }


    /**
     * 删除机构
     * @param info
     * @return
     */
    @PostMapping(value = "deleteqyjg")
    public ApiResult deleteqyjg(InstitutionalManagement info){
        ApiResult apiResult=riskWarnService.deleteqyjg(info);
        return apiResult;
    }

    /**
     * 获取机构下拉框
     */
    @PostMapping(value = "queryjgxlk")
    public ApiResult queryjgxlk(InstitutionalManagement info){
        ApiResult apiResult=riskWarnService.queryjgxlk(info);
        return apiResult;
    }

    /**
     * 添加机构
     * @param info
     * @return
     */
    @PostMapping(value = "addqyjg")
    public ApiResult addqyjg(InstitutionalManagement info){
        ApiResult apiResult=riskWarnService.addqyjg(info);
        return apiResult;
    }

    /**
     * 修改机构
     * @param info
     * @return
     */
    @PostMapping(value = "updateqyjg")
    public ApiResult updateqyjg(InstitutionalManagement info){
        ApiResult apiResult=riskWarnService.updateqyjg(info);
        return apiResult;
    }

    /**
     * 风险预警供应商占比
     * @return
     */
    @PostMapping(value = "queryfxyjgyszb")
    public ApiResult queryfxyjgyszb(RiskWarnInfo Info){
        ApiResult apiResult=riskWarnService.queryfxyjgyszb(Info);
        return apiResult;
    }

    /**
     * 风险处理历史
     * @param page
     * @return
     */
    @PostMapping(value = "queryfxclls")
    public ApiResult queryfxclls(PageBean page){
        int totalCount=0;
        try {
            totalCount=riskWarnService.queryfxcllsCount(page);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
        ApiResult apiResult=riskWarnService.queryfxclls(page);
        return apiResult;
    }


    /**
     * 供应商履约能力查询
     * @param page
     * @return
     */
    @PostMapping(value = "querygysly")
    public ApiResult querygysly(PageBean page){
        int totalCount=0;
        try {
            totalCount=riskWarnService.querygyslyCount(page);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
        ApiResult apiResult=riskWarnService.querygysly(page);
        return apiResult;
    }

    private String getUuid(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }

}
