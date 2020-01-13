package com.zhongwang.data.dao;

import com.zhongwang.data.entity.Risk.PageBean;
import com.zhongwang.data.entity.SupplierInfo;
import com.zhongwang.data.entity.Territory;
import com.zhongwang.data.vo.SupplierOverview;

import java.util.List;

public interface SupplierInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierInfo record);

    int insertSelective(SupplierInfo record);

    SupplierInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SupplierInfo record);

    int updateByPrimaryKey(SupplierInfo record);


    /**
     *
     * @param overview
     * @return
     */
    SupplierOverview selectByPandect(SupplierOverview overview);

    /**
     * 供应商信息管理>供应商管理
     * @param page
     * @return
     */
    List<SupplierInfo> selectBySupplierInfo(PageBean page);

    /**
     * 查询总数
     * @param page
     * @return
     */
    int SupplierInfoCont(PageBean page);

    /**
     * 查询企业
     * @return
     */
    List<Territory> selectBySupplierName(String companyId);

}