package com.lihd.dao.impl;

import com.lihd.dao.UserDAO;
import com.lihd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 22:13
 */
@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addUser(User user) {

        String sql = "insert into t_user values(0,?,?)";
        //返回更新的行数
        jdbcTemplate.update(sql,user.getUname(),user.getPwd());

    }

    @Override
    public int insertUser(User user) {

        String sql = "insert into t_user values(0,?,?)";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        PreparedStatementCreator creator = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {


                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);


                ps.setObject(1,user.getUname());
                ps.setObject(2,user.getPwd());


                return ps;
            }
        };

        jdbcTemplate.update(creator, keyHolder);

        return keyHolder.getKey().intValue();
    }

    @Override
    public void updateUser(User user) {
        String sql = "update t_user set uname = ?, pwd = ? where id = ?";

        jdbcTemplate.update(sql,user.getUname(),user.getPwd(),user.getId());
    }

    @Override
    public void deleteById(Integer id) {
        String sql = "delete from t_user where id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public User getUserById(Integer id) {
        String sql = "select * from t_user where id = ?";

        BeanPropertyRowMapper<User> mapper = new BeanPropertyRowMapper<>(User.class);


        User user = jdbcTemplate.queryForObject(sql, mapper, id);
//        User user = jdbcTemplate.query(sql, mapper, id);


        return user;
    }

    @Override
    public List<User> getAllUser() {

        String sql = "select * from t_user";

        BeanPropertyRowMapper<User> mapper = new BeanPropertyRowMapper<>(User.class);

        List<User> users = jdbcTemplate.query(sql,mapper);

//        List<User> users = jdbcTemplate.queryForList(sql, User.class); 这样是不行的 我试了 可能使用方法不对

        return users;
    }

    @Override
    public long getCount() {
        String sql = "select count(*) from t_user";

        Long aLong = jdbcTemplate.queryForObject(sql, Long.class);


        return aLong;
    }

    @Override
    public int[] insertBatch(List<Object[]> args) {


        String sql = "insert into t_user values(0,?,?)";

        int[] ints = jdbcTemplate.batchUpdate(sql, args);


        return ints;
    }

    @Override
    public int[] updateBatch(List<Object[]> args) {
        String sql = "update t_user set uname = ?, pwd = ? where id = ?";

        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        return ints;
    }

    @Override
    public int[] deleteBatch(List<Object[]> args) {
        String sql = "delete from t_user where id = ?";

        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        return ints;
    }
}
