package com.lihd.a_log4j2;

import com.lihd.pojo.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lang.Nullable;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/13 22:04
 */
public class HelloLog4j2 {

//    public static void main(String[] args) {
//
//
//    }

    @Test
    public void test01(){
        Logger logger = LoggerFactory.getLogger(HelloLog4j2.class);

        logger.info("hello");
        logger.warn("world");
    }

    @Test
    public void test02(){

        System.out.println(111);
    }
}
