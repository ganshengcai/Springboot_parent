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
    public String saveUser() {
        Users users = new Users();
        users.setName("大法师地方");
        users.setPassword("dfasd");
        users.setEmail("asdfas@qq.com");
        users.setBirthday("20120303");
        
        userService.saveUser(users);
        return "success";
    }
}
