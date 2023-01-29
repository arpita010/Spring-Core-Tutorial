package com.standalone.collection;

public class Subject {
	private int subId;
	private String subName;
	public int getSubId() {
		return subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String toString()
	{
		return "["+subId+" : "+subName+"]";
	}
}
