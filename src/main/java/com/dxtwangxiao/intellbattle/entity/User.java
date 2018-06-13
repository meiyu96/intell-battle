package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 用户表
 * <p>
 * Created by Devin
 * 2018-06-13 上午 09:12
 */
@Entity
@Table(name = "t_com_user")
@Data
public class User {

    /**
     * 用户id
     */
    @Id
    @Column(name = "id", length = 36)
    private String id;

    /**
     * 用户姓名
     */
    @Column(name = "name", length = 10)
    private String name;

    /**
     * 用户性别
     */
    @Column(name = "sex")
    private Character sex;

    /**
     * 用户头像url
     */
    @Column(name = "head_image")
    private String headImage;

    /**
     * 用户编号，候选主键，主要展示给用户看
     */
    @Column(name = "no", length = 36)
    private String no;

    /**
     * 用户微信id
     */
    @Column(name = "openid")
    private String openid;

    /**
     * 用户微信昵称
     */
    @Column(name = "wechat_name")
    private String wechatName;

    /**
     * 用户等级
     */
    @Column(name = "level")
    private Integer level;

    /**
     * 用户其他信息
     */
    @Column(name = "other_info")
    private String otherInfo;

    /**
     * 用户金币数目
     */
    @Column(name = "coin")
    private Integer coin;

    /**
     * 用户学点数目
     */
    @Column(name = "learning_point")
    private Integer learningPoint;

    /**
     * 用户绩点
     */
    @Column(name = "grade_point")
    private Double gradePoint;

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
     * 最近更新用户，存储用户id
     */
    @Column(name = "last_upd_user")
    private String lastUpdUser;

    /**
     * 最近更新时间
     */
    @Column(name = "last_upd_time", length = 11)
    private Integer lastUpdTime;

    /**
     * 创建用户，存储用户id
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time",  length= 11)
    private Integer createTime;
}