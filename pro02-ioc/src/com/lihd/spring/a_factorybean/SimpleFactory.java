package com.lihd.spring.a_factorybean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 20:09
 */
public class SimpleFactory implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("hello");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
