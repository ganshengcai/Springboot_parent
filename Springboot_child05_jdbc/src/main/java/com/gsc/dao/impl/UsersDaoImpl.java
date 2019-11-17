package com.gsc.dao.impl;

import com.gsc.dao.UsersDao;
import com.gsc.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDaoImpl implements UsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(Users users) {
        jdbcTemplate.update(
                "insert into user(name,password,email,birthday) values (?,?,?,?)",
                new Object[]{users.getName(),users.getPassword(),users.getEmail(),users.getBirthday()});
    }
}
