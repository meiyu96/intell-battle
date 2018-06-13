package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @Column(name = "product_id",length = 36,nullable = false)
    private String productID;

    @Column(name = "product_name",length = 10,nullable = false)
    private String productName;

    @Column(name = "unit",length = 10,nullable = false)
    private String unit;

    @Column(name = "price",nullable = false)
    private int price;

    /**
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
