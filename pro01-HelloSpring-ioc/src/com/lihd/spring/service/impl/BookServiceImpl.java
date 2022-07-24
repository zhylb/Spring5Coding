package com.lihd.spring.service.impl;

import com.lihd.spring.dao.BookDAO;
import com.lihd.spring.service.BookService;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/11 16:30
 */
public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public void addBook() {
        bookDAO.addBook();
        System.out.println("BookServiceImpl.addBook");
    }
}
