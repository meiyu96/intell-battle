package com.dxtwangxiao.intellbattle.service.impl;

import com.dxtwangxiao.intellbattle.dao.MultipleChoiceRepository;
import com.dxtwangxiao.intellbattle.entity.MultipleChoice;
import com.dxtwangxiao.intellbattle.service.MultipleChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 选择题服务实现
 * @author miaoyu
 * @date 2018/6/13 11:28
 */
@Service
public class MultipleChoiceServiceImpl implements MultipleChoiceService {
    @Autowired
    private MultipleChoiceRepository multipleChoiceRepository;

    @Override
    public void create(MultipleChoice multipleChoice) {
        multipleChoiceRepository.save(multipleChoice);
    }

    @Override
    public void delete(MultipleChoice multipleChoice) {
        multipleChoiceRepository.delete(multipleChoice);
    }

    @Override
    public List<MultipleChoice> findAll() {
        return multipleChoiceRepository.findAll();
    }

    @Override
    public MultipleChoice findById(String id) {
        Optional<MultipleChoice> multipleChoice = multipleChoiceRepository.findById(id);
        if(multipleChoice.isPresent()){
            return multipleChoice.get();
        }
        return null;
    }

    @Override
    public List<MultipleChoice> findBySubjectId(String subjectId) {
        return multipleChoiceRepository.findAllBySubjectId(subjectId);
    }

    @Override
    public List<MultipleChoice> findBySubjectIdAndLevelAndDifficulty(String subjectId, Integer level, Double difficulty) {
        return multipleChoiceRepository.findAllBySubjectIdAndLevelAndDifficulty(subjectId,level,difficulty);
    }
}
