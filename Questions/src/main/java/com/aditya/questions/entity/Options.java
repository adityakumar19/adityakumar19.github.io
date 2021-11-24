 package com.aditya.questions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPTIONS")
public class Options {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID" , nullable = false)
	private int optionId;
	
	@Column(name = "OPTION_A" , nullable = false)
	private String optionA;
	
	@Column(name = "OPTION_B" , nullable = false)
	private String optionB;
	
	@Column(name = "OPTION_C" , nullable = false)
	private String optionC;
	
	@Column(name = "OPTION_D" , nullable = false)
	private String optionD;

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public Options(String optionA, String optionB, String optionC, String optionD) {
		super();
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
	}
	
	

	public Options() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Options [optionId=" + optionId + ", optionA=" + optionA + ", optionB=" + optionB + ", optionC="
				+ optionC + ", optionD=" + optionD + "]";
	}
	
}
