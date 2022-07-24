package com.lihd.service.impl;

import com.lihd.dao.AccountDAO;
import com.lihd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/13 8:49
 */
@Service
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public void transfer(Integer from, Integer to, Integer num,boolean throwEx) {
        if(num > 0){
            accountDAO.updateBalanceById(from,-num);

            if(throwEx)
                throw new RuntimeException("网络错误");

            accountDAO.updateBalanceById(to,num);
        }
    }


    public void transfer1(Integer from, Integer to, Integer num, boolean throwEx) {
        //在上面的基础上进行迭代 ： 编程式事务管理 实际开发不常用 重复代码太多 这里不写代码 描述一下思路
        try{
            //开启事务

            if(num > 0){
                accountDAO.updateBalanceById(from,-num);

                if(throwEx)
                    throw new RuntimeException("网络错误");

                accountDAO.updateBalanceById(to,num);
            }

            //如果没有发生异常 提交事务
        }catch (Exception e){
            //发生异常 回滚事务
        }

    }


    public void transfer2(Integer from, Integer to, Integer num, boolean throwEx) {
        if(num > 0){
            accountDAO.updateBalanceById(from,-num);
            if(throwEx)
                throw new RuntimeException("网络错误");
            accountDAO.updateBalanceById(to,num);
        }
    }


}
