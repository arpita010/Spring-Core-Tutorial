package com.springcore.collections;
import java.util.*;

public class Employee
{
	private int eid;
	private String eName;
	private List<Project> projects;
	public int getEid() {
		return eid;
	}
	public String geteName() {
		return eName;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public String toString()
	{
		return eid+" - "+eName+" - "+projects;
	}
}