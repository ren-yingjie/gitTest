package com.zhongwang.data.controller;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.dao.SupplierJointPunishInfoMapper;
import com.zhongwang.data.entity.SupplierInfo;
import com.zhongwang.data.entity.SupplierJointPunishInfo;
import com.zhongwang.data.service.SupplierJointPunishInfoServie;
import com.zhongwang.data.vo.SupplierOverview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口控制层
 */
@CrossOrigin
@RestController
@RequestMapping("supplierBlacklist")
public class SupplierJointPunishInfoController {
    @Autowired
    SupplierJointPunishInfoServie punishInfoServie;
    @Autowired
    SupplierJointPunishInfoMapper punishInfoMapper;
    /**
     * 外部黑名单查询
     * @param supplierInfo
     * @return
     */
    @PostMapping("selectExternal")
    public ApiResult selectByExternal(SupplierInfo supplierInfo){
        SupplierJointPunishInfo info = new SupplierJointPunishInfo();
        info.setInternalBlacklist(supplierInfo.getInternalBlacklist());//供应商类别：0没有入围1入围
        info.setSubjectStatus(supplierInfo.getSubjectStatus());//黑名单类别：0联合1行业
        info.setCompanyId(supplierInfo.getCompanyId());//企业id
        info.setShortlistedType("1");
        int totalCount = punishInfoMapper.selectByExtCont(info);
        //获取当前页
        Integer currentPage  =  supplierInfo.getCurrentPage();
        //获取每页显示条数
        Integer currentCount =  supplierInfo.getCurrentCount();
        supplierInfo.setTotalCount(totalCount);
        //封装总页数=总条数/每页显示条数
        int totalPage=(int)Math.ceil(totalCount*1.0/currentCount); //向上取整
        supplierInfo.setTotalPage(totalPage);
        //起始索引=(当前页-1)*每页显示条数
        int index=(currentPage-1)*currentCount;
        supplierInfo.setIndex(index);
        ApiResult apiResult = punishInfoServie.selectByExternal(supplierInfo);
        return apiResult;
    }

    /**
     * 查询未入围供应商
     * @param subjectName
     * @return
     */
    @PostMapping("selectNotLis")
    public ApiResult selectByNotList(String subjectName){
        return punishInfoServie.selectByNotList(subjectName);
    }

    /**
     * 更新外部黑名单
     * @param punishInfo
     * @return
     */
    @PostMapping("updatSelective")
    public ApiResult updateByPrimaryKeySelective(SupplierJointPunishInfo punishInfo){
        return punishInfoServie.updateByPrimaryKeySelective(punishInfo);
    }

}
