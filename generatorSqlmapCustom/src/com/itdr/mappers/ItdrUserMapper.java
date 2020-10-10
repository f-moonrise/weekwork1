package com.itdr.mappers;

import com.itdr.pojo.ItdrUser;

public interface ItdrUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItdrUser record);

    int insertSelective(ItdrUser record);

    ItdrUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItdrUser record);

    int updateByPrimaryKey(ItdrUser record);
}