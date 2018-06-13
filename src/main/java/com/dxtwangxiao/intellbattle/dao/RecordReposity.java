package com.dxtwangxiao.intellbattle.dao;

import com.dxtwangxiao.intellbattle.entity.Record;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordReposity extends CrudRepository<Record,String> {

    @Query(value = "select r from Record r where r.creatorID=:userID ")
    List<Record> findAllByCreatorID(@Param("userID") String userID);







}
