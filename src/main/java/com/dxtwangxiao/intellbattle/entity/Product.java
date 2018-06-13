package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品信息表
 */
@Entity
@Table(name = "t_rhg_product")
@Data
public class Product {

    /**
     * 商品编号
     */
    @Id
    @Column(name = "product_id",length = 36,nullable = false)
    private String productID;

    /**
     * 商品名
     */
    @Column(name = "product_name",length = 10,nullable = false)
    private String productName;

    /**
     * 单位
     */
    @Column(name = "unit",length = 10,nullable = false)
    private String unit;

    /**
     * 单价
     */
    @Column(name = "price",nullable = false)
    private int price;

    /**
     * 支付方式
     * 0人民币 1金币 2都支持
     */
    @Column(name = "payment_method",nullable = false)
    private Character paymentMethod;


    /* 以下是公共字段 */

    @Column(name = "remark")
    private String remark;

    @Column(name = "is_valid")
    private Character isValid;





}
