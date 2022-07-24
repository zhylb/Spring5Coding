package com.lihd.service;

import com.lihd.pojo.User;

import java.util.List;

public interface UserService {


    void addUser(User user);

    int insertUser(User user);

    void updateUser(User user);

    void deleteById(Integer id);

    User getUserById(Integer id);


    List<User> getAllUser();

    long getCount();

    int[] insertBatch(List<Object[]> args);
    int[] updateBatch(List<Object[]> args);
    int[] deleteBatch(List<Object[]> args);
}
