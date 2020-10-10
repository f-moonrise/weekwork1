import controller.IndexController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Users;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/7 15:42
 */
public class TestDemo {
    @Test
    public void test(){
        IndexController in = new IndexController();
        String zz = in.zz("zhang","zhang1",10);
        System.out.println(zz);
    }

    @Test
    public void test2(){
        IndexController in = new IndexController();
        in.zz2("zhang","zhang1",10);
    }

    @Test
    public void test3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Users u = (Users) ac.getBean("users");
        System.out.println(u);

        u.setAge(20);

        Users u2 = (Users) ac.getBean("users");
        System.out.println(u2);
    }

    @Test
    public void test4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        IndexController in = ac.getBean(IndexController.class);
        in.zz2("zhang","zhang1",10);
    }
}
