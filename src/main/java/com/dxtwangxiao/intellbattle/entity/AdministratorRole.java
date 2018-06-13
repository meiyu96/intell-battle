package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 管理员角色表
 * <p>
 * Created by Devin
 * 2018-06-13 下午 03:19
 */
@Entity
@Table(name = "t_sys_admin_role")
@Data
public class AdministratorRole {

    /**
     * 角色id
     */
    @Id
    @Column(name = "id", length = 36)
    private String id;

    /**
     * 角色编号
     */
    @Column(name = "no", length = 36)
    private String no;

    /**
     * 角色名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 权限代码，需求说明表示为json形式
     */
    @Column(name = "code")
    private String code;



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

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Integer createTime;
}
