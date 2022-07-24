package com.lihd.c_junit;

import com.lihd.pojo.User;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;



/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/13 23:07
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:new.xml")
//@SpringJUnitConfig(locations = "classpath:new.xml")
public class Junit5Test {
    @Autowired
    private User user;

    @Test
    public void test01(){
        System.out.println(user);
    }







}
