package com.kang.ssm.service;

import com.kang.ssm.dao.UserDAO;
import com.kang.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @author kanseer
 * @create 2021-03-02 10:54
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User findUserByName(String name) {
        return userDAO.findUserByName(name);
    }

    @Override
    public User addUser(User user) {
        user.setId(UUID.randomUUID().toString().replaceAll("-",""));
        return userDAO.addUser(user);
    }

    @Override
    public User deleteUser(String name) {
        return userDAO.deleteUser(name);
    }

    @Override
    public User updateUser(User user) {
        return userDAO.updateUser(user);
    }
}
