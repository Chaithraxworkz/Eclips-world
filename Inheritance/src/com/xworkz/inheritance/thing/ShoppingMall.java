package com.xworkz.inheritance.thing;

public class ShoppingMall 
{
	public String name;
	public String locaion;
	
	public ShoppingMall(String name, String locaion) 
	{
		super();
		this.name = name;
		this.locaion = locaion;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.locaion);
	}
	
}
