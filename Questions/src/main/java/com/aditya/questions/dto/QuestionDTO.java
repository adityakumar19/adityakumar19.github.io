package com.aditya.questions.dto;

public class QuestionDTO {
	private String question;
	private String answer;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public QuestionDTO(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public QuestionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "QuestionDTO [question=" + question + ", answer=" + answer + "]";
	}

}
