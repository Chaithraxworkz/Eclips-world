package com.xworkz.association.things;

public class Student
{
	String name;
	public int age;
	long phoneNo;
	public String location;
	String regNo;
	String branch;
	double fees;
	boolean library;
	public String collegeName;
	boolean campus;
	String country;
	String state;
	int pinCode;
	
	
	
	public Student(String name, long phoneNo, String regNo, String collegeName, boolean library, boolean campus,String country, String state)
	{
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.regNo = regNo;
		this.collegeName = collegeName;
		this.library = library;
		this.campus = campus;
		this.country = country;
		this.state = state;
	}
	
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public double getFees()
	{
		return fees;
	}
	public void setFees(double fees)
	{
		this.fees=fees;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	public String getBranch()
	{
		return branch;
	}
	public int getPinCode()
	{
		return pinCode;
	}
	public void setPinCode(int pinCode)
	{
		this.pinCode=pinCode;
	}
	
	
}
