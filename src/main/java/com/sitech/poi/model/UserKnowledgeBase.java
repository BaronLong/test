package com.sitech.poi.model;

public class UserKnowledgeBase {
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
	@Override
	public String toString() {
		return "UserKnowledgeBase [question=" + question + ", answer=" + answer
				+ "]";
	}
	
	
}
