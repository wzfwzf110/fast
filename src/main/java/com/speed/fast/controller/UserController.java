package com.speed.fast.controller;

import com.speed.fast.domain.User;
import com.speed.fast.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/getuser")
    public User getUserInfo(){
        User user = new User();
        user.setUserName("快递小哥");
        user.setUserCode("expressGG");
        return user;
    }

    @RequestMapping(value = "/getalluser")
    public List<User> getAllUser(){
        return userService.findAllUser();
    }

    @RequestMapping(value = "/getuserbyname/{name}")
    public List<User> getUserByName(@PathVariable("name")String name){
        return userService.getUserByName(name);
    }
}
