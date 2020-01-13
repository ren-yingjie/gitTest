package com.zhongwang.data.dao;

import com.zhongwang.data.entity.Risk.*;
import com.zhongwang.data.entity.SupplierExponentInfo;
import com.zhongwang.data.entity.SupplierInternalBlacklist;
import com.zhongwang.data.entity.fulfill.*;
import com.zhongwang.data.entity.highrisk.*;

import java.util.List;

public interface RiskWarnMapper {

    List<RiskWarnInfo> querybytj(RiskWarnInfo info);

    List<AddRiskListInfo> querybyxzgys(PageBean info);

    Integer querybyxzgysCount(PageBean page);

    List<RiskWarnInfo> querybytj2(RiskWarnInfo info);

    List<RiskWarnInfo> queryfxdjfb(RiskLevelInfo info);

    Integer querycxzgCount(PageBean page);

    List<GoupInfo> querycxzg(PageBean page);

    List<GoupInfo> querycgqsfxgys(GoupInfo info);

    List<OperatingConditionsInfo> queryyjgysqst(OperatingConditionsInfo info);

    Integer queryfxgyshListCount(PageBean page);

    List<FxGyshList> queryfxgyshList(PageBean page);

    List<EnterpriseInfo> queryqyjbxx(EnterpriseInfo info);

    List<EnterpriseInfo> queryjyzk(OperatingConditionsInfo info);

    List<MajorTaxViolations> queryzdsswf(MajorTaxViolations info);

    List<AdministrativePenalties> queryxzcf(AdministrativePenalties info);

    List<AdministrativePenalties> querybzxrxx(ExecutedInfp info);

    List<BrokenPromiseInfo> querysxxx(BrokenPromiseInfo info);

    List<RiskWarnInfo> querysytjsj(RiskWarnInfo info);

    List<RiskWarnInfo> querygysfxdjfb(RiskWarnInfo info);

    Integer queryyjgfxsjCount(PageBean page);

    List<HighRiskEvent> queryyjgfxsj(PageBean page);

    List<AdministrativePenalties> queryqybzxrxx(HighRiskEvent info);

    List<BrokenPromiseInfo> queryqysxxx(HighRiskEvent info);

    List<CourtNotice> queryqyfygg(HighRiskEvent info);

    List<TaxAlert> querycsgjyj(TaxAlert info);

    List<PunishmentInfo> querycfyj(PunishmentInfo info);

    List<MajorTaxViolations> querywfyj(MajorTaxViolations info);

    List<BlackList> queryhmdyj(BlackList info);

    void updateEvent(HighRiskEvent info);

    void addhmd(SupplierInternalBlacklist info);

    Integer queryyjpzCount(PageBean page);

    List<EarlyWarningConfiguration> queryyjpz(PageBean page);

    void addyjpz(EarlyWarningConfiguration info);

    void updateyjpz(EarlyWarningConfiguration info);

    Integer queryjgglCount(PageBean page);

    List<InstitutionalManagement> queryjggl(PageBean page);

    void deleteqyjg(InstitutionalManagement info);

    List<InstitutionalManagement> queryjgxlk(InstitutionalManagement info);

    void addqyjg(InstitutionalManagement info);

    void updateqyjg(InstitutionalManagement info);

    List<RiskWarnInfo> queryfxyjgyszb(RiskWarnInfo info);

    Integer queryfxcllsCount(PageBean page);

    List<FxGyshList> queryfxclls(PageBean page);

    Integer querygyslyCount(PageBean page);

    List<PerformanceIndex> querygysly(PageBean page);
}
