package com.itdr.controller;


import com.itdr.pojo.User;
import com.itdr.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/14 23:34
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;

//    登录
    @RequestMapping("login.do")
    public ModelAndView login(String username, String password, HttpSession session){
        ModelAndView m = new ModelAndView();
        User u = userService.login(username,password);
//        存储用户信息
        session.setAttribute("user",u);
//        用户为空，登录失败，挑战到错误页面
        if(u == null){
            m.setViewName("error");
        }else {
//        用户不为空，登录成功，跳转到首页
          m.setViewName("home");
        }
        return m;
    }


//    注册
    @RequestMapping("register.do")
    public ModelAndView register( String username, String password){
        ModelAndView m = new ModelAndView();
//        System.out.println(username+password);
        int u = userService.register(username,password);
        System.out.println(u);
//        存储用户信息

//        用户为空，注册失败，挑战到错误页面
        if(u == 1){
            m.setViewName("home");
        }else {
//        用户不为空，注册成功，跳转到首页
            m.setViewName("register");
        }
        return m;
    }
//
//    //    注销
//    @RequestMapping("delete.do")
//    public ModelAndView destory( String username, String password){
//        ModelAndView m = new ModelAndView();
////        System.out.println(username+password);
//        int u = userService.delete(username,password);
////        int u=0;
//        System.out.println(u);
////        存储用户信息
//
////        用户不为空，注册成功，跳转到首页
//        if(u == 1){
//            m.setViewName("delete");
//        }else {
////        用户为空，注册失败，挑战到错误页面
//            m.setViewName("delete");
//        }
//        return m;
//    }
}
