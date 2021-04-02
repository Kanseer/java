package com.kang.ssm.service;

import com.kang.ssm.entity.User;

import java.util.List;

/**
 * @author kanseer
 * @create 2021-03-01 17:35
 */
public interface UserService {
    List<User> findAll();
    void addUser(User user);
}
