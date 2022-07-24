package com.lihd.spring.junit;

import com.lihd.spring.bean.DemoBean1;
import com.lihd.spring.bean.DemoBean2;
import com.lihd.spring.bean.DemoBean3;
import com.lihd.spring.bean.DemoBean4;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 15:31
 */
public class DemoBeanTest {

    @Test
    public void testDemoBean1(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");


        DemoBean1 demoBean1 = context.getBean("demoBean1", DemoBean1.class);


        System.out.println(demoBean1.toString());//DemoBean1{name='优雅的大宝', age=36}


    }

    @Test
    public void testDemoBean2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        DemoBean2 demoBean2 = context.getBean("demoBean2", DemoBean2.class);

        System.out.println(demoBean2);//DemoBean2{name='不安的人', age=18}

    }

    @Test
    public void testDemoBean3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        DemoBean3 demoBean3 = context.getBean("demoBean3", DemoBean3.class);

        System.out.println(demoBean3);

    }

    @Test
    public void testDemoBean4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        DemoBean4 demoBean4 = context.getBean("demoBean4", DemoBean4.class);

        System.out.println(demoBean4);

    }

}
