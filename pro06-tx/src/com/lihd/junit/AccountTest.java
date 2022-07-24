package com.lihd.junit;

import com.lihd.config.SpringConfig;
import com.lihd.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/13 8:52
 */
public class AccountTest {

    /**
     * Test01 :
     */
    @Test
    public void test01 (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
        AccountService accountService = context.getBean("accountServiceImpl", AccountService.class);

        //目前情况下 发生异常 会导致一个人的余额变少 但是另一个人的余额没有增加
        //accountService.transfer(1,2,100,true);
        accountService.transfer(1,2,100,false);
    }


    /**
     * Test01 :
     */
    @Test
    public void test02 (){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean("accountServiceImpl", AccountService.class);

        //目前情况下 发生异常 会导致一个人的余额变少 但是另一个人的余额没有增加
        //accountService.transfer(1,2,100,true);

        accountService.transfer(1,2,100,false);
    }


    /**
     * Test01 :
     */
    @Test
    public void test03 (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tx_xml.xml");
        AccountService accountService = context.getBean("accountServiceImpl", AccountService.class);

        //目前情况下 发生异常 会导致一个人的余额变少 但是另一个人的余额没有增加
        //accountService.transfer(1,2,100,true);

        accountService.transfer(1,2,100,false);
    }
}
