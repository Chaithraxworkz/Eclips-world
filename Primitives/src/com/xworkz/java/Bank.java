package com.xworkz.java;

public class Bank 
{
	public String name;
	public String location;
	public long account_No;
	public String founded;
	public boolean itIsSafe;  
	public String[] headquarters;
	public String[] branches;
	public String[] type;
	public int[] noOfEmployees;
	
	public Bank(String name,String location,long account_No,String founded,boolean itIsSafe,String[] headquaters,String[] branches,String[] type,int[] noOfmployees)
	{
		this.name=name;
		this.location=location;
		this.account_No=account_No;
		this.founded=founded;
		this.itIsSafe=itIsSafe;
		this.headquarters=headquaters;
		this.branches=branches;
		this.type=type;
		this.noOfEmployees=noOfmployees;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.account_No);
		System.out.println(this.founded);
		System.out.println(this.itIsSafe);
		for (int i = 0; i < this.branches.length; i++) 
		{
			String string = this.branches[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.headquarters.length; i++) 
		{
			String string = this.headquarters[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.type.length; i++)
		{
			String string = this.type[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.noOfEmployees.length; i++) 
		{
			int string = this.noOfEmployees[i];
			System.out.println(string);
		}
	}
	
	
}
