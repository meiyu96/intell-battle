package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_chg_coupon")
@Data
public class Coupon {

    /**
     * 主键，显示在UI上展示给用户
     */
    @Id
    @Column(name = "coupon_no", length = 36)
    private String couponNo;

    /**
     * 优惠券类型，0代表现金，1代表金币
     */
    @Column(name = "coupon_type")
    private Byte couponType;

    /**
     * 优惠券金额
     */
    @Column(name = "coupon_price", columnDefinition = "decimal(5, 2)")
    private Double coupon_price;

    /**
     * 开始时间
     */
    @Column(name = "begin_time", length = 11)
    private Long beginTime;

    /**
     * 结束时间
     */
    @Column(name = "expire_time", length = 11)
    private Long expireTime;


    /**
     * 拥有着者id
     */
    @Column(name = "owner_id", length = 36)
    private String ownerID;


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
