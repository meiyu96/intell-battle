package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_chg_coupon_exchange")
@Data
public class CouponExchange {

    /**
     * 唯一编码，作为主键使用
     */
    @Id
    @Column(name = "coupon_exchange_id", length = 36)
    private String couponExchangeID;

    /**
     * 外键，显示在UI上展示给用户
     */
    @Column(name = "coupon_no", length = 36)
    private String couponNo;

    /**
     * 开始时间
     */
    @Column(name = "exchange_time", length = 11)
    private Long exchangeTime;

    /**
     * 有效截止时间
     */
    @Column(name = "expire_time", length = 11)
    private Long expireTime;


    /**
     * 现拥有着者id
     */
    @Column(name = "current_owner_id", length = 36)
    private String currentOwnerID;

    /* 以下是公共字段 */

    @Column(name = "remark")
    private String remark;

    @Column(name = "is_valid")
    private Byte isValid;

    @Column(name = "last_upd_user")
    private String lastUpdUser;

    @Column(name = "last_upd_time", length = 11)
    private Integer lastUpdTime;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "create_time")
    private String createTime;
}
