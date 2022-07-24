package com.lihd.spring.b_scope;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 20:14
 */
public class ScopeTest {

    @Test
    public void test01(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("b_scope.xml");


        System.out.println("javaEE启动");


        User user1 = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);

        System.out.println(user1 == user2);//true


    }
}
