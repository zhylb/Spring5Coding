package com.lihd.spring.d_autowire;

import java.util.List;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 21:23
 */
public class Person {

    private String name;

    private List<Son> sons;

    public void setName(String name) {
        this.name = name;
    }

    public void setSons(List<Son> sons) {
        this.sons = sons;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sons=" + sons +
                '}';
    }
}
