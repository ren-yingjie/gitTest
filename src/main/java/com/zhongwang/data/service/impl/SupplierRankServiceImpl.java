package com.zhongwang.data.service.impl;

import com.zhongwang.data.common.ApiResult;
import com.zhongwang.data.common.ResultCodes;
import com.zhongwang.data.dao.SupplierRankMapper;
import com.zhongwang.data.entity.SupplierRank;
import com.zhongwang.data.service.SupplierRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierRankServiceImpl implements SupplierRankService {
    @Autowired
    private SupplierRankMapper mapper;
    @Override
    public ApiResult selectByRank() {
        ApiResult apiResult = new ApiResult();
        List<SupplierRank> supplierRanks = mapper.selectByRank();
        apiResult.setCode(ResultCodes.SUCCESSS.getCode());
        apiResult.setMsg(ResultCodes.SUCCESSS.getMessage());
        apiResult.setData(supplierRanks);
        return apiResult;
    }
}
