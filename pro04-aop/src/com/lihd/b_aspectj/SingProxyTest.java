package com.lihd.b_aspectj;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 20:20
 */
public class SingProxyTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Singer singer = context.getBean("singer", Singer.class);
        singer.sing();
    }


    /**
     * Test02 :
     */
    @Test
    public void test02 (){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Singer singer = context.getBean("singer", Singer.class);
        singer.sing();

    }


}
