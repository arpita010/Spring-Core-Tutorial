package com.package1;

public class Student {
	private int id;
	private String name;
	private Address address;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString()
	{
		return id+" - "+name+" - "+address;
	}
}
