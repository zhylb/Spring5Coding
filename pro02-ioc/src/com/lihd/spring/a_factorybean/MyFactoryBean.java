package com.lihd.spring.a_factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 20:02
 */
public class MyFactoryBean<T> implements FactoryBean<T> {
    private Class beanClass;
    {
        Type type = this.getClass().getGenericSuperclass();
        ParameterizedType parType = (ParameterizedType) type;
        Type[] actualTypeArguments = parType.getActualTypeArguments();
        beanClass = (Class<T>) actualTypeArguments[0];
    }

    @Override
    public T getObject() throws Exception {
        return (T) beanClass.newInstance();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
