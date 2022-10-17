package com.java;

public class Fish 
{
	public String name;
	public String type;
	public double price;
	public String weight;
	public double length;
	
	public Fish()
	{
		System.out.println("enter the fish details of n0-argument list");
	}
	public Fish(String name)
	{
		this.name=name;
		System.out.println("enter the name of the string");
	}
	public Fish(double price)
	{
		this.price=price;
	}
	public Fish(String type , double price)
	{
		this.type=type;
		this.price=price;
	}
	public Fish(String weight , String name)
	{
		this.weight=weight;
		this.name=name;
	}
	public Fish(double price, String weight)
	{
		this.weight=weight;
		this.price=price;
	}
	public Fish(String weight , double length)
	{
		this.length=length;
		this.weight=weight;
	}
	public Fish(double length)
	{
		this.length=length;
	}
}


