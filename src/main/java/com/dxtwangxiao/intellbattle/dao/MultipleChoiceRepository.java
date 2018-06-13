package com.dxtwangxiao.intellbattle.dao;

import com.dxtwangxiao.intellbattle.entity.MultipleChoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 选择题数据访问
 * @author miaoyu
 * @date 2018/6/13 11:20
 */
@Repository
public interface MultipleChoiceRepository extends CrudRepository<MultipleChoice,String> {
    /**
     * 获取全部选择题
     * @return 含有全部选择题的序列
     */
    @Override
    List<MultipleChoice> findAll();

    /**
     *根据学科编号查询该学科下的选择题，按照级别和难度升序排序
     * @param subjectId 学科编号
     * @return 该学科下的选择题序列
     */
    @Query(value = "SELECT m FROM MultipleChoice m WHERE m.subjectId =:subjectId ORDER BY m.level,m.difficulty ASC")
    List<MultipleChoice> findAllBySubjectId(@Param("subjectId") String subjectId);

    /**
     * 根据级别查询选择题，根据难度升序排序
     * @param level 选择题级别
     * @return 对应级别的选择题序列
     */
    @Query(value = "SELECT m FROM MultipleChoice m WHERE m.level =:level ORDER BY m.difficulty ASC")
    List<MultipleChoice> findAllByLevel(@Param("level") Integer level);

    /**
     * 根据级别和学科编号查询选择题，按照难度升序排序
     * @param subjectId 学科编号
     * @param level 级别
     * @return 符合搜索要求的选择题序列
     */
    @Query(value = "SELECT m FROM MultipleChoice m WHERE m.subjectId =:subjectId AND m.level =:level ORDER BY m.difficulty ASC")
    List<MultipleChoice> findAllBySubjectIdAndLevel(@Param("subjectId") String subjectId,@Param("level") Integer level);

    /**
     * 根据学科编号，级别和难度查询选择题
     * @param subjectId 学科编号
     * @param level 级别
     * @param difficulty 难度
     * @return 符合搜索条件的选择题序列
     */
    @Query(value = "SELECT m FROM MultipleChoice m WHERE m.subjectId =:subjectId AND m.level =:level AND m.difficulty =:difficulty")
    List<MultipleChoice> findAllBySubjectIdAndLevelAndDifficulty(@Param("subjectId")String subjectId,@Param("level")Integer level,@Param("difficulty") Double difficulty);

    /**
     * 根据录入者ID查询选择题，根据录入时间倒序排序
     * @param createUser 选择题录入者ID
     * @return 该录入者创建的选择题序列
     */
    @Query(value = "SELECT m FROM MultipleChoice m WHERE m.createUser=:createUser")
    List<MultipleChoice> findAllByCreateUser(@Param("createUser") String createUser);

}
