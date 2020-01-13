package com.zhongwang.data.dao;

import com.zhongwang.data.entity.DealerGoodsExponentInfo;
import com.zhongwang.data.entity.DealerGoodsExponentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealerGoodsExponentInfoMapper {
    int countByExample(DealerGoodsExponentInfoExample example);

    int deleteByExample(DealerGoodsExponentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DealerGoodsExponentInfo record);

    int insertSelective(DealerGoodsExponentInfo record);

    List<DealerGoodsExponentInfo> selectByExample(DealerGoodsExponentInfoExample example);

    DealerGoodsExponentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DealerGoodsExponentInfo record, @Param("example") DealerGoodsExponentInfoExample example);

    int updateByExample(@Param("record") DealerGoodsExponentInfo record, @Param("example") DealerGoodsExponentInfoExample example);

    int updateByPrimaryKeySelective(DealerGoodsExponentInfo record);

    int updateByPrimaryKey(DealerGoodsExponentInfo record);
}