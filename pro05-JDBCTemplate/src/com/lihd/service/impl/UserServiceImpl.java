package com.lihd.service.impl;

import com.lihd.dao.UserDAO;
import com.lihd.pojo.User;
import com.lihd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 22:15
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;


    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteById(Integer id) {
        userDAO.deleteById(id);
    }

    @Override
    public User getUserById(Integer id) {
        return userDAO.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public long getCount() {
        return userDAO.getCount();
    }

    @Override
    public int[] insertBatch(List<Object[]> args) {
        return userDAO.insertBatch(args);
    }

    @Override
    public int[] updateBatch(List<Object[]> args) {
        return userDAO.updateBatch(args);
    }

    @Override
    public int[] deleteBatch(List<Object[]> args) {
        return userDAO.deleteBatch(args);
    }
}
