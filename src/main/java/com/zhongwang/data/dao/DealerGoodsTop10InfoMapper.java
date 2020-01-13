package com.zhongwang.data.dao;

import com.zhongwang.data.entity.DealerGoodsTop10Info;
import com.zhongwang.data.entity.DealerGoodsTop10InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealerGoodsTop10InfoMapper {
    int countByExample(DealerGoodsTop10InfoExample example);

    int deleteByExample(DealerGoodsTop10InfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DealerGoodsTop10Info record);

    int insertSelective(DealerGoodsTop10Info record);

    List<DealerGoodsTop10Info> selectByExample(DealerGoodsTop10InfoExample example);

    DealerGoodsTop10Info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DealerGoodsTop10Info record, @Param("example") DealerGoodsTop10InfoExample example);

    int updateByExample(@Param("record") DealerGoodsTop10Info record, @Param("example") DealerGoodsTop10InfoExample example);

    int updateByPrimaryKeySelective(DealerGoodsTop10Info record);

    int updateByPrimaryKey(DealerGoodsTop10Info record);
}