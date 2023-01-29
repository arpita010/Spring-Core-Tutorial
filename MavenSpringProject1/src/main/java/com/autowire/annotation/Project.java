package com.autowire.annotation;

public class Project {
	private int pid;
	private String pName;
	public Project() {
		
	}
	public Project(int pid,String pName)
	{
		this.pid=pid;
		this.pName=pName;
	}
	public int getPid() {
		return pid;
	}
	public String getpName() {
		return pName;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String toString()
	{
		return "["+pid+" : "+pName+"]";
	}
}
