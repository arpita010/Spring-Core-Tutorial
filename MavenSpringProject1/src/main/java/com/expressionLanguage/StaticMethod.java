package com.expressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj1") 
public class StaticMethod {
	@Value("#{25}")
	private int x;
	// calling static variable
	@Value("#{T(java.lang.Math).PI}")
	private double y;
	//calling static method T(class).method(param)
	
	@Value("#{T(java.lang.Math).sqrt(100)}")
	private double z;
	@Value("#{new java.lang.String('arpita')}")
	private String name;
	public int getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	public String getName() {
		return name;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StaticMethod [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + "]";
	}
	
}
