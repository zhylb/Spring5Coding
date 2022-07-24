package com.lihd.b_null;

import com.lihd.pojo.User;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/13 22:54
 */
public class GenericTest {

    @Test
    public void test01(){
        GenericApplicationContext context = new GenericApplicationContext();

        context.refresh();
        context.registerBean(User.class,User::new);

        User bean = context.getBean("com.lihd.pojo.User", User.class);
        System.out.println(bean);
    }

    @Test
    public void test02(){
        //方式二 稍微好一点
        GenericApplicationContext context = new GenericApplicationContext();

        context.refresh();
        context.registerBean("user",User.class,User::new);

        User bean = context.getBean("user", User.class);
        System.out.println(bean);
    }
}

