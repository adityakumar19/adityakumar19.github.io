package com.aditya.questions.service;

import java.util.List;

import com.aditya.questions.dto.CreateQuestionInputDTO;
import com.aditya.questions.dto.IdAndQuestionOutputDTO;

public interface QuestionsService {

	List<IdAndQuestionOutputDTO> getAllQuestions();

	String getAnswerById(Integer questionId) throws Exception;

	String addNewQuestion(CreateQuestionInputDTO inputDto);

	String deleteQuestion(Integer questionId);

}
