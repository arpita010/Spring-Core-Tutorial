package com.expressionLanguage;
import java.util.*;
public class Question {
	private int qid;
	private String question;
	List<String> ans;
	public int getQid() {
		return qid;
	}
	public String getQuestion() {
		return question;
	}
	public List<String> getAns() {
		return ans;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", ans=" + ans + "]";
	}
	
}
