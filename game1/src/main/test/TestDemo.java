import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import pojo.Users;

import java.awt.*;
import java.util.List;
import java.util.Map;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/5 10:45
 */
public class TestDemo {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Users u = (Users) ac.getBean("users");
        System.out.println(u);

        Users u1 = (Users) ac.getBean("users");
        System.out.println(u1);
    }

    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Users u = (Users) ac.getBean("users1");
        System.out.println(u);
    }

    @Test
    public void test3(){
        DriverManagerDataSource dm = new DriverManagerDataSource();
        dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dm.setUrl("jdbc:mysql://127.0.0.1:3306/fengsheng?serverTimezone=GMT%2B8");
        dm.setUsername("root");
        dm.setPassword("1332691109");

        JdbcTemplate jtl = new JdbcTemplate(dm);
        String sql = "Select * from neuedu_user";

        List<Map<String,Object>> maps = jtl.queryForList(sql);
        for(Map<String, Object> map:maps){
            for(String s:map.keySet()){
                System.out.println(map.get(s));
            }
        }
    }

    @Test
    public void test4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        JdbcTemplate jtl = ac.getBean(JdbcTemplate.class);
        String sql = "Select * from neuedu_user";

        List<Map<String,Object>> maps = jtl.queryForList(sql);
        for(Map<String, Object> map:maps){
            for(String s:map.keySet()){
                System.out.println(map.get(s));
            }
        }
    }


}
