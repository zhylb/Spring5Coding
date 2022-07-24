package com.lihd.a_proxy;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 15:15
 */
public class UserDAOImplNew implements UserDAO{
    @Override
    public boolean login(String uname, String pwd) {
        return false;
    }

    public boolean aftLogin(boolean re){

        System.out.println("UserDAOImplNew.aftLogin");



        return re;
    }

    @Override
    public boolean preRegister(String uname) {
        return false;
    }
}
