package com.autowiring;

public class Parent {
	private String parentName;
	private String phone;
	public String getParentName() {
		return parentName;
	}
	public String getPhone() {
		return phone;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Parent [parentName=" + parentName + ", phone=" + phone + "]";
	}
}
