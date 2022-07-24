package com.lihd.junit;

import com.lihd.pojo.User;
import com.lihd.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 22:22
 */
public class UserTest {
    private ClassPathXmlApplicationContext context;
    private UserService userService;

    {
        context = new ClassPathXmlApplicationContext("jdbc.xml");
        userService = context.getBean("userServiceImpl", UserService.class);
    }

    /**
     * Test01 : 添加一条数据
     */
    @Test
    public void test01 (){

        User user = new User();
        user.setUname("what doesn't kill you make you stronger");
        user.setPwd("going");
        userService.addUser(user);

    }
}
