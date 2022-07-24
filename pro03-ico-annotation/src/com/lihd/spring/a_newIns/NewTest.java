package com.lihd.spring.a_newIns;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 22:37
 */
public class NewTest {

    /**
     * Test01 :
     */
    @Test
    public void test01 (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anno.xml");

        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);


    }

}
