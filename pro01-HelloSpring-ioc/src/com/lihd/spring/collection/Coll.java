package com.lihd.spring.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 17:46
 */
public class Coll {

    private String[] arr;
    private List<String> list;

    private Map<String ,String> map;

    private Set<Person> set;

    private Map<Person,Dog> objMap;


    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<Person> set) {
        this.set = set;
    }

    public void setObjMap(Map<Person, Dog> objMap) {
        this.objMap = objMap;
    }


    @Override
    public String toString() {
        return
                "arr=" + Arrays.toString(arr) +
                "\nlist=" + list +
                "\nmap=" + map +
                "\nset=" + set +
                "\nobjMap=" + objMap;
    }
}
