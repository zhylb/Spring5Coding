package com.lihd.spring.d_autowire;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 17:00
 */
public class Emp {

    private String name;
    private String hobby;

    private Dept dept;

//    public Dept getDept() {
//        return dept;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }


    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", dept=" + dept +
                '}';
    }
}
