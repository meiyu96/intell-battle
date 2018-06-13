package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 管理员表
 * <p>
 * Created by Devin
 * 2018-06-13 下午 02:50
 */
@Entity
@Table(name = "t_sys_admin")
@Data
public class Administrator {

    /**
     * 管理员id
     */
    @Id
    @Column(name = "id", length = 36)
    private String id;

    /**
     * 管理员编号，对外展示
     */
    @Column(name = "no", length = 36)
    private String no;

    /**
     * 管理员姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 管理员级别：A：一般管理员，B：超级管理员，C:业务员，D:题库贡献者
     */
    @Column(name = "user_level")
    private Byte userLevel;

    /**
     * 管理员登录账号
     */
    @Column(name = "account")
    private String account;

    /**
     * 管理员登陆密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 用户角色id，用于区分不同权限
     */
    @Column(name = "role_id")
    private String roleId;



    /* 以下是公共字段 */

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 是否有效，0表示无效，1表示有效
     */
    @Column(name = "is_valid")
    private Byte isValid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Integer createTime;
}
