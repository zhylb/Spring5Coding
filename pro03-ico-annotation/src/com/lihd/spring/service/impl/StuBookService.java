package com.lihd.spring.service.impl;

import com.lihd.spring.dao.BookDAO;
import com.lihd.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 23:24
 */


@Service("stu")
public class StuBookService implements BookService {


    @Autowired
    @Qualifier("red")
    BookDAO bookDAO;


    @Override
    public void add() {
        System.out.println("StuBookService.add");
        bookDAO.add();
    }
}
