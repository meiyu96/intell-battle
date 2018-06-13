package com.dxtwangxiao.intellbattle.dao;

import com.dxtwangxiao.intellbattle.entity.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: miaoyu
 * @Date: 2018/6/13 10:27
 * @Description: 学科数据访问
 */
@Repository
public interface SubjectRepository extends CrudRepository<Subject,String> {
    /**
     * 根据科目名查询科目
     * @param name 科目名
     * @return 科目对象
     */
    @Query(value = "SELECT s FROM Subject s WHERE s.name =:name")
    List<Subject> findSubjectByName(@Param("name") String name);

    /**
     * 获取所有科目
     * @return 包含所有科目的序列
     */
    @Override
    List<Subject> findAll();
}
