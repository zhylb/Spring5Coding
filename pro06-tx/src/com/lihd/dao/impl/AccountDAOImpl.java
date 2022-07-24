package com.lihd.dao.impl;

import com.lihd.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/13 8:44
 */
@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updateBalanceById(Integer id, Integer num) {
        String sql = "update t_account set balance = balance + ? where id = ?";
        jdbcTemplate.update(sql,num,id);
    }

}
