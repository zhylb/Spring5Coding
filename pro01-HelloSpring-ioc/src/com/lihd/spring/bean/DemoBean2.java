package com.lihd.spring.bean;

/**
 *
 * 使用读取配置文件的
 *
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 15:23
 */
public class DemoBean2 {

    private String name;
    private Integer age;

    public DemoBean2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String
    toString() {
        return "DemoBean2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
