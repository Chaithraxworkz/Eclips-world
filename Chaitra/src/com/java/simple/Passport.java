package com.java.simple;

public class Passport 
{
	public int no;
	public String name;
	public String expDate;
	public String country;
	public String issueDate;
	public double noOfLeafes;
	
	public Passport()
	{
		System.out.println("Passport details of default constructor");
	}
	public Passport(int no)
	{
		this.no=no;
	}
	public Passport(String name)
	{
		this.name=name;
	}
	public Passport(String expDate , String name)
	{
		this.expDate=expDate;
		this.name=name;
	}
	public Passport(String issueDate, int no)
	{
		this.issueDate=issueDate;
		this.no=no;
	}
	public Passport(double noOfLeaes)
	{
		this.noOfLeafes=noOfLeaes;
	}
	public Passport(String issueDate,double noOfLeafes)
	{
		this.noOfLeafes=noOfLeafes;
		this.issueDate=issueDate;
	}
	public Passport(String name , int no ,String expDate)
	{
		this.name=name;
		this.no=no;
		this.expDate=expDate;
	}
	public Passport(String country , double noOfLeafes , String issueDate)
	{
		this.country=country;
		this.issueDate=issueDate;
		this.noOfLeafes=noOfLeafes;
	}
}

