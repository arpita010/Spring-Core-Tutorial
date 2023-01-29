package com.autowiring;

public class Child {
	private String childName;
	private Parent parent;
	public String getChildName() {
		return childName;
	}
	public Parent getParent() {
		return parent;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "Child [childName=" + childName + ", parent=" + parent + "]";
	}
	
}
