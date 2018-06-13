package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 学科实体类
 * @author miaoyu
 * @date 2018/6/13 09:31
 */
@Entity
@Table(name = "t_com_subject")
@Data
public class Subject {
    /**
     * 编号
     */
    @Id
    @Column(length = 36)
    private String id;

    /**
     * 名称
     */
    @Column
    private String name;

    /**
     * 绩点权值
     */
    @Column(name = "grade_point_weight",columnDefinition = "decimal(5,2)")
    private Double gradePointWeight;

    /**
     * 金币权值
     */
    @Column(name = "gold_weight",columnDefinition = "decimal(5,2)")
    private Double goldWeight;

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
     * 创建用户
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time", length = 11)
    private Integer createTime;
}
