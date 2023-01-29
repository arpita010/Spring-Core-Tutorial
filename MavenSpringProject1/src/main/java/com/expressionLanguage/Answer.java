package com.expressionLanguage;
import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Answer {
	@Value("#{90+10*2}")
	private int aid;
	@Value("Answer no. 1")
	private String ans;
	@Value("#{quesList}")
	List<String> ques;
	@Value("#{ratingMap}")
	Map<String,Integer> rating;
	public int getAid() {
		return aid;
	}
	public String getAns() {
		return ans;
	}
	public List<String> getQues() {
		return ques;
	}
	public Map<String, Integer> getRating() {
		return rating;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public void setQues(List<String> ques) {
		this.ques = ques;
	}
	public void setRating(Map<String, Integer> rating) {
		this.rating = rating;
	}
	public String toString()
	{
		return aid+" : "+ans+" : "+ques+" : "+rating;
	}
}
