package com.lihd.spring.dao.impl;

import com.lihd.spring.dao.BookDAO;
import org.springframework.stereotype.Repository;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 23:24
 */
@Repository("green")
public class GreenBookDAOImpl implements BookDAO {
    @Override
    public void add() {
        System.out.println("GreenBookDAOImpl.add");
    }
}
