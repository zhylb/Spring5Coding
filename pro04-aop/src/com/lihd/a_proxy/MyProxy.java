package com.lihd.a_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 15:00
 */
public class MyProxy implements InvocationHandler {

    private Object obj;
    private Object otherObj;

    public MyProxy(Object obj) {
        this.obj = obj;
    }

    public MyProxy(Object obj, Object otherObj) {
        this.obj = obj;
        this.otherObj = otherObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String name = method.getName();
        String preName = "pre"+name;
        String aftName = "aft"+name;

        Object ret = null;

        for (Method declaredMethod : otherObj.getClass().getDeclaredMethods()) {

            if(declaredMethod.getName().equalsIgnoreCase(preName)){



            }

            if(declaredMethod.getName().equalsIgnoreCase(aftName)){

                ret = method.invoke(obj, args);

                if(ret != null){
                    ret = declaredMethod.invoke(otherObj, ret);
                }

                break;
            }
        }


        return ret;
    }
}
