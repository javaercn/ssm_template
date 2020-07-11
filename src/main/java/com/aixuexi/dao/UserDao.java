package com.aixuexi.dao;

import com.aixuexi.bean.User;

import java.util.List;

/**
 * @Auther:xue
 * @Date:2020/7/10 19:33
 */
public interface UserDao {

    List<User> getUsers();

    User getUserById(Integer id);
}
