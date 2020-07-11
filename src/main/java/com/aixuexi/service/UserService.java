package com.aixuexi.service;

import com.aixuexi.bean.User;

import java.util.List;

/**
 * @Auther:xue
 * @Date:2020/7/10 19:35
 */
public interface UserService {
    List<User> getUsers();

    User getUserById(Integer id);
}
