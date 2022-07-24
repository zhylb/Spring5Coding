package com.lihd.c_xml;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 21:30
 */
public class UserDAOTest {

    /**
     * Test01 :
     *
     *
     *
     */
    @Test
    public void test01 (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop_xml.xml");
        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);
        userDAO.login();
    }
}
