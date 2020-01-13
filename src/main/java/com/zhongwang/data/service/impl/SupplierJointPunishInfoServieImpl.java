package com.zhongwang.data.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.SupplierJointPunishInfoMapper;
import com.zhongwang.data.entity.SupplierInfo;
import com.zhongwang.data.entity.SupplierInternalBlacklist;
import com.zhongwang.data.entity.SupplierJointPunishInfo;
import com.zhongwang.data.service.SupplierJointPunishInfoServie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierJointPunishInfoServieImpl implements SupplierJointPunishInfoServie {

    private Logger logger = LoggerFactory.getLogger(SupplierJointPunishInfoServieImpl.class);
    @Autowired
    SupplierJointPunishInfoMapper punishInfoMapper;
    /**
     * 外部黑名单查询
     * @param supplierInfo
     * @return
     */
    @Override
    public ApiResult selectByExternal(SupplierInfo supplierInfo) {
        ApiResult ar = new ApiResult();
        try {
            if(supplierInfo != null || !supplierInfo.equals("")){
                List<SupplierJointPunishInfo> list = punishInfoMapper.selectByExternal(supplierInfo);
                String json= JSONObject.toJSONString(list);
                String resultStr="{" +
                        "\"count\":\""+list.size()+"\"," +//当前返回条数
                        "\"currentPage\":\""+supplierInfo.getCurrentPage()+"\"," +//当前页
                        "\"totalPage\":\""+supplierInfo.getTotalPage()+"\"," +//总页数
                        "\"totalCount\":\""+supplierInfo.getTotalCount()+"\"," +//总条数
                        "\"currentCount\":\""+supplierInfo.getCurrentCount()+"\"," +//每页显示条数
                        "\"dataList\":"+json+
                        "}";
                    ar.setCode(ResultCodes.SUCCESSS.getCode());
                    ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                    ar.setData(resultStr);
            }
        }catch (Exception e){
            logger.error("外部黑名单查询失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    /**
     * 查询未入围供应商
     * @param subjectName
     * @return
     */
    @Override
    public ApiResult selectByNotList(String subjectName) {
        ApiResult ar = new ApiResult();
        try {
            if (subjectName != null) {
                List<SupplierJointPunishInfo> infos = punishInfoMapper.selectByNotList(subjectName);
                ar.setCode(ResultCodes.SUCCESSS.getCode());
                ar.setMsg(ResultCodes.SUCCESSS.getMessage());
                ar.setData(infos);
            }
        } catch (Exception e) {
            logger.error("查询未入围供应商失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    /**
     * 更新外部黑名单
     * @param punishInfo
     * @return
     */
    @Override
    public ApiResult updateByPrimaryKeySelective(SupplierJointPunishInfo punishInfo) {
        punishInfo.setInternalBlacklist("1");
        ApiResult ar = new ApiResult();
        SupplierInternalBlacklist blacklist = new SupplierInternalBlacklist();
        blacklist.setReason(punishInfo.getReason());
        blacklist.setAddName(punishInfo.getAddName());
        try {
            if (punishInfo != null || !punishInfo.equals("")) {
                int update = punishInfoMapper.updateByPrimaryKeySelective(punishInfo);//更改0 外部黑名单1是内部黑名单
                if (update > 0) {
                    String jointPunishUuid = punishInfo.getJointPunishUuid();
                    SupplierJointPunishInfo byPunishInfo = punishInfoMapper.selectByPunishInfo(jointPunishUuid);//根据uuid查询企业内部黑名单
                    blacklist.setCompanyId(byPunishInfo.getCompanyId());
                    blacklist.setUuid(byPunishInfo.getJointPunishUuid());
                    blacklist.setSupplierId(byPunishInfo.getSupplierId());
                    blacklist.setSupplierName(byPunishInfo.getSubjectName());
                    int insertExternal = punishInfoMapper.insertExternal(blacklist);//增加内部黑名单
                }
            }
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());

        } catch (Exception e) {
            logger.error("更新外部黑名单失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }
}
