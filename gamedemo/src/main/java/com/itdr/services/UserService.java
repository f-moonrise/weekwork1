package com.itdr.services;

import com.itdr.pojo.User;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/15 9:49
 */
public interface UserService {
    User login(String username, String password);

    int register(String username, String password);
//
//    int delete(String username, String password);
}
