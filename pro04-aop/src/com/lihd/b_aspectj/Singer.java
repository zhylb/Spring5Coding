package com.lihd.b_aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 20:15
 */

@Component
public class Singer {

    public void sing(){
//        System.out.println(1/0);
        System.out.println("我想要怒放的光芒！");
    }
}
