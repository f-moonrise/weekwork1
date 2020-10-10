package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/10 12:41
 */
@Controller
public class UserController {

//    @RequestMapping("/user/show.do")
//    public void show(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("请求进来了");
//        request.getRequestDispatcher("/home.jsp").forward(request,response);
//    }

    @RequestMapping("/user/show.do")
    public ModelAndView show() {
        System.out.println("请求进来了");
        ModelAndView m = new ModelAndView();
        m.setViewName("home");
        m.addObject("name","zx");
        return m;
    }

//    @RequestMapping("/user/hh.do")
//    public ModelAndView hh(){
//        ModelAndView m = new ModelAndView();
//        m.setViewName("list");
//        return m;
//    }

    @RequestMapping("/user/hh.do")
    public String hh(){
        return "list";
    }
}
