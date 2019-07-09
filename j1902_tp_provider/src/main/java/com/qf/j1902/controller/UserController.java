package com.qf.j1902.controller;

import com.qf.j1902.pojo.User;
import com.qf.j1902.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 赵国林 on 2019/7/9.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/dologin")
    @ResponseBody
    public User getUserByName(@RequestParam("username") String username){
        User user = userService.getUserByName(username);
        System.out.println(user);
        return user;
    }
    @RequestMapping(value = "/addUser")
    public void addUser(User user){
        userService.addUser(user);
    }
}
