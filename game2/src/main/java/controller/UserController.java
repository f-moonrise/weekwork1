package controller;

import Service.UserService;
import Service.UserServiceImpl;
import com.sun.net.httpserver.HttpServer;
import common.ResponseCode;
import pojo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/6 18:03
 */
@WebServlet("/user")
public class UserController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private UserService userService = new UserServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");

        switch (split[split.length - 1]){
            case "login":
                login(request,response);
                break;
            case "register":
                register(request,response);
                break;
        }
    }

    //管理员登录
    private void login(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ResponseCode<Users> login = userService.login(username,password);

        //登录成功，保护用户信息
        HttpSession session = request.getSession();
        Users data = login.getData();
        session.setAttribute("us",data);

//        request.setAttribute("user",login);
        request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
    }

    //获取管理员信息
    private void register(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ResponseCode<Users> register = userService.register(username,password);

        //登录成功，保护用户信息
        HttpSession session = request.getSession();
        Users data = register.getData();
        session.setAttribute("us",data);

        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

//    UserService us = new UserServiceImpl();

//    //注册
//    public int register(String username,String password){
//        int fs = us.register(username,password);
//        return fs;
//    }
//
//    //登录
//    public int login(String username,String password){
//        int fs = us.login(username,password);
//        return fs;
//    }
}
