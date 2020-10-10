package com.itdr.services.impl;

import com.itdr.mapper.UserMapper;
import com.itdr.pojo.User;
import com.itdr.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/15 9:49
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        if(StringUtils.isEmpty(username)){
            return null;
        }
        if(StringUtils.isEmpty(password)){
            return null;
        }

        User u = userMapper.selectByUserNameAndPassword(username,password);
        return u;
    }

    @Override
    public int register(String username, String password) {
        if(StringUtils.isEmpty(username)){
            return 0;
        }
        if(StringUtils.isEmpty(password)){
            return 0;
        }

        User user = userMapper.selectByUserNameAndPassword(username,password);
                if(user != null){
                    return 0;
                }

        int i = userMapper.insertByUserNameAndPassword(username,password);
        return i;

    }
//
//    @Override
//    public int delete(String username, String password) {
//        if(StringUtils.isEmpty(username)){
//            return 0;
//        }
//        if(StringUtils.isEmpty(password)){
//            return 0;
//        }
//
//        ItdrUser user = itdrUserMapper.selectByUserNameAndPassword(username,password);
//        if(user != null){
//            return 0;
//        }
//        int i = itdrUserMapper.delete(username,password);
//        return i;
//    }
}
