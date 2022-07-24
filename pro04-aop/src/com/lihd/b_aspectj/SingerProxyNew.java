package com.lihd.b_aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 21:06
 */
@Component
@Aspect
@Order(1)
public class SingerProxyNew {

    @Pointcut(value = "execution(* com.lihd.b_aspectj.Singer.sing(..))")
    public void pointcut(){

    }

    @Before(value = "pointcut()")
    public void before(){
        System.out.println("New.before");
    }
    @After(value = "pointcut()")
    public void after(){
        System.out.println("after");
    }

    @Around(value = "pointcut()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around-before");

        point.proceed();

        System.out.println("around-after");

    }



}
