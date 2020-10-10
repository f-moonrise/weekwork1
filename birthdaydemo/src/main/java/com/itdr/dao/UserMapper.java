package com.itdr.dao;

import com.itdr.pojo.Users;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/12 22:37
 */
public interface UserMapper {
    List<Users> selectAll();
    Users selectByUserNameAndPassWord(String username,String password);
}
