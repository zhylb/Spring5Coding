package com.lihd.spring.a_factorybean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 19:57
 */
public class PackTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("a_factorybean.xml");

        User user = context.getBean("userFactory", User.class);

        System.out.println(user);

    }


    @Test
    public void test02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("a_factorybean.xml");

        User user = context.getBean("simpleFactory", User.class);

        System.out.println(user);

    }
}
