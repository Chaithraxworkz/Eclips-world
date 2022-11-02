package com.xworkz.association.things;

public class Employee 
{
	public String name;
	public int id;
	public String role;
	public double salary;
	public String address;
	public long phoneNo;
	public String country;
	public int pinCode;
	public boolean anotherBranch;
	
	
	public Employee(String name, int id, double salary, String address, long phoneNo, String country,int pinCode, boolean anotherBranch) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
		this.phoneNo = phoneNo;
		this.country = country;
		this.pinCode = pinCode;
		this.anotherBranch = anotherBranch;
	}
	public void setRole(String role)
	{
		this.role=role;
	}
	public String getRole()
	{
		return role;
	}
	
}
