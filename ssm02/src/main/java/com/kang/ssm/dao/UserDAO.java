package com.kang.ssm.dao;

import com.kang.ssm.entity.User;

import java.util.List;

/**
 * @author kanseer
 * @create 2021-03-01 17:34
 */
public interface UserDAO {

    List<User> findAll();

    void addUser(User user);
}
