package com.dxtwangxiao.intellbattle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t-rhg_lp_purchase_record")
public class LPPurchaseRecord {

    @Id
    @Column(name = "lp_purchase_id",length = 36,nullable = false)
    private String ipPurchaseID;

    @Column(name = "user_id",length = 36,nullable = false)
    private String userID;

    @Column(name = "begin_time",length = 11,nullable = false)
    private Long beginTime;

    @Column(name = "end_time",length = 11,nullable = false)
    private Long endTime;

    @Column(name = "consumptionAmount",nullable = false)
    private int consumptionAmount;

    @Column(name = "question_id",length = 36,nullable = false)
    private String questionID;

    @Column(name = "fight_id",length = 36,nullable = false)
    private String fightID;

    @Column(name = "isTrue",nullable = false)
    private Boolean isTrue;







}
