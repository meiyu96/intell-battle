package com.dxtwangxiao.intellbattle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 题库表
 * @author meiyu
 */

@Entity
@Table(name = "t_com_questions")
@Data

public class Questions {
	/**
	 * 编号
	 */
	@Id
	@Column(name = "questionbank_id",length = 36)
	private String questionbankId;
	
	/**
	 * 题目编号
	 */
	@Column(name = "question_id", length = 36)
	private String questionId;
	
	/**
	 * 题目类型编号
	 */	
	@Column(name = "question_type_id", length = 36)
	private String questionTypeId;
	
	/**
	 * 知识点编号
	 */
	@Column(name = "knowledge_id", length = 36)
	private String knowledgeId;
	
	/**公共字段
	 * 
	 */
	 @Column(name = "remark")
	 private String remark;

	 @Column(name = "is_valid")
	 private Byte isValid;

	 @Column(name = "last_upd_time", length = 11)
	 private Integer lastUpdTime;


}
