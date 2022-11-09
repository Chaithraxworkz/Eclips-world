package com.xworkz.inheritance.thing;

public class Director 
{
	public static String name;
	public String gender;
	
	public Director(String name, String gender)
	{
		super();
		this.name=name;
		this.gender=gender;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.gender);
	}
}
