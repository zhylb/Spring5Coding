package com.lihd.spring.junit;

import com.lihd.spring.collection.Coll;
import com.lihd.spring.collection.PerPet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 17:59
 */
public class CollTest {

    /**
     * Test01 :
     */
    @Test
    public void test01 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("coll.xml");

        Coll coll = context.getBean("coll", Coll.class);

        System.out.println(coll);

    }

    /**
     * Test02 :
     */
    @Test
    public void test02 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("coll2.xml");
        PerPet perPet = context.getBean("perPet", PerPet.class);
        System.out.println(perPet);

    }


}
