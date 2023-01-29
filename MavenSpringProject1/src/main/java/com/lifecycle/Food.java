package com.lifecycle;

public class Food {
	private String drink;
	private String fastfood;
	public Food()
	{
		
	}
	public Food(String drink,String fastfood)
	{
		this.drink=drink;
		this.fastfood=fastfood;
	}
	public String getDrink() {
		return drink;
	}
	public String getFastfood() {
		return fastfood;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public void setFastfood(String fastfood) {
		this.fastfood = fastfood;
	}
	public String toString()
	{
		return "["+drink+" and  "+fastfood+"]";
	}
	public void init()
	{
		System.out.println("Food is  preparing ......");
	}
	public void destroy()
	{
		System.out.println("Hope you enjoy our food.....");
	}
}
