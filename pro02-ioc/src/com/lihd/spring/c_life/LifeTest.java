package com.lihd.spring.c_life;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 21:05
 */
public class LifeTest {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c_life.xml");

        Life life = context.getBean("life", Life.class);
        System.out.println("life在测试方法被创建出来");
        System.out.println(life);


        context.close();//这是关闭所有吗 应该是

    }
}
