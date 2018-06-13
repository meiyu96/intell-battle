package com.dxtwangxiao.intellbattle.dao;

import com.dxtwangxiao.intellbattle.entity.QuestionType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 试题类型数据访问
 * @author miaoyu
 * @date 2018/6/13 15:20
 */
@Repository
public interface QuestionTypeRepository extends CrudRepository<QuestionType,String> {
    /**
     * 根据试题类型名查询试题类型
     * @param name 试题类型名
     * @return 对应试题类型序列
     */
    @Query(value = "SELECT q FROM QuestionType q WHERE q.name =:name")
    List<QuestionType> findQuestionTypeByName(@Param("name") String name);

    /**
     * 查询所有试题类型
     * @return 包含所有试题类型的序列
     */
    @Override
    List<QuestionType> findAll();
}
