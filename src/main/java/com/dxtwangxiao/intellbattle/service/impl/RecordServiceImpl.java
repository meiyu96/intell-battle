package com.dxtwangxiao.intellbattle.service.impl;

import com.dxtwangxiao.intellbattle.dao.RecordReposity;
import com.dxtwangxiao.intellbattle.entity.Record;
import com.dxtwangxiao.intellbattle.service.RecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecordServiceImpl implements RecordService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecordServiceImpl.class);

    @Autowired
    private RecordReposity recordReposity;

    @Override
    public void create(Record record) {
        LOGGER.info("准备创建一条新的对战记录",record);

        try {
            recordReposity.save(record);
            LOGGER.info("成功插入一条新的对战记录",record);
        }catch (Exception e){
            LOGGER.error("插入对战记录时发生错误：{}",e.getMessage());
        }

    }

    @Override
    public void delete(Record record) {
        LOGGER.info("准备删除一条对战记录");

        try {
            recordReposity.delete(record);
            LOGGER.info("成功删除一条对战记录");
        }catch (Exception e){
            LOGGER.error("删除对战记录时发生错误：{}",e.getMessage());
        }

    }

    @Override
    public Record findByFightID(String id) {
        LOGGER.info("根据ID查询对战记录");

        try {
            Optional<Record> record = recordReposity.findById(id);
            LOGGER.info("成功根据ID查询对战记录");
            if (record.isPresent()){
                return record.get();
            }else {
                return null;
            }
        }catch (Exception e){
            LOGGER.error("根据ID查询记录时发生错误",e.getMessage());
        }
        return null;
    }

    @Override
    public List<Record> findByCreatorID(String id) {
        LOGGER.info("根据用户ID查询其对战记录");
        try {
            List<Record> records = recordReposity.findAllByCreatorID(id);
            LOGGER.info("成功根据用户ID查询其对战记录");
            return records;
        }catch (Exception e){
            LOGGER.error("根据用户ID查询其对战记录时发生错误：{}",e.getMessage());
        }
        return null;
    }
}
