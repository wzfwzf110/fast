package com.speed.fast.service.impl;

import com.speed.fast.dao.IUserDao;
import com.speed.fast.dao.IUserMapper;
import com.speed.fast.domain.User;
import com.speed.fast.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IUserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    @Override
    public List<User> getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
