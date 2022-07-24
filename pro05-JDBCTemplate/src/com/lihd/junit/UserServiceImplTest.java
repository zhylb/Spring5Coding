package com.lihd.junit;

import com.lihd.pojo.User;
import com.lihd.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    private ClassPathXmlApplicationContext context;
    private UserService userService;

    {
        context = new ClassPathXmlApplicationContext("jdbc.xml");
        userService = context.getBean("userServiceImpl", UserService.class);
    }


    @Test
    public void addUser() {

    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUname("hello");
        user.setPwd("123");
        int i = userService.insertUser(user);
        System.out.println(i);
    }

    @Test
    public void updateUser() {

        User user = new User("吕布", "方天滑稽");
        user.setId(1);

        userService.updateUser(user);


    }

    @Test
    public void deleteById() {
        userService.deleteById(2);
    }

    @Test
    public void getUserById() {
        User userById = userService.getUserById(1);
        System.out.println(userById);
    }

    @Test
    public void getAllUser() {
        for (User user : userService.getAllUser()) {
            System.out.println(user);
        }

    }

    @Test
    public void getCount() {
        long count = userService.getCount();
        System.out.println(count);
    }

    @Test
    public void insertBatch() {

        Object[] objects1 = {"java","1"};
        Object[] objects2 = {"python","2"};
        Object[] objects3 = {"kotlin","3"};

        List<Object[]> objects = Arrays.asList(objects1, objects2, objects3);

        userService.insertBatch(objects);


    }

    @Test
    public void updateBatch() {
        Object[] objects1 = {"JAVA","1000",7};
        Object[] objects2 = {"PYTHON","2",8};
        Object[] objects3 = {"KOTLIN","300",9};

        List<Object[]> objects = Arrays.asList(objects1, objects2, objects3);

        userService.updateBatch(objects);
    }

    @Test
    public void deleteBatch() {

        Object[] objects1 = {10};
        Object[] objects2 = {11};
        Object[] objects3 = {12};

        List<Object[]> objects = Arrays.asList(objects1, objects2, objects3);

        userService.deleteBatch(objects);

    }
}