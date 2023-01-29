package com.lifecycle;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean {
	private int id;
	private String name;
	private Food food;
	public Person() {
		
	}
	public Person(int id,String name,Food food)
	{
		this.id=id;
		this.name=name;
		this.food=food;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Food getFood() {
		return food;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public String toString()
	{
		return "["+id+":"+name+" : "+food+"]";
	}
//	public void init()
//	{
//		System.out.println("Person is alive.............");
//	}
	//interface method which is equal to destroy method
	public void destroy()
	{
		System.out.println("Person is dead....");
	}
	//interface method which is equal to init
	public void afterPropertiesSet() throws Exception {
		System.out.println("I am initializing...");
		
	}
}
