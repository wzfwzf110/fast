package com.speed.fast.Controller;

import com.speed.fast.Domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/getUser")
    public User getUserInfo(){
        User user = new User();
        user.setUserName("快递小哥");
        user.setUserCode("expressGG");
        return user;
    }

    public User setUserInfo(){
        return null;
    }
}
