package com.zhongwang.data.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.SupplierInternalBlacklistMapper;
import com.zhongwang.data.entity.Risk.PageBean;
import com.zhongwang.data.entity.SupplierInternalBlacklist;
import com.zhongwang.data.service.SupplierInternalBlacklistServie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierInternalBlacklistServieImpl implements SupplierInternalBlacklistServie {
    private Logger logger = LoggerFactory.getLogger(SupplierInternalBlacklistServieImpl.class);

    @Autowired
    SupplierInternalBlacklistMapper blacklistMapper;

    /**
     * 内部黑名单查询
     * @return
     */
    @Override
    public ApiResult selectBySupplierName(PageBean page) {
        ApiResult ar = new ApiResult();
        try {
            if(page != null || !page.equals("")){
            List<SupplierInternalBlacklist> list = blacklistMapper.selectBySupplierName(page);
                for(int i=0;list.size()>i;i++){

                }
                String json= JSONObject.toJSONString(list);
                String resultStr="{" +
                        "\"count\":\""+list.size()+"\"," +//当前返回条数
                        "\"currentPage\":\""+page.getCurrentPage()+"\"," +//当前页
                        "\"totalPage\":\""+page.getTotalPage()+"\"," +//总页数
                        "\"totalCount\":\""+page.getTotalCount()+"\"," +//总条数
                        "\"currentCount\":\""+page.getCurrentCount()+"\"," +//每页显示条数
                        "\"dataList\":"+json+
                        "}";
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            ar.setData(resultStr);
            }
        }catch (Exception e){
            logger.error("内部黑名单查询失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }

    /**
     * 移除黑名单
     * @param uuid
     * @return
     */
    @Override
    public ApiResult deleteExternal(String uuid) {
        ApiResult ar = new ApiResult();
        try {
            int external = blacklistMapper.deleteExternal(uuid);
            ar.setCode(ResultCodes.SUCCESSS.getCode());
            ar.setMsg(ResultCodes.SUCCESSS.getMessage());
            ar.setData(external);
        } catch (Exception e) {
            logger.error("移除黑名单失败");
            ar.setMsg(ResultCodes.ERROR.getMessage());
            return ar;
        }
        return ar;
    }
}
