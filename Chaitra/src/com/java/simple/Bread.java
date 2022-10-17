package com.java.simple;

public class Bread 
{
	public int type;
	public String shape;
	public double price;
	public String quantity;
	public String companyName;
	
	public Bread()
	{
		System.out.println("non-argument list of the bread");
	}
	public Bread(int type)
	{
		this.type=type;
	}
	public Bread(String shape)
	{
		this.shape=shape;
	}
	public Bread(double price)
	{
		this.price=price;
	}
	public Bread(String shape , int type)
	{
		this.type=type;
		this.shape=shape;
	}
	public Bread(double price , String quantity)
	{
		this.quantity=quantity;
		this.price=price;
	}
	public Bread(String companyName , String shape)
	{
		this.companyName=companyName;
		this.shape=shape;
	}
	public Bread(int price , String quantity , String companyName)
	{
		this.price=price;
		this.companyName=companyName;
		this.quantity=quantity;
	}
}

