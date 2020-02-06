package Service;

import common.ResponseCode;
import dao.UserDao;
import pojo.Users;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/6 17:58
 */
public class UserServiceImpl implements UserService{
    UserDao ud = new UserDao();

//    @Override
//    public int register(String username, String password) {
//        int i = 0;
//        //用户名以及密码是否为空
//        if(username == null || username.equals("")){
//            return i;
//        }
//        if(password == null || password.equals("")){
//            return i;
//        }
//
//        //用户是否存在
//        Users user = ud.selectUser(username);
//        if(user == null){
//            i = ud.insertUser(username,password);
//        }
//        return i;
//    }

//    @Override
//    public int login(String username, String password) {
//        int i = 0;
//        //用户名以及密码是否为空
//        if(username == null || username.equals("")){
//            return i;
//        }
//        if(password == null || password.equals("")){
//            return i;
//        }
//
//        //用户是否存在
//        Users user = ud.selectUser(username);
//        if(user != null){
//            i = ud.selectUser(username,password);
//            return i;
//        }
//        return i;
//    }

    @Override
    public ResponseCode<Users> login(String username, String password) {
        Users users = null;
        int i = 0;
        //非空判断
        if(username == null || username.equals("")){
            return ResponseCode.toDefeated("用户名为空");
        }
        if(password == null || password.equals("")){
            return ResponseCode.toDefeated("用户名为空");
        }

        users = ud.selectUser(username);
        if(users == null){
            return ResponseCode.toDefeated("用户不存在");
        }
        if(users != null){
            i = ud.selectUser(username,password);
        }
        //成功返回成功数据
        if(i!=0){
            return ResponseCode.toSuccess(users);
        }else {
            return ResponseCode.toDefeated("密码出错");
        }
    }

    @Override
    public ResponseCode<Users> register(String username, String password) {
        int i = 0;
        //用户名以及密码是否为空
        if(username == null || username.equals("")){
            return ResponseCode.toDefeated("用户名为空");
        }
        if(password == null || password.equals("")){
            return ResponseCode.toDefeated("用户名为空");
        }

        //用户是否存在
        Users user = ud.selectUser(username);
        if(user == null){
            i = ud.insertUser(username,password);
        }
        if(i!=0){
            return ResponseCode.toSuccess(username,password);
        }else {
            return ResponseCode.toDefeated("注册失败");
        }

    }
}


