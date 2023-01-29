package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int eid;
	private String eName;
	@Autowired
	@Qualifier("p2")
	private Project p;
	public Employee()
	{
		
	}
//	@Autowired
	public Employee(int eid,String eName,Project p)
	{
		this.eid=eid;
		this.eName=eName;
		this.p=p;
	}
	public int getEid() {
		return eid;
	}
	public String geteName() {
		return eName;
	}
	public Project getP() {
		return p;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
//	@Autowired
	public void setP(Project p) {
		this.p = p;
	}
	public String toString()
	{
		return "["+eid+" : "+eName+" : "+p+"]";
	}
}
