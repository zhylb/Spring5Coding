package com.lihd.spring.junit;

import com.lihd.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 16:35
 */
public class WebTest {

    @Test
    public void testWeb(){
        ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook();
    }

}
