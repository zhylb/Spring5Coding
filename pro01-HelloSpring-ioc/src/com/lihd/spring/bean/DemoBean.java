package com.lihd.spring.bean;

/**
 * 回想一下我们如何给一个对象的属性赋值 ？
 * 1 属性声明时？ 代码块？
 * 2 构造器？ set方法？
 * 3 显然使用属性声明时和代码块是不可行的，因为创建对象的值都一样
 * 4 因此我们聚焦与set方法和构造器
 * 5 尽管还有很多其他给属性赋值的操作 这里不再讨论
 *
 *
 *
 *
 *
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 15:17
 */
public class DemoBean {
    {
        name = "never";
        age = 15;
    }

    private String name = "hello";
    private Integer age = 18;

    //上面的赋值方法 所有对象的值都相同

    //下面的构造器和set方法就可以灵活的给对象的属性赋值
    public DemoBean(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
