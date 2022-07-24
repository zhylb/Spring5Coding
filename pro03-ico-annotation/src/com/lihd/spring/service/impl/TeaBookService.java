package com.lihd.spring.service.impl;

import com.lihd.spring.dao.BookDAO;
import com.lihd.spring.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.annotation.Documented;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 23:24
 */
@Service("tea")
public class TeaBookService implements BookService {




//    @Resource
    @Resource(name = "green")
    private BookDAO bookDAO;

    @Override
    public void add() {
        System.out.println("TeaBookService.add");
        bookDAO.add();
    }
}
