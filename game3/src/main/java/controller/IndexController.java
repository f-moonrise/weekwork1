package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import service.IndexService;
import service.impl.IndexServiceImpl;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/7 12:48
 */
@Controller
public class IndexController {
//    private static ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//    private IndexService indexService = ac.getBean(IndexService.class);

    @Autowired
    private IndexService indexService;
    //转账
    public String zz(String aname,String bname,int money){
        String s = indexService.tm(aname,bname,money);
        return s;
    }

    public void zz2(String aname,String bname,int money){
        indexService.tm2(aname,bname,money);
    }
}
