package com.dxtwangxiao.intellbattle.controller;

import com.dxtwangxiao.intellbattle.entity.User;
import com.dxtwangxiao.intellbattle.service.UserService;
import com.dxtwangxiao.intellbattle.util.ResultUtil;
import com.dxtwangxiao.intellbattle.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 用户控制器
 * <p>
 * Created by Devin
 * 2018-06-13 上午 11:54
 */
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public User createNewUser(User newUser) {
        return userService.create(newUser);
    }

    @GetMapping
    public Result getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResultUtil.success(users);
    }

    @GetMapping("/{openid}")
    public User getUserByOpenid(@PathVariable String openid) {
        return userService.getUserByOpenid(openid);
    }

    @PutMapping
    public User updateUser(User updatedUser) {
        return userService.updateUser(updatedUser);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") String id) {
        userService.deleteUserById(id);
        return "success";
    }
}
