package com.itdr.mappers;

import com.itdr.pojo.ItdrTab;

public interface ItdrTabMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItdrTab record);

    int insertSelective(ItdrTab record);

    ItdrTab selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItdrTab record);

    int updateByPrimaryKey(ItdrTab record);
}