package dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import pojo.Users;

import java.sql.SQLException;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/6 17:56
 */
public class UserDao {
    static QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    //用户注册-增加
    public int insertUser(String username,String password){
        String sql = "insert into shi_user values (null,?,?,0,1,?)";
        int i = 0;
        try{
            i = qr.update(sql,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

    //用户登录-删除
    public int updateUser(String username,String password){
        String sql = "update shi_user set type=0 where username=? and password=?";
        int i=0;
        try{
            i = qr.update(sql,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

    //用户登录-查找
    public Users selectUser(String username){
        Users u = null;
        String sql = "SELECT * FROM shi_user WHERE name=?";
        try {
            u = qr.query(sql, new BeanHandler<Users>(Users.class),username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

    public int selectUser(String username, String password) {
        Users u1 = null;
        int i = 0;
        String sql = "SELECT * FROM shi_user WHERE name=? and pwd=?";
        try {
            u1 = qr.query(sql, new BeanHandler<Users>(Users.class),username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(u1 != null){
            i = 1;
        }
        return i;
    }
}
