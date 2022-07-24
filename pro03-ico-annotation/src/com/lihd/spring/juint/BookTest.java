package com.lihd.spring.juint;

import com.lihd.spring.config.SpringConfig;
import com.lihd.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 23:28
 */
public class BookTest {
    /**
     * Test01 :
     */
    @Test
    public void test01 (){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anno.xml");
        BookService userService = context.getBean("stu", BookService.class);
        userService.add();

    }

    /**
     * Test01 :
     */
    @Test
    public void test02 (){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anno.xml");
        BookService userService = context.getBean("tea", BookService.class);
        userService.add();

    }

    /**
     * Test01 :
     */
    @Test
    public void test03 (){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService userService = context.getBean("stu", BookService.class);
        userService.add();
    }





}
