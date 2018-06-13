package com.dxtwangxiao.intellbattle.service;

import com.dxtwangxiao.intellbattle.entity.User;

import java.util.List;

/**
 * 用户服务接口
 *
 * Created by Devin
 * 2018-06-13 上午 10:25
 */
public interface UserService {
    List<User> getAllUsers();

    List<User> getUsersByGpa();

    User create(User newUser);

    User updateUser(User updatedUser);

    void deleteUserById(String id);

    User getUserById(String id);

    User getUserByOpenid(String openid);
}
