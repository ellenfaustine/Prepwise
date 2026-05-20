package com.ellen.backend.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.ellen.backend.model.InterviewQuestion;
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

    @PostMapping("/api/questions")
    public InterviewQuestion createQuestion(
            @RequestBody InterviewQuestion question) {

        return interviewService.saveQuestion(question);
    }

    @PutMapping("/api/questions/{id}")
    public InterviewQuestion updateQuestion(
            @PathVariable Long id,
            @RequestBody InterviewQuestion question) {

        return interviewService.updateQuestion(id, question);
    }

    @DeleteMapping("/api/questions/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        interviewService.deleteQuestion(id);
    }
}