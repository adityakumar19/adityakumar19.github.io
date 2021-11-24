package com.aditya.questions.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.questions.dao.OptionsRepository;
import com.aditya.questions.dao.QuestionsRepository;
import com.aditya.questions.dto.CreateQuestionInputDTO;
import com.aditya.questions.dto.IdAndQuestionOutputDTO;
import com.aditya.questions.entity.Options;
import com.aditya.questions.entity.Questions;
import com.aditya.questions.service.QuestionsService;

@Service
public class QuestionsServiceImpl implements QuestionsService {

	@Autowired
	QuestionsRepository questionsRepository;
	
	@Autowired
	OptionsRepository optionsRepository;

	@Override
	public List<IdAndQuestionOutputDTO> getAllQuestions(){
		List<Questions> questionsList = questionsRepository.findAll();
		List<IdAndQuestionOutputDTO> idAndQuestionOutputDTOList = new ArrayList<>();
		for (Questions question : questionsList) {
			IdAndQuestionOutputDTO dto = new IdAndQuestionOutputDTO();
			dto.setQuestionID(question.getQuestionId());
			dto.setQuestion(question.getQuestion());
			dto.setOptions(question.getOptions());
			idAndQuestionOutputDTOList.add(dto);
		}
		return idAndQuestionOutputDTOList;
	}

	@Override
	public String getAnswerById(Integer questionId) throws Exception {
		
		Questions question = questionsRepository.findById(questionId).orElse(null);
		if(null!=question) {
			return question.getAnswer();
		}
		else {
			throw new Exception("Invalid question ID");
		}
	}

	@Override
	public String addNewQuestion(CreateQuestionInputDTO inputDto) {
		
		Options option = new Options();
		option.setOptionA(inputDto.getOptionsDTO().getOptionA());
		option.setOptionB(inputDto.getOptionsDTO().getOptionB());
		option.setOptionC(inputDto.getOptionsDTO().getOptionC());
		option.setOptionD(inputDto.getOptionsDTO().getOptionD());
		Options saveOption = optionsRepository.save(option);
		
		Questions question = new Questions();
		question.setAnswer(inputDto.getQuestionDTO().getAnswer());
		question.setQuestion(inputDto.getQuestionDTO().getQuestion());
		question.setOptions(saveOption);
		Questions saveQuestion = questionsRepository.save(question);
		
		return "Question added succesfully";
	}

	@Override
	public String deleteQuestion(Integer questionId) {
		questionsRepository.deleteById(questionId);
		return "Question deleted succefully";
	}

	

}
