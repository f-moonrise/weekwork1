import com.itdr.dao.UserDao;
import com.itdr.dao.UserMapper;
import com.itdr.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/11 22:40
 */
public class DemoTest {

    @Test
    public void test1(){
        Calendar c = Calendar.getInstance();
        Date d = new Date();
        c.setTime(d);
        int i = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(i);

    }

    @Test
    public void test2() throws IOException {
        String path = "SqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(path);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sf.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Users one = mapper.selectByUserNameAndPassWord("zhang","123456");
        System.out.println(one);

        sqlSession.close();
    }
}
