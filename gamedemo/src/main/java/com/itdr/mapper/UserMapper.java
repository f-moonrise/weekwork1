package com.itdr.mapper;

import com.itdr.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUserNameAndPassword(String username, String password);

    int insertByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

}