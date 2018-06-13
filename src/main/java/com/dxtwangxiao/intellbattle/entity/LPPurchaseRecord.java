package com.dxtwangxiao.intellbattle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 学点消费记录
 */
@Entity
@Table(name = "t_rhg_lp_purchase_record")
public class LPPurchaseRecord {

    /**
     * 记录id
     */
    @Id
    @Column(name = "lp_purchase_id", length = 36, nullable = false)
    private String ipPurchaseID;

    /**
     * 用户编号
     */
    @Column(name = "user_id", length = 36, nullable = false)
    private String userID;

    /**
     * 开始时间
     */
    @Column(name = "begin_time", length = 11, nullable = false)
    private Long beginTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time", length = 11, nullable = false)
    private Long endTime;

    /**
     * 消费金额
     */
    @Column(name = "consumption_amount", nullable = false)
    private int consumptionAmount;

    /**
     * 题目编号
     */
    @Column(name = "question_id", length = 36, nullable = false)
    private String questionID;

    /**
     * 战局编号
     */
    @Column(name = "fight_id", length = 36, nullable = false)
    private String fightID;

    /**
     * 答案是否正确
     */
    @Column(name = "isTrue", nullable = false)
    private Boolean isTrue;

}
