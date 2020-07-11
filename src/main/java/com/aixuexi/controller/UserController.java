package com.aixuexi.controller;

import com.aixuexi.bean.User;
import com.aixuexi.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:xue
 * @Date:2020/7/10 19:37
 */

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/hello")
    public String hello(Model model){
        User user = userService.getUserById(1);
        model.addAttribute("user", user);
        return "success";
    }

}
