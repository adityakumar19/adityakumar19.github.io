 package com.aditya.questions.dto;

public class CreateQuestionInputDTO {

	private QuestionDTO questionDTO;
	private OptionsDTO optionsDTO;

	@Override
	public String toString() {
		return "CreateQuestionInputDTO [questionDTO=" + questionDTO + ", optionsDTO=" + optionsDTO + "]";
	}

	public CreateQuestionInputDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateQuestionInputDTO(QuestionDTO questionDTO, OptionsDTO optionsDTO) {
		super();
		this.questionDTO = questionDTO;
		this.optionsDTO = optionsDTO;
	}

	public QuestionDTO getQuestionDTO() {
		return questionDTO;
	}

	public void setQuestionDTO(QuestionDTO questionDTO) {
		this.questionDTO = questionDTO;
	}

	public OptionsDTO getOptionsDTO() {
		return optionsDTO;
	}

	public void setOptionsDTO(OptionsDTO optionsDTO) {
		this.optionsDTO = optionsDTO;
	}

}
