package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 社区角色
 * @author meiyu
 */
@Entity
@Table(name = "t_per_specical_training")
@Data
public class CommunityRole {

    /**
     * id
     */
    @Id
    @Column(name = "id", length = 36)
    private String id;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色级别
     */
    @Column(name = "role_level")
    private String roleLevel;

    /**
     * 说明
     */
    @Column(name = "description")
    private String description;
       
    /**
     * 公共字段
     */
    @Column(name = "is_valid")
    private Byte isValid;

}