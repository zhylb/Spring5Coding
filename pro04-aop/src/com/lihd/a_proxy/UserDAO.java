package com.lihd.a_proxy;

public interface UserDAO {

    boolean login(String uname,String pwd);


    boolean preRegister(String uname);

}
