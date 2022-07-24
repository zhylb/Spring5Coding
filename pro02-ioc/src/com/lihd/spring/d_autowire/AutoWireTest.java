package com.lihd.spring.d_autowire;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 21:19
 */
public class AutoWireTest {

    /**
     * Test01 :
     */
    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("d_autowire.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);

    }

    /**
     * Test02 :
     */
    @Test
    public void test02 (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("d_autowire.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

}
