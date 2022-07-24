package com.lihd.c_xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 21:24
 */
public class UserDAOProxy {

    public void before(){
        System.out.println("before");
    }

    public void afterReturning(){
        System.out.println("afterReturning");
    }


    public void after(){
        System.out.println("after");
    }

    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around - before");
        proceedingJoinPoint.proceed();
        System.out.println("around - after");

    }

}
