package com.java.simple;

public class Boat 
{
	public String name;
	public String color;
	public String companyName;
	public int type;
	public String owner;
	
	public Boat()
	{
		System.out.println("Details of the default arguments list");
	}
	public Boat(String name)
	{
		this.name=name;
		System.out.println("printing a name of the boat");
	}
	public Boat(int type)
	{
		this.type=type;
	}
	public Boat(String name , int type)
	{
		this.name=name;
		this.type=type;
	}
	public Boat(String companyName , String color)
	{
		this.companyName=companyName;
		this.color=color;
	}
	public Boat(int type , String owner)
	{
		this.owner=owner;
		this.type=type;
	}
	public Boat(String owner , String compnyName)
	{
		this.owner=owner;
		this.companyName=compnyName;
	}
	public Boat(String color)
	{
		this.color=color;
	}
	
}

