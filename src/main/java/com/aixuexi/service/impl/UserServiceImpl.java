package com.aixuexi.service.impl;

import com.aixuexi.bean.User;
import com.aixuexi.dao.UserDao;
import com.aixuexi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:xue
 * @Date:2020/7/10 19:36
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
     private UserDao userDao;
    @Override
    public List<User> getUsers() {
        System.out.println("业务层查询所有的信息。。。");
        List<User> users = userDao.getUsers();
        return users;
    }

    @Override
    public User getUserById(Integer id) {
        System.out.println("业务曾查询某个信息。。。");
        User user = userDao.getUserById(id);
        return user;
    }
}
