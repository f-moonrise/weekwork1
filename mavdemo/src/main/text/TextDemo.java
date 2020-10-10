import com.itdr.dao.UserDao;
import com.itdr.dao.UserfDao;
import com.itdr.dao.impl.UserfDaoImpl;
import com.itdr.pojo.Users;
import com.itdr.service.NameService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;


public class TextDemo {

    @Test
    public void text1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        JdbcTemplate jdbcTemplate = (JdbcTemplate) ac.getBean("jdbcTemplate");

        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        for (Map<String, Object> map : maps) {
            for (String s : map.keySet()){
                System.out.println(map.get(s));
            }
        }



        int update = jdbcTemplate.update("update user set password='111' where username='chen'");
        System.out.println(update);

        int update1 = jdbcTemplate.update("insert into user values (null ,'qq','123')");
        System.out.println(update1);
    }

//    @Test
//    public void text2(){
//
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//
//        BankController bc = ac.getBean(BankController.class);
//
//        String zz = bc.zz("cch", "qq", 10);
//        System.out.println(zz);
//
//    }

//    @Test
//    public void text3(){
//
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//
//        BankController bc = ac.getBean(BankController.class);
//
//        bc.zz2("cch", "qq", 10);
//
//    }

    @Test
    public void text4(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        NameService ns = ac.getBean(NameService.class);

        String a  = ns.game("狗", "12月", "魔羯座");

        System.out.println(a);
    }

//查
    @Test
    public void test5(){
        UserfDao userfDao = new UserfDaoImpl();

        Users one = userfDao.getOne(1);

        System.out.println(one);

    }

//    增
    @Test
    public void test6(){
        UserfDao userfDao = new UserfDaoImpl();
        Users u = new Users();
        u.setId(10);
        u.setUsername("iop");
        u.setPassword("123456");

        int two = userfDao.addOne(u);

        System.out.println(two);
    }

//    改
    @Test
    public void test7(){
        UserfDao userfDao = new UserfDaoImpl();
        Users u = new Users();
        u.setUsername("iop");
        u.setPassword("123456");

        int two = userfDao.updateOne(u);

        System.out.println(two);
    }

//    删
    public void test8(){
        UserfDao userfDao = new UserfDaoImpl();
        Users u = new Users();
        u.setUsername("iop");
        u.setPassword("123456");

        int two = userfDao.updateOne(u);

        System.out.println(two);
    }

    @Test
    public void test9() throws IOException {
        String path = "SqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(path);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sf.openSession();

        UserfDao mapper = sqlSession.getMapper(UserfDao.class);
        Users one = mapper.getOne(1);
        System.out.println(one);

        sqlSession.close();
    }
}
