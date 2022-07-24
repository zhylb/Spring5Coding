package com.lihd.spring.c_life;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 21:01
 */
public class Life {

    private String name;

    public Life() {
        System.out.println("1::对象被创建");
    }


    public void setName(String name) {
        this.name = name;
        System.out.println("2::name被赋值");
    }

    public void initMethod(){
        System.out.println("3::执行init()方法");
    }


    public void destroyMethod(){
        System.out.println("5::执行destroy方法");
    }



}
