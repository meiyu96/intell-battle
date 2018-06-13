package com.dxtwangxiao.intellbattle.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 订单记录表
 */
@Entity
@Table(name = "t_rhg_order_record")
@Data
public class OrderRecord {

    /**
     * 订单号
     */
    @Id
    @Column(name = "order_id",length = 36,nullable = false)
    private String orderID;

    /**
     * 用户编号
     */
    @Column(name = "user_id",length = 36,nullable = false)
    private String userId;

    /**
     * 商品编号
     */
    @Column(name = "product_id",length = 36,nullable = false)
    private String productID;

    /**
     * 购买方式
     * 0人民币 1金币
     */
    @Column(name = "purchase_method",nullable = false)
    private Character purchaseMethod;

    /**
     * 购买时间
     */
    @Column(name = "purchase_time",length = 11,nullable = false)
    private Long purchaseTime;

}
