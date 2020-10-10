package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/13 20:39
 */
@Controller
public class CeShi {
    @RequestMapping("/ceshi.do")
    public String ceshi(){
        System.out.println("请求进来了");
        return "chat";
    }
}
