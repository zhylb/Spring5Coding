package com.lihd.spring.junit;

import com.lihd.spring.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jndi.support.SimpleJndiBeanFactory;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/10 23:31
 */
public class BeanTest {

    @Test
    public void testCreateUser(){
        //1 创建 ApplicationContext对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        BeanFactory context = new ClassPathXmlApplicationContext();


        System.out.println("JavaEE启动");

        //2 获取对象
        User user = context.getBean("user", User.class);
        //3 使用对象
        System.out.println(user);
        user.show();
    }



}
