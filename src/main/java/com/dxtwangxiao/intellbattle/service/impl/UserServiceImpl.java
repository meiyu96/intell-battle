package com.dxtwangxiao.intellbattle.service.impl;

import com.dxtwangxiao.intellbattle.dao.UserRepository;
import com.dxtwangxiao.intellbattle.entity.User;
import com.dxtwangxiao.intellbattle.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户接口实现类
 * <p>
 * Created by Devin
 * 2018-06-13 上午 10:26
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public List<User> getUsersByGpa() {
        Pageable pageable = PageRequest.of(0, 3, Sort.Direction.DESC, "gpa");
        Page<User> page = userRepository.findAll(pageable);

        return page.getContent();
    }

    @Override
    @Transactional
    public User create(User newUser) {
        if (newUser == null) {
            log.error("新用户信息为空");
            return null;
        }

        try {
            userRepository.save(newUser);
            return newUser;
        } catch (Exception e) {
            log.error("Error on creating a new User entity with message: {}", e.getMessage());
        }

        return null;
    }

    @Override
    @Transactional
    public User updateUser(User updatedUser) {
        if (updatedUser == null) {
            log.error("要更改的用户信息为空");
            return null;
        }

        try {
            userRepository.save(updatedUser);
            return updatedUser;
        } catch (Exception e) {
            log.error("Error on updating a User entity with message: {}", e.getMessage());
        }

        return null;
    }

    @Override
    @Transactional
    public void deleteUserById(String id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            log.error("Error on deleting a User entity with message: {}", e.getMessage());
        }
    }

    @Override
    @Transactional
    public User getUserById(String id) {
        try {
            User user = userRepository.findUserById(id);
            return user;
        } catch (Exception e) {
            log.error("Error on finding a User entity with id {},  with message: {}", id, e.getMessage());
        }

        return null;
    }

    @Override
    @Transactional
    public User getUserByOpenid(String openid) {
        try {
            User user = userRepository.findUserByOpenid(openid);
            return user;
        } catch (Exception e) {
            log.error("Error on finding a User entity with openid {},  with message: {}", openid, e.getMessage());
        }

        return null;
    }
}
