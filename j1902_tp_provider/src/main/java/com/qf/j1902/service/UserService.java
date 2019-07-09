package com.qf.j1902.service;

import com.qf.j1902.pojo.User;

/**
 * Created by asus on 2019/6/29.
 */
public interface UserService {
    public User getUserByName(String username);
    public void addUser(User user);
}
