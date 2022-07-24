package com.lihd.c_junit;


import com.lihd.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/13 22:59
 */
//无痛测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:new.xml")
public class Junit4Test {


    @Autowired
    private User user;

    @Test
    public void test01(){
        System.out.println(user);
    }


}
