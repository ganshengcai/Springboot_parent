package com.gsc.controller;

import com.gsc.pojo.Users;
import com.gsc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping("/saveUser")
    @ResponseBody
    public String save() {
        Users users = new Users();
        users.setBirthday("20190304");
        users.setName("甘胜才");
        users.setEmail("34353434@qq.com");
        users.setPassword("11111111");

        userService.saveUser(users);
        return "success";
    }
}
