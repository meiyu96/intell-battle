package com.dxtwangxiao.intellbattle.service;

import com.dxtwangxiao.intellbattle.entity.QuestionType;

import java.util.List;

/**
 * 试题类型服务
 * @author miaoyu
 * @date 2018/6/13 15:29
 */
public interface QuestionTypeService {
    /**
     * 创建一条试题类型记录
     * @param questionType 试题类型对象
     */
    void create(QuestionType questionType);

    /**
     * 删除一条试题类型记录
     * @param questionType 试题类型对象
     */
    void delete(QuestionType questionType);

    /**
     * 根据ID查询一条试题类型记录
     * @param id 试题类型编号
     * @return 试题类型对象
     */
    QuestionType findQuestionTypeByQuestionTypeId(String id);

    /**
     * 查询所有试题类型记录
     * @return 包含所有试题类型的序列
     */
    List<QuestionType> findAll();

    /**
     * 根据试题类型名称查询科目
     * @param name 试题类型名称
     * @return 试题类型对象
     */
    QuestionType findQuestionTypeByQuestionTypeName(String name);
}
