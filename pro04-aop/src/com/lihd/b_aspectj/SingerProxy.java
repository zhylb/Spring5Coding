package com.lihd.b_aspectj;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 20:16
 */
@Component
@Aspect
@Order(2)
public class SingerProxy {

    @Before(value = "execution(* com.lihd.b_aspectj.Singer.sing(..))")
    public void before(){
        System.out.println("SingerProxy.before");
    }


    @AfterReturning(value = "execution(* com.lihd.b_aspectj.Singer.sing(..))")
    public void afterReturning(){
        System.out.println("SingerProxy.afterReturning");
    }


    @After(value = "execution(* com.lihd.b_aspectj.Singer.sing(..))")
    public void after(){
        System.out.println("SingerProxy.after");
    }

    @AfterThrowing(value = "execution(* com.lihd.b_aspectj.Singer.sing(..))")
    public void afterThrowing(){
        System.out.println("SingerProxy.afterThrowing");
    }

    @Around(value = "execution(* com.lihd.b_aspectj.Singer.sing(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("SingerProxy.around - before");
        proceedingJoinPoint.proceed();
        System.out.println("SingerProxy.around - after");


    }
}
