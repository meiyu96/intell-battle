package com.dxtwangxiao.intellbattle.service.impl;

import com.dxtwangxiao.intellbattle.dao.RecordReposity;
import com.dxtwangxiao.intellbattle.entity.Record;
import com.dxtwangxiao.intellbattle.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordReposity recordReposity;

    @Override
    public void create(Record record) {
        recordReposity.save(record);
    }

    @Override
    public void delete(Record record) {
        recordReposity.delete(record);
    }

    @Override
    public Record findByFightID(String id) {
        Optional<Record> record = recordReposity.findById(id);
        if (record.isPresent()){
            return record.get();
        }else {
            return null;
        }
    }

    @Override
    public List<Record> findByCreatorID(String id) {
        List<Record> records = recordReposity.findAllByCreatorID(id);
        return records;
    }
}
