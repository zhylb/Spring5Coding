package com.lihd.spring.e_context;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 22:20
 */
public class GetConn {
    /**
     * Test01 :
     */
    @Test
    public void test01 () throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("e_context.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
