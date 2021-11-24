package com.aditya.questions.dto;

import com.aditya.questions.entity.Options;

public class IdAndQuestionOutputDTO {

	private int questionID;
	private String question;
	private Options options;

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public IdAndQuestionOutputDTO(int questionID, String question, Options options) {
		super();
		this.questionID = questionID;
		this.question = question;
		this.options = options;
	}

	public IdAndQuestionOutputDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IdAndQuestionOutputDTO [questionID=" + questionID + ", question=" + question + ", options=" + options
				+ "]";
	}

}
