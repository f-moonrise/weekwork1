package com.itdr.dao;

import com.itdr.pojo.Users;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/12 12:00
 */
public interface UserfDao {
//    查询所有用户
    List<Users> getAll();

//    查询一个用户
    Users getOne(Integer id);

//    增加一个用户
    int addOne(Users u);

//    修改一个用户
    int updateOne(Users u);

//    删除一个用户
    int deleteOne(Users u);
}
