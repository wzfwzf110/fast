package com.speed.fast.service;

import com.speed.fast.domain.User;

import java.util.List;

public interface IUserService {
    List<User> findAllUser();

    List<User> getUserByName(String name);
}
