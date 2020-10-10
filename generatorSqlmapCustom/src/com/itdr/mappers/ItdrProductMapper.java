package com.itdr.mappers;

import com.itdr.pojo.ItdrProduct;

public interface ItdrProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItdrProduct record);

    int insertSelective(ItdrProduct record);

    ItdrProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItdrProduct record);

    int updateByPrimaryKey(ItdrProduct record);
}