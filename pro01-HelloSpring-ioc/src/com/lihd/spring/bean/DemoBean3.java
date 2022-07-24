package com.lihd.spring.bean;

/**
 *
 * 使用读取配置文件的
 *
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 15:23
 */
public class DemoBean3 {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoBean3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
