package com.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu1")
public class Student {
	@Value("101")
	private int id;
	@Value("Arpita Mittal")
	private String name;
	@Value("#{subjects}")
	private List<String> subjects;
	public int getId() {
		return id;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "["+id+" : "+name+" : "+subjects+"]";
	}
}
