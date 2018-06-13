package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 学点充值表
 */
@Entity
@Table(name = "t_rhg_learning_point_record")
@Data
public class LearningPointRecord {

    /**
     * 学点充值记录id
     */
    @Id
    @Column(name = "id",length = 36,nullable = false)
    private String id;

    /**
     * 用户id
     */
    @Column(name = "owner_id",length = 36,nullable = false)
    private String ownerID;

    /**
     * 交易数量
     */
    @Column(name = "order_quanity",nullable = false)
    private Integer orderQuantity;

    /**
     * 交易时间
     */
    @Column(name = "order_time",length = 11,nullable = false)
    private Long orderTime;

    /**
     * 订单号
     */
    @Column(name = "order_id",length = 36)
    private String orderID;


















}
