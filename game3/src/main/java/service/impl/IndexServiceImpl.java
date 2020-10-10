package service.impl;

import dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import service.IndexService;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/7 12:52
 */
@Service
@Transactional
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexDao indexDao ;
    @Autowired
    private TransactionTemplate tt;

//    public IndexDao getIndexDao() {
//        return indexDao;
//    }
//
//    public void setIndexDao(IndexDao indexDao) {
//        this.indexDao = indexDao;
//    }
//
//    public TransactionTemplate getTt() {
//        return tt;
//    }
//
//    public void setTt(TransactionTemplate tt) {
//        this.tt = tt;
//    }

    @Override
    public String tm(String aname, String bname, int money) {
        //参数非空判断，金额不能为负数和0

        //判断B账号是否存在

        //从A账户扣钱
        int i = indexDao.updateByName(aname,money);

//        int m = 1/0;

        //从B账户加钱
        int i2 = indexDao.updateByName2(bname,money);

        if(i<0 || i2<0){
            return "转账失败";
        }
        return "转账成功！";
    }

    @Override
    public void tm2(String aname, String bname, int money) {

        tt.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                //从A账户扣钱
                int i = indexDao.updateByName(aname,money);

//                int m = 1/0;

                //从B账户加钱
                int i2 = indexDao.updateByName2(bname,money);
            }
        });


    }
}
