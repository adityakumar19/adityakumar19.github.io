package com.aditya.questions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.questions.dto.CreateQuestionInputDTO;
import com.aditya.questions.dto.IdAndQuestionOutputDTO;
import com.aditya.questions.service.QuestionsService;

@RestController
public class QuestionsController {

	@Autowired
	QuestionsService questionsService;

	@GetMapping("/api/questions")
	public List<IdAndQuestionOutputDTO> getAllQuestions() {
		List<IdAndQuestionOutputDTO> questionsList = questionsService.getAllQuestions();
		return questionsList;
	}

	@GetMapping("/api/answer")
	public String getAnswerById(@RequestParam(name = "questionId", required = true) Integer questionId) throws Exception {
		String answer = questionsService.getAnswerById(questionId);
		return answer;
	}

	@PostMapping("api/questions")
	public String createQuestion(@RequestBody CreateQuestionInputDTO inputDto) {
		String message = questionsService.addNewQuestion(inputDto);
		return message; 
	}
	
	@DeleteMapping("api/questions")
	public String deleteQuestion(@RequestParam(name = "questionId" , required = true)Integer questionId) {
		String message = questionsService.deleteQuestion(questionId);
		return message;
	}
}
