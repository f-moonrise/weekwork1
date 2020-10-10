package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/7 13:03
 */
@Repository
public class IndexDao {

    @Autowired
    private JdbcTemplate jt;

//    public JdbcTemplate getJt() {
//        return jt;
//    }
//
//    public void setJt(JdbcTemplate jt) {
//        this.jt = jt;
//    }

    public int updateByName(String name, int money){
        String sql = "update itdruser set score = score-? where username = ?";
        int update = jt.update(sql,money,name);
        return 0;
    }

    public int updateByName2(String name,int money){
        String sql = "update itdruser set score = score+? where username = ?";
        int update = jt.update(sql,money,name);
        return 0;
    }
}
