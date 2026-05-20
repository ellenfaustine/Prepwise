package com.ellen.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ellen.backend.model.InterviewQuestion;
import com.ellen.backend.repository.InterviewQuestionRepository;

@Service
public class InterviewService {

    private final InterviewQuestionRepository repository;

    public InterviewService(InterviewQuestionRepository repository) {
        this.repository = repository;
    }

    public List<InterviewQuestion> getQuestions() {
        return repository.findAll();
    }

    public InterviewQuestion saveQuestion(InterviewQuestion question){
        return repository.save(question);
    }

    public InterviewQuestion updateQuestion(
            Long id,
            InterviewQuestion updatedQuestion) {

        InterviewQuestion question =
                repository.findById(id).orElseThrow();

        question.setQuestion(updatedQuestion.getQuestion());
        question.setCategory(updatedQuestion.getCategory());

        return repository.save(question);
    }

    public void deleteQuestion(Long id) {
        repository.deleteById(id);
    }
}