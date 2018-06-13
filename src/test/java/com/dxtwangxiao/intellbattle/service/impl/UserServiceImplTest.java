package com.dxtwangxiao.intellbattle.service.impl;

import com.dxtwangxiao.intellbattle.entity.User;
import com.dxtwangxiao.intellbattle.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 用户服务测试类
 * <p>
 * Created by Devin
 * 2018-06-13 上午 10:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void getAllUsers() {
        List<User> users = userService.getAllUsers();
        users.forEach(user -> System.out.println(user.getGradePoint()));
    }

    @Test
    public void getUsersByGpa() {
        List<User> users = userService.getUsersByGpa();
        users.forEach(user -> System.out.println(user.getGradePoint()));
    }
}