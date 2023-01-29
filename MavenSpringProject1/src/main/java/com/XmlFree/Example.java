package com.XmlFree;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Example {
//	@Value("#{23}")
	private int x;
//	@Value("#{'arpita'}")
	private String name;
	public int getX() {
		return x;
	}
	public String getName() {
		return name;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Example [x=" + x + ", name=" + name + "]";
	}
	
}
