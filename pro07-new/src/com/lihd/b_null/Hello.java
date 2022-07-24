package com.lihd.b_null;

import org.springframework.lang.Nullable;

import java.util.Locale;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/13 22:48
 */
public class Hello {
    /* @Nullable @NotNull
    * 以上两个注解在程序运行的过程中不会起任何作用，只会在IDE、编译器、FindBugs检查、生成文档的时候有做提示；
     */

    @Nullable
    private String str;
    @Nullable
    private String show (@Nullable String s){
        String s1 = s;
        return  s1;
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        h.show(null);
    }



}
