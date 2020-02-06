package Service;


import common.ResponseCode;
import pojo.Users;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/6 15:00
 */
public interface UserService {
    //注册
    ResponseCode<Users> register(String username, String password);

    //登录
    ResponseCode<Users> login(String username,String password);
}
