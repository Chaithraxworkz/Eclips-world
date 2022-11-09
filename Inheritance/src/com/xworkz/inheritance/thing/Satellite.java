package com.xworkz.inheritance.thing;

public class Satellite
{
	public String c_Name;
	public String launched;
	
	public Satellite(String c_Name,String launched)
	{
		super();
		this.c_Name=c_Name;
		this.launched=launched;
	}
	public void display()
	{
		System.out.println(this.c_Name);
		System.out.println(this.launched);
	}
}
