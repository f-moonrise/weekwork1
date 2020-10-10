package com.itdr.dao.impl;

import com.itdr.dao.UserfDao;
import com.itdr.pojo.Users;
import com.itdr.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/12 12:06
 */
public class UserfDaoImpl implements UserfDao {
//    @Override
//    public List<Users> getAll() {
//        SqlSessionFactoryBuilder sf = new SqlSessionFactoryBuilder();
//        InputStream in = null;
//        try {
//            in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory build = sf.build(in);
//        SqlSession sqlSession = build.openSession();
//        Users u = sqlSession.selectOne("getOne",id);
//        return u;
//    }

    @Override
    public List<Users> getAll() {
        return null;
    }

    @Override
    public Users getOne(Integer uid) {
//        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
//        Users u = sqlSession.selectOne("getOne",uid);
//        return u;
        SqlSessionFactoryBuilder sf = new SqlSessionFactoryBuilder();
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = sf.build(in);
        SqlSession sqlSession = build.openSession();
        Users u = sqlSession.selectOne("getOne",uid);
        return u;
    }

    @Override
    public int addOne(Users u) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        int i = sqlSession.insert("addOne",u);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }

    @Override
    public int updateOne(Users u) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        int i = sqlSession.update("updateOne",u);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }

    @Override
    public int deleteOne(Users u) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        int i = sqlSession.delete("deleteOne",u);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
}
