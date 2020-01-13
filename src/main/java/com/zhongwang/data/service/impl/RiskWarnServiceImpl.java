package com.zhongwang.data.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.RiskWarnMapper;
import com.zhongwang.data.entity.Risk.*;
import com.zhongwang.data.entity.SupplierInternalBlacklist;
import com.zhongwang.data.entity.fulfill.*;
import com.zhongwang.data.entity.highrisk.*;
import com.zhongwang.data.service.RiskWarnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskWarnServiceImpl implements RiskWarnService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RiskWarnMapper riskWarnMapper;


    @Override
    public ApiResult querybytj(RiskWarnInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<RiskWarnInfo> RishInfo = riskWarnMapper.querybytj(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;

    }

    @Override
    public ApiResult querybyxzgys(PageBean page) {
        ApiResult ar = new ApiResult();
        try {
            if(!page.getCompanyId().equals("")){
                List<AddRiskListInfo> ListInfo =  riskWarnMapper.querybyxzgys(page);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                String json=JSONObject.toJSONString(ListInfo);
                String resultStr="{" +
                        "\"count\":\""+ListInfo.size()+"\"," +//当前返回条数
                        "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                        "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                        "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                        "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                        "\"dataList\":"+json+
                        "}";
                ar.setData(resultStr);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public Integer querybyxzgysCount(PageBean page) {
        Integer totalCount=0;
        if(!page.getCompanyId().equals("")) {
            totalCount =  riskWarnMapper.querybyxzgysCount(page);
        }
        return totalCount;
    }

    @Override
    public ApiResult querybytj2(RiskWarnInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<RiskWarnInfo> RishInfo = riskWarnMapper.querybytj2(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult queryfxdjfb(RiskLevelInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<RiskWarnInfo> RishInfo = riskWarnMapper.queryfxdjfb(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public int querycxzgCount(PageBean page) {
        Integer totalCount=0;
        if(!page.getCompanyId().equals("")) {
            totalCount =  riskWarnMapper.querycxzgCount(page);
        }
        return totalCount;
    }

    @Override
    public ApiResult querycxzg(PageBean page) {
        ApiResult ar = new ApiResult();
        try {
            if(!page.getCompanyId().equals("")){
                List<GoupInfo> RishInfo = riskWarnMapper.querycxzg(page);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                String json=JSONObject.toJSONString(RishInfo);
                String resultStr="{" +
                        "\"count\":\""+RishInfo.size()+"\"," +//当前返回条数
                        "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                        "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                        "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                        "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                        "\"dataList\":"+json+
                        "}";
                ar.setData(resultStr);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult querycgqsfxgys(GoupInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<GoupInfo> RishInfo = riskWarnMapper.querycgqsfxgys(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult queryyjgysqst(OperatingConditionsInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<OperatingConditionsInfo> RishInfo = riskWarnMapper.queryyjgysqst(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult queryfxgyshList(PageBean page) {
        ApiResult ar = new ApiResult();
        try {
            if(!page.getCompanyId().equals("")){
                List<FxGyshList> RishInfo = riskWarnMapper.queryfxgyshList(page);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                String json=JSONObject.toJSONString(RishInfo);
                String resultStr="{" +
                        "\"count\":\""+RishInfo.size()+"\"," +//当前返回条数
                        "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                        "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                        "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                        "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                        "\"dataList\":"+json+
                        "}";
                ar.setData(resultStr);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public int queryfxgyshListCount(PageBean page) {
        Integer count=riskWarnMapper.queryfxgyshListCount(page);
        return count;
    }


    @Override
    public ApiResult queryqyjbxx(EnterpriseInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<EnterpriseInfo> RishInfo = riskWarnMapper.queryqyjbxx(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult queryjyzk(OperatingConditionsInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<EnterpriseInfo> RishInfo = riskWarnMapper.queryjyzk(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult queryzdsswf(MajorTaxViolations info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<MajorTaxViolations> RishInfo = riskWarnMapper.queryzdsswf(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult queryxzcf(AdministrativePenalties info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<AdministrativePenalties> RishInfo = riskWarnMapper.queryxzcf(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult querybzxrxx(ExecutedInfp info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<AdministrativePenalties> RishInfo = riskWarnMapper.querybzxrxx(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult querysxxx(BrokenPromiseInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<BrokenPromiseInfo> RishInfo = riskWarnMapper.querysxxx(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult querysytjsj(RiskWarnInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<RiskWarnInfo> RishInfo = riskWarnMapper.querysytjsj(info);
                info=new RiskWarnInfo();
                info.setCount("10.0");
                info.setInfo("风险监控");
                info.setType("3");
                RishInfo.add(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult querygysfxdjfb(RiskWarnInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<RiskWarnInfo> RishInfo = riskWarnMapper.querygysfxdjfb(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public int queryyjgfxsjCount(PageBean page) {
        Integer count=riskWarnMapper.queryyjgfxsjCount(page);
        return count;
    }

    @Override
    public ApiResult queryyjgfxsj(PageBean page) {
        ApiResult ar = new ApiResult();
        try {
            if(!page.getCompanyId().equals("")){
                List<HighRiskEvent> RishInfo = riskWarnMapper.queryyjgfxsj(page);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                String json=JSONObject.toJSONString(RishInfo);
                String resultStr="{" +
                        "\"count\":\""+RishInfo.size()+"\"," +//当前返回条数
                        "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                        "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                        "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                        "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                        "\"dataList\":"+json+
                        "}";
                ar.setData(resultStr);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult querygsfyjxq(HighRiskEvent info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                String riskevent = info.getRiskevent();
                if(riskevent.equals("被执行人信息")){
                    List<AdministrativePenalties> RishInfo = riskWarnMapper.queryqybzxrxx(info);
                    ar.setData(RishInfo);
                }
                if(riskevent.equals("失信信息")){
                    List<BrokenPromiseInfo> RishInfo = riskWarnMapper.queryqysxxx(info);
                    ar.setData(RishInfo);
                }
                if(riskevent.equals("法院公告")){
                    List<CourtNotice> RishInfo = riskWarnMapper.queryqyfygg(info);
                    ar.setData(RishInfo);
                }
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());

                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult querycsgjyj(TaxAlert info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<TaxAlert> RishInfo = riskWarnMapper.querycsgjyj(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult querycfyj(PunishmentInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<PunishmentInfo> RishInfo = riskWarnMapper.querycfyj(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult querywfyj(MajorTaxViolations info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<MajorTaxViolations> RishInfo = riskWarnMapper.querywfyj(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult queryhmdyj(BlackList info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<BlackList> RishInfo = riskWarnMapper.queryhmdyj(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult deleteEvent(HighRiskEvent info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                riskWarnMapper.updateEvent(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult addhmd(SupplierInternalBlacklist info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                riskWarnMapper.addhmd(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public int queryyjpzCount(PageBean page) {
        Integer count=riskWarnMapper.queryyjpzCount(page);
        return count;
    }

    @Override
    public ApiResult queryyjpz(PageBean page) {
        ApiResult ar = new ApiResult();
        try {
            if(!page.getCompanyId().equals("")){
                List<EarlyWarningConfiguration> RishInfo = riskWarnMapper.queryyjpz(page);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                String json=JSONObject.toJSONString(RishInfo);
                String resultStr="{" +
                        "\"count\":\""+RishInfo.size()+"\"," +//当前返回条数
                        "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                        "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                        "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                        "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                        "\"dataList\":"+json+
                        "}";
                ar.setData(resultStr);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult addyjpz(EarlyWarningConfiguration info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                riskWarnMapper.addyjpz(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public ApiResult updateyjpz(EarlyWarningConfiguration info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                riskWarnMapper.updateyjpz(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public int queryjgglCount(PageBean page) {
        Integer count=riskWarnMapper.queryjgglCount(page);
        return count;
    }

    @Override
    public ApiResult queryjggl(PageBean page) {
        ApiResult ar = new ApiResult();
        try {
                List<InstitutionalManagement> RishInfo = riskWarnMapper.queryjggl(page);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                String json=JSONObject.toJSONString(RishInfo);
                String resultStr="{" +
                        "\"count\":\""+RishInfo.size()+"\"," +//当前返回条数
                        "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                        "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                        "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                        "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                        "\"dataList\":"+json+
                        "}";
                ar.setData(resultStr);
                return ar;
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
    }


    @Override
    public ApiResult deleteqyjg(InstitutionalManagement info) {
        ApiResult ar = new ApiResult();
        try {
            riskWarnMapper.deleteqyjg(info);
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            return ar;

        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }

    }

    @Override
    public ApiResult queryjgxlk(InstitutionalManagement info) {
        ApiResult ar = new ApiResult();
        try {

                List<InstitutionalManagement> RishInfo = riskWarnMapper.queryjgxlk(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;

        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }

    }

    @Override
    public ApiResult addqyjg(InstitutionalManagement info) {
        ApiResult ar = new ApiResult();
        try {
            riskWarnMapper.addqyjg(info);
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            return ar;

        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
    }

    @Override
    public ApiResult updateqyjg(InstitutionalManagement info) {
        ApiResult ar = new ApiResult();
        try {
            riskWarnMapper.updateqyjg(info);
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            return ar;

        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
    }

    @Override
    public ApiResult queryfxyjgyszb(RiskWarnInfo info) {
        ApiResult ar = new ApiResult();
        try {
            if(!info.getCompanyId().equals("")){
                List<RiskWarnInfo> RishInfo = riskWarnMapper.queryfxyjgyszb(info);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(RishInfo);
                return ar;
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    @Override
    public int queryfxcllsCount(PageBean page) {
        Integer count=riskWarnMapper.queryfxcllsCount(page);
        return count;
    }

    @Override
    public ApiResult queryfxclls(PageBean page) {
        ApiResult ar = new ApiResult();
        try {
            List<FxGyshList> RishInfo = riskWarnMapper.queryfxclls(page);
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            String json=JSONObject.toJSONString(RishInfo);
            String resultStr="{" +
                    "\"count\":\""+RishInfo.size()+"\"," +//当前返回条数
                    "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                    "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                    "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                    "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                    "\"dataList\":"+json+
                    "}";
            ar.setData(resultStr);
            return ar;
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
    }

    @Override
    public int querygyslyCount(PageBean page) {
        Integer count=riskWarnMapper.querygyslyCount(page);
        return count;
    }

    @Override
    public ApiResult querygysly(PageBean page) {
        ApiResult ar = new ApiResult();
        try {
            List<PerformanceIndex> RishInfo = riskWarnMapper.querygysly(page);
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            String json=JSONObject.toJSONString(RishInfo);
            String resultStr="{" +
                    "\"count\":\""+RishInfo.size()+"\"," +//当前返回条数
                    "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                    "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                    "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                    "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                    "\"dataList\":"+json+
                    "}";
            ar.setData(resultStr);
            return ar;
        }catch (Exception e){
            e.printStackTrace();
            logger.info("无数据");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
    }


}
