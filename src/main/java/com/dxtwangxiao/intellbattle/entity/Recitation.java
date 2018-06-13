package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 背诵题实体类
 * @author miaoyu
 * @date 2018/6/13 15:53
 */
@Entity
@Table(name = "t_common_recitation")
@Data
public class Recitation {
    /**
     * 编号
     */
    @Id
    @Column(length = 36)
    private String id;

    /**
     * 科目编号
     */
    @Column(name = "subject_id",length = 36)
    private String subjectId;

    /**
     * 级别
     */
    @Column
    private Integer level;

    /**
     * 难度系数
     */
    @Column
    private Double difficulty;


    /**
     * 题目
     */
    @Column
    private String question;

    /**
     * 答案
     */
    @Column
    private String answer;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 是否有效
     */
    @Column(name = "is_valid")
    private Byte isValid;

    /**
     * 最近更新人
     */
    @Column(name = "last_upd_user")
    private String lastUpdUser;

    /**
     * 最近更新时间
     */
    @Column(name = "last_upd_time", length = 11)
    private Integer lastUpdTime;

    /**
     * 创建用户(即录入人）
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间（即录入时间）
     */
    @Column(name = "create_time", length = 11)
    private Integer createTime;
}
