package com.dxtwangxiao.intellbattle.service;


import com.dxtwangxiao.intellbattle.entity.Record;

import java.util.List;

public interface RecordService {

    /**
     * 创建一条新的对战记录
     * @param record
     */
    void create(Record record);

    /**
     * 删除一条对战记录
     * @param record
     */
    void delete(Record record);

    /**
     * 根据对战ID查找一条对战记录
     * @param id
     * @return
     */
    Record findByFightID(String id);

    /**
     * 根据创建人ID查找其创建的对战
     * @param id
     * @return
     */
    List<Record> findByCreatorID(String id);



}
