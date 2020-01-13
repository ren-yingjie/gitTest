package com.zhongwang.data.dao;


import com.zhongwang.data.entity.Risk.PageBean;
import com.zhongwang.data.entity.SupplierInfo;
import com.zhongwang.data.entity.SupplierInternalBlacklist;
import com.zhongwang.data.entity.SupplierJointPunishInfo;

import java.util.List;

public interface SupplierJointPunishInfoMapper {

    int updateByPrimaryKeySelective(SupplierJointPunishInfo record);

    SupplierJointPunishInfo selectByPunishInfo(String jointPunishUuid);

    int insertExternal(SupplierInternalBlacklist blacklist);

    /**
     * 查询总数
     * @param info
     * @return
     */
    int selectByExtCont(SupplierJointPunishInfo info);

    /**
     * 外部黑名单查询
     * @param supplierInfo
     * @return
     */
    List<SupplierJointPunishInfo> selectByExternal(SupplierInfo supplierInfo);

    /**
     * 查询未入围供应商
     * @param subjectName
     * @return
     */
    List<SupplierJointPunishInfo> selectByNotList(String subjectName);

}