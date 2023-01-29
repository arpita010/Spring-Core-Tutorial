package com.springcore.collections;
import java.util.*;
public class Project {
	private int projectId;
	private String projectName;
	public int getProjectId() {
		return projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String toString()
	{

		return projectId+" - "+projectName;
	}
	
}
