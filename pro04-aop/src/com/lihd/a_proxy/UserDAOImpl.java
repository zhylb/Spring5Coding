package com.lihd.a_proxy;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 14:57
 */
public class UserDAOImpl implements UserDAO{
    @Override
    public boolean login(String uname, String pwd) {

        if(uname == null || pwd == null) return false;

        return uname.startsWith("u") && pwd.startsWith("p");

    }

    @Override
    public boolean preRegister(String uname) {

        if(uname != null) return false;
        return uname.startsWith("u");

    }
}
