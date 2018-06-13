package com.dxtwangxiao.intellbattle.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_combat_record")
@Data
public class Record {

    /**
     * 唯一编码，作为主键使用
     */
    @Id
    @Column(name = "fight_id", length = 36,nullable = false)
    private String fightID;

    /**
     * 候选主键，显示在UI上展示给用户
     */
    @Column(name = "fight_no", length = 36,nullable = false)
    private String fightNo;

    /**
     * 对战类型，0代表两人比赛，1代表群殴
     */
    @Column(name = "fight_type",nullable = false)
    private Character fightType;

    /**
     * 开始时间
     */
    @Column(name = "begin_time", length = 11,nullable = false)
    private Long beginTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time", length = 11,nullable = false)
    private Long endTime;

    /**
     * 最大用户数量
     */
    @Column(name = "user_max_count",nullable = false)
    private Integer userMaxCount;

    /**
     * 实际用户数量
     */
    @Column(name = "user_fact_count",nullable = false)
    private Integer userFactCount;

    /**
     * 创建者id
     */
    @Column(name = "creator_id", length = 36,nullable = false)
    private String creatorID;

    /**
     * 战局状态
     * 0创建 1坐下 2准备 3开始 4游戏中 5游戏结束
     */
    @Column(name = "fight_status")
    private Character fightStatus;


    /* 以下是公共字段 */

    @Column(name = "remark")
    private String remark;

    @Column(name = "is_valid")
    private Character isValid;

    @Column(name = "last_upd_user")
    private String lastUpdUser;

    @Column(name = "last_upd_time", length = 11)
    private Integer lastUpdTime;

    @Column(name = "create_user")
    private String createUser;

}
