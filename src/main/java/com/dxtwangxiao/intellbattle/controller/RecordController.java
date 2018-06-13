package com.dxtwangxiao.intellbattle.controller;

import com.dxtwangxiao.intellbattle.entity.Record;
import com.dxtwangxiao.intellbattle.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intell_battle")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping("/saveRecord")
    public String saveRecord(Record record){
        recordService.create(record);
        return "success";
    }

    @GetMapping("/getRecordByUserID")
    public List<Record> getRecordByUserID(@RequestParam("userID") String userID){

        return recordService.findByCreatorID(userID);


    }



}
