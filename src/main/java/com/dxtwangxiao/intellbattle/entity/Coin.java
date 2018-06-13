package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 金币表
 * <p>
 * Created by Devin
 * 2018-06-13 下午 03:38
 */
@Entity
@Table(name = "t_com_coin")
@Data
public class Coin {

    /**
     * id，用作主键
     */
    @Id
    @Column(name = "id", length = 36)
    private String id;

    /**
     * 用户id
     */
    @Column(name = "own_id", length = 36)
    private String ownId;

    /**
     * 金币交易数量，有正负之分
     */
    @Column(name = "number")
    private Integer number;

    /**
     * 交易时间
     */
    @Column(name = "create_time", length = 11)
    private Integer createTime;

    /**
     * 说明，比如：“充值”；“战局编号”
     */
    @Column(name = "instruction")
    private String instruction;





    /* 以下是公共字段 */

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 是否有效，0表示无效，1表示有效
     */
    @Column(name = "is_valid")
    private Byte isValid;
}
