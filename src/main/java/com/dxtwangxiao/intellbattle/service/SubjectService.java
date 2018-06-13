package com.dxtwangxiao.intellbattle.service;

import com.dxtwangxiao.intellbattle.entity.Subject;

import java.util.List;

/**
 * 学科服务
 * @author miaoyu
 * @date 2018/6/13 10:30
 */
public interface SubjectService {
    /**
     * 创建一条学科记录
     * @param subject 学科对象
     */
    void create(Subject subject);

    /**
     * 删除一条学科记录
     * @param subject 学科对象
     */
    void delete(Subject subject);

    /**
     * 根据ID查询一条学科记录
     * @param id 学科编号
     * @return 学科对象
     */
    Subject findSubjectBySubjectId(String id);

    /**
     * 查询所有学科记录
     * @return 包含所有学科的序列
     */
    List<Subject> findAll();

    /**
     * 根据科目名称查询科目
     * @param name 科目名称
     * @return 科目对象
     */
    Subject findSubjectBySubjectName(String name);

}
