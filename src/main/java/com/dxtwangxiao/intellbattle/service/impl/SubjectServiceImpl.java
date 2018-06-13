package com.dxtwangxiao.intellbattle.service.impl;

import com.dxtwangxiao.intellbattle.dao.SubjectRepository;
import com.dxtwangxiao.intellbattle.entity.Subject;
import com.dxtwangxiao.intellbattle.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 学科服务实现
 * @author miaoyu
 * @date 2018/6/13 10:38
 */
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public void create(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void delete(Subject subject) {
        subjectRepository.delete(subject);
    }

    @Override
    public Subject findSubjectBySubjectId(String id) {
        Optional<Subject> subject = subjectRepository.findById(id);
        if(subject.isPresent()){
            return subject.get();
        }
        return null;
    }

    @Override
    public List<Subject> findAll() {
        List<Subject> subjects = subjectRepository.findAll();
        return subjects;
    }

    @Override
    public Subject findSubjectBySubjectName(String name) {
        List<Subject> subjects = subjectRepository.findSubjectByName(name);
        if(subjects.isEmpty()){
            return null;
        }
        return subjects.get(0);
    }
}
