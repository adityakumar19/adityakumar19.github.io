package com.aditya.questions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTIONS")
public class Questions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private int questionId;
	
	@Column(name = "QUESTION" , nullable = false)
	private String question;
	
	@Column(name = "ANSWER" , nullable = false)
	private String answer;
	
	@OneToOne
    @JoinColumn(name = "OPTION_ID", referencedColumnName = "ID")
	private Options options;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

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

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public Questions(String question, String answer, Options options) {
		super();
		this.question = question;
		this.answer = answer;
		this.options = options;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + ", answer=" + answer + ", options="
				+ options + "]";
	}

	
}


