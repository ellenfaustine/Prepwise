package com.ellen.backend.controller;
import com.ellen.backend.model.InterviewQuestion;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ellen.backend.service.InterviewService;

@RestController
public class HelloController {

    private final InterviewService interviewService;

    public HelloController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @GetMapping("/api/questions")
    public List<InterviewQuestion> getQuestions() {
        return interviewService.getQuestions();
    }
}