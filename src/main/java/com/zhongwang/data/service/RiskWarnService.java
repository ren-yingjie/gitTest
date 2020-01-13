package com.zhongwang.data.service;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.Risk.GoupInfo;
import com.zhongwang.data.entity.Risk.PageBean;
import com.zhongwang.data.entity.Risk.RiskLevelInfo;
import com.zhongwang.data.entity.Risk.RiskWarnInfo;
import com.zhongwang.data.entity.SupplierExponentInfo;
import com.zhongwang.data.entity.SupplierInternalBlacklist;
import com.zhongwang.data.entity.fulfill.*;
import com.zhongwang.data.entity.highrisk.BlackList;
import com.zhongwang.data.entity.highrisk.HighRiskEvent;
import com.zhongwang.data.entity.highrisk.PunishmentInfo;
import com.zhongwang.data.entity.highrisk.TaxAlert;

public interface RiskWarnService {

    ApiResult querybytj(RiskWarnInfo info);

    ApiResult querybyxzgys(PageBean page);

    Integer querybyxzgysCount(PageBean page);

    ApiResult querybytj2(RiskWarnInfo info);

    ApiResult queryfxdjfb(RiskLevelInfo info);

    int querycxzgCount(PageBean page);

    ApiResult querycxzg(PageBean page);

    ApiResult querycgqsfxgys(GoupInfo info);

    ApiResult queryyjgysqst(OperatingConditionsInfo info);

    ApiResult queryfxgyshList(PageBean page);

    int queryfxgyshListCount(PageBean page);

    ApiResult queryqyjbxx(EnterpriseInfo info);

    ApiResult queryjyzk(OperatingConditionsInfo info);

    ApiResult queryzdsswf(MajorTaxViolations info);

    ApiResult queryxzcf(AdministrativePenalties info);

    ApiResult querybzxrxx(ExecutedInfp info);

    ApiResult querysxxx(BrokenPromiseInfo info);

    ApiResult querysytjsj(RiskWarnInfo info);

    ApiResult querygysfxdjfb(RiskWarnInfo info);

    int queryyjgfxsjCount(PageBean page);

    ApiResult queryyjgfxsj(PageBean page);

    ApiResult querygsfyjxq(HighRiskEvent info);

    ApiResult querycsgjyj(TaxAlert info);

    ApiResult querycfyj(PunishmentInfo info);

    ApiResult querywfyj(MajorTaxViolations info);

    ApiResult queryhmdyj(BlackList info);

    ApiResult deleteEvent(HighRiskEvent info);

    ApiResult addhmd(SupplierInternalBlacklist info);

    int queryyjpzCount(PageBean page);

    ApiResult queryyjpz(PageBean page);

    ApiResult addyjpz(EarlyWarningConfiguration info);

    ApiResult updateyjpz(EarlyWarningConfiguration info);

    int queryjgglCount(PageBean page);

    ApiResult queryjggl(PageBean page);

    ApiResult deleteqyjg(InstitutionalManagement info);

    ApiResult queryjgxlk(InstitutionalManagement info);

    ApiResult addqyjg(InstitutionalManagement info);

    ApiResult updateqyjg(InstitutionalManagement info);

    ApiResult queryfxyjgyszb(RiskWarnInfo info);

    int queryfxcllsCount(PageBean page);

    ApiResult queryfxclls(PageBean page);

    int querygyslyCount(PageBean page);

    ApiResult querygysly(PageBean page);
}
