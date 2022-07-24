package com.lihd.service;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/13 8:48
 */
public interface AccountService {

    void transfer(Integer from, Integer to, Integer num,boolean throwEx);

}
