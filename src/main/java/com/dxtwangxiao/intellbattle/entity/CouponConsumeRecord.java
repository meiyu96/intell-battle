package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_chg_coupon_consume_record")
@Data
public class CouponConsumeRecord {
    /**
     * 唯一编码，作为主键使用
     */
    @Id
    @Column(name = "coupon_exchange_id", length = 36)
    private String couponExchangeID;

    /**
     * 外键，优惠券编号
     */
    @Column(name = "coupon_no", length = 36)
    private String couponNo;

    /**
     * 外键，订单编号
     */
    @Column(name = "order_id", length = 36)
    private String orderId;

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
