package com.dxtwangxiao.intellbattle.service.impl;

import com.dxtwangxiao.intellbattle.dao.QuestionTypeRepository;
import com.dxtwangxiao.intellbattle.entity.QuestionType;
import com.dxtwangxiao.intellbattle.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 试题类型服务实现
 * @author miaoyu
 * @date 2018/6/13 15:39
 */
@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    @Autowired
    private QuestionTypeRepository questionTypeRepository;

    @Override
    public void create(QuestionType questionType) {
        questionTypeRepository.save(questionType);
    }

    @Override
    public void delete(QuestionType questionType) {
        questionTypeRepository.delete(questionType);
    }

    @Override
    public QuestionType findQuestionTypeByQuestionTypeId(String id) {
        Optional<QuestionType> questionType = questionTypeRepository.findById(id);
        if(questionType.isPresent()){
            return questionType.get();
        }
        return null;
    }

    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }

    @Override
    public QuestionType findQuestionTypeByQuestionTypeName(String name) {
        List<QuestionType> questionTypes = questionTypeRepository.findQuestionTypeByName(name);
        if(questionTypes.isEmpty()){
            return null;
        }
        return questionTypes.get(0);
    }
}
