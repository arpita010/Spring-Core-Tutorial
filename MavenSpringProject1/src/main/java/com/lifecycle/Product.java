package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product {
	private int id;
	private String name;
	public Product()
	{
		
	}
	public Product(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
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
	@PostConstruct
	public void start()
	{
		System.out.println("Product is being created.");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("PRoduct is destroyed..");
	}
	public String toString()
	{
		return id+" : "+name;
	}
	
	
	
	
}
