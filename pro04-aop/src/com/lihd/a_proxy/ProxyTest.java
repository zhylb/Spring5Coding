package com.lihd.a_proxy;

import java.lang.reflect.Proxy;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 15:13
 */
public class ProxyTest {

    public static void main(String[] args) {

        UserDAO userDAO = new UserDAOImpl();

        Class<?>[] interfaces = userDAO.getClass().getInterfaces();

        MyProxy myProxy = new MyProxy(userDAO, new UserDAOImplNew());

        UserDAO dao = (UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), interfaces, myProxy);
        boolean login = dao.login("u", "p");
        System.out.println(login);
    }


}
