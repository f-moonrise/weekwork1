package com.itdr.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/12 12:11
 */
public class SqlSessionFactoryUtils {
    /**
     * 单例SqlSessionFactory
     */
    private static SqlSessionFactory sqlSessionFactory;

    static {
//        创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
        try{
//            查找配置文件，创建SqlSessionFactory对象
            InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//            加载配置文件，创建SqlSessionFactory对象
            sqlSessionFactory = sfb.build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

//    获取单例SqlSessionFactory
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }

}
