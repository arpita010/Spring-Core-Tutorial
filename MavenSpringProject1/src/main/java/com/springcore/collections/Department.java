package com.springcore.collections;
import java.util.*;
public class Department {
	private int dId;
	private String dName;
	private List<Employee> emps;
	public int getdId() {
		return dId;
	}
	public String getdName() {
		return dName;
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	public String toString()
	{
		return dId+" - "+dName+" - "+emps;
	}
}
