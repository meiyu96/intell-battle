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
public class Knowledge {

    /**
     * id
     */
    @Id
    @Column(name = "id", length = 36)
    private String id;

    /**
     * 知识点编号
     */
    @Column(name = "knowledge_id", length = 36)
    private String knowledgeId;

    /**
     * 科目编号
     */
    @Column(name = "subject_id", length = 36)
    private String subjectId;

    /**
     * 知识点
     */
    @Column(name = "knowledge")
    private String knowledge;
    
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