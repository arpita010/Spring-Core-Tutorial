package com.constructorInjection;

public class Course {
	private int cid;
	private String courseName;
	public Course(int cid,String courseName)
	{
		this.cid=cid;
		this.courseName=courseName;
	}
	public String toString()
	{
		return "["+cid+" : "+courseName+"]";
	}
}
