package com.gsc.service.impl;

import com.gsc.dao.UserDao;
import com.gsc.pojo.Users;
import com.gsc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public void saveUser(Users users) {
        userDao.addUser(users);

    }
}
