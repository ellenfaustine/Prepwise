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
}