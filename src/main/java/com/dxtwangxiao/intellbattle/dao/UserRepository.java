package com.dxtwangxiao.intellbattle.dao;

import com.dxtwangxiao.intellbattle.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据访问层
 * <p>
 * Created by Devin
 * 2018-06-13 上午 10:21
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {
    List<User> findAll();

    @Query("select u from User u")
    Page<User> findAll(Pageable pageable);

    User save(User newUser);

    User findUserById(String id);

    User findUserByOpenid(String openid);
}
