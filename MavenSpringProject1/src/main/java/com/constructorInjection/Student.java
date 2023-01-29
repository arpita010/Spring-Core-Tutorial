package com.constructorInjection;
import java.util.*;
public class Student {
	private int id;
	private String name;
	private Course course; 
	public Student(int id,String name,Course course)
	{
		this.id=id;
		this.name=name;
		this.course=course;
	}
	public String toString()
	{
		return "["+id+" : "+name+" : "+course+"]";
	}
}
