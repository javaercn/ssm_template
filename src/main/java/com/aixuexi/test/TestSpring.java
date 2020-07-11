package com.aixuexi.test;

import com.aixuexi.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:xue
 * @Date:2020/7/10 19:48
 */
public class TestSpring {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService service = (UserService) applicationContext.getBean("userService");
        service.getUsers();
        System.out.println(service);

    }
}
