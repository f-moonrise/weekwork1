package com.itdr.mappers;

import com.itdr.pojo.ItdrCategory;

public interface ItdrCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItdrCategory record);

    int insertSelective(ItdrCategory record);

    ItdrCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItdrCategory record);

    int updateByPrimaryKey(ItdrCategory record);
}