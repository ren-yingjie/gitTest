package com.zhongwang.data.service;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.entity.SupplierInfo;
import com.zhongwang.data.entity.SupplierJointPunishInfo;

public interface SupplierJointPunishInfoServie {
    /**
     * 外部黑名单查询
     * @param supplierInfo
     * @return
     */
    ApiResult selectByExternal(SupplierInfo supplierInfo);

    /**
     * 查询未入围供应商
     * @param subjectName
     * @return
     */
    ApiResult selectByNotList(String subjectName);

    /**
     * 更新是外部黑名单
     * @param punishInfo
     * @return
     */
    ApiResult updateByPrimaryKeySelective(SupplierJointPunishInfo punishInfo);
}
