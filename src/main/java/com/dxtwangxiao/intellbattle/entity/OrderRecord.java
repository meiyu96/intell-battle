package com.dxtwangxiao.intellbattle.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_rhg_order_record")
@Data
public class OrderRecord {

    @Id
    @Column(name = "order_id",length = 36,nullable = false)
    private String orderID;

    @Column(name = "user_id",length = 36,nullable = false)
    private String userId;

    @Column(name = "product_id",length = 36,nullable = false)
    private String productID;

    @Column(name = "purchase_method",nullable = false)
    private Character purchaseMethod;

    @Column(name = "purchase_time",length = 11,nullable = false)
    private Long purchaseTime;

}
