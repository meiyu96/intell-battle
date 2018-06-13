package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 选择题实体类
 * @author miaoyu
 * @date 2018/6/13 10:04
 */
@Entity
@Table(name = "t_common_multiple_choice")
@Data
public class MultipleChoice {
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
     * 题目 由题干编号组成，以逗号分隔
     */
    @Column
    private String question;

    /**
     * 类型 0：文本；1：富文本;2：资源
     */
    @Column(length = 1)
    private Integer type;

    /**
     * 选项A
     */
    @Column(name = "choice_a")
    private String choiceA;

    /**
     * 选项B
     */
    @Column(name = "choice_b")
    private String choiceB;

    /**
     * 选项C
     */
    @Column(name = "choice_c")
    private String choiceC;

    /**
     * 选项D
     */
    @Column(name = "choice_d")
    private String choiceD;

    /**
     * 答案 0:A; 1:B;2:C;3:D
     */
    @Column(length = 1)
    private Integer answer;

    /**
     * 负责人
     */
    @Column(name = "person_in_charge",length = 36)
    private String personInCharge;

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
