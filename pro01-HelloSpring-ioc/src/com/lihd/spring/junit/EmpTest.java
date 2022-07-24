package com.lihd.spring.junit;

import com.lihd.spring.emp.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 17:05
 */
public class EmpTest {
    @Test
    public void test01(){

        ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);


    }
}
