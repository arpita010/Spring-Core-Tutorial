package com.standalone.collection;
import java.util.*;
public class Course {
	private int cid;
	private String courseName;
	private List<Subject> subjects;
	private Map<Integer,Integer> marks;
	public Map<Integer, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<Integer, Integer> marks) {
		this.marks = marks;
	}
	public int getCid() {
		return cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public String toString()
	{
		return "["+cid+": "+courseName+" : "+subjects+"\n"+marks+"]";
	}
}
