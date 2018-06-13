package com.dxtwangxiao.intellbattle.service;

import com.dxtwangxiao.intellbattle.entity.MultipleChoice;

import java.util.List;

/**
 * 选择题服务
 * @author miaoyu
 * @date 2018/6/13 11:27
 */
public interface MultipleChoiceService {
    /**
     * 创建一个选择题
     * @param multipleChoice 选择题对象
     */
    void create(MultipleChoice multipleChoice);

    /**
     * 删除一个选择题
     * @param multipleChoice 选择题对象
     */
    void delete(MultipleChoice multipleChoice);

    /**
     * 获取全部选择题
     * @return 包含所有选择题的序列
     */
    List<MultipleChoice> findAll();

    /**
     * 根据编号查询选择题
     * @param id 选择题编号
     * @return 选择题对象
     */
    MultipleChoice findById(String id);

    /**
     * 根据学科编号查询该学科的选择题，结果按照级别和难度升序排序
     * @param subjectId 学科编号
     * @return 该学科对应的选择题
     */
    List<MultipleChoice> findBySubjectId(String subjectId);

    /**
     * 根据学科编号，级别和难度查询选择题
     * @param subjectId 学科编号
     * @param level 级别
     * @param difficulty 难度
     * @return 符合条件的选择题序列
     */
    List<MultipleChoice> findBySubjectIdAndLevelAndDifficulty(String subjectId,Integer level,Double difficulty);
}
