package com.kang.ssm.service;

import com.kang.ssm.pojo.User;

import java.util.List;

/**
 * @author kanseer
 * @create 2021-03-02 10:53
 */
public interface UserService {
    List<User> findAll();

    User findUserByName(String name);

    User addUser(User user);

    User deleteUser(String name);

    User updateUser(User user);
}
