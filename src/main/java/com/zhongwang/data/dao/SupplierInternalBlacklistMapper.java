package com.zhongwang.data.dao;


import com.zhongwang.data.entity.Risk.PageBean;
import com.zhongwang.data.entity.SupplierInternalBlacklist;

import java.util.List;

public interface SupplierInternalBlacklistMapper {

    int insert(SupplierInternalBlacklist record);

    /**
     * 查询总数
     * @param page
     * @return
     */
    int selectByExtCont(PageBean page);

    /**
     * 内部黑名单查询
     * @return
     */
    List<SupplierInternalBlacklist> selectBySupplierName(PageBean page);

    /**
     * 移除黑名单
     * @return
     */
    int deleteExternal(String uuid);

}