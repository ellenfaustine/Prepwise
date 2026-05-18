package com.ellen.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ellen.backend.model.InterviewQuestion;

public interface InterviewQuestionRepository
        extends JpaRepository<InterviewQuestion, Long> {

}