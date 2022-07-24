package com.lihd.spring.collection;

import java.util.List;
import java.util.Set;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 18:04
 */
public class PerPet {

    private Set<String> set;
    private List<Dog> list;

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setList(List<Dog> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PerPet{\n" +
                "set=" + set +
                "\nlist=" + list +
                '}';
    }
}
