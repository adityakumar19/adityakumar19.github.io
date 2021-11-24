package com.aditya.questions.dto;

public class OptionsDTO {
	private String optionA;
	private String optionB;
	private String optionC;
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

	@Override
	public String toString() {
		return "OptionsDTO [optionA=" + optionA + ", optionB=" + optionB + ", optionC=" + optionC + ", optionD="
				+ optionD + "]";
	}

	public OptionsDTO(String optionA, String optionB, String optionC, String optionD) {
		super();
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
	}

	public OptionsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
