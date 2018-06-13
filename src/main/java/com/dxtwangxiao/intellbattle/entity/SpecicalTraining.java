package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 特训营表
 * @author meiyu
 */
@Entity
@Table(name = "t_exc_specical_training")
@Data
public class SpecicalTraining {

    /**
     * id
     */
    @Id
    @Column(name = "id", length = 36)
    private String id;

    /**
     * 用户id
     */
    @Column(name = "user_id", length = 36)
    private String userId;

    /**
     * 上家id
     */
    @Column(name = "last_id", length = 36)
    private String lastId;

    /**
     * 特训营名称
     */
    @Column(name = "sp_name")
    private String spName;
    
    /**
     * 社区角色
     */
    @Column(name = "community_role")
    private String communityRole;

    /**
     * 难度系数
     */
    @Column(name = "difficult_coefficient")
    private String difficultCoefficient;
    
    /**
     * 公共字段
     */
    @Column(name = "is_valid")
    private Byte isValid;

}