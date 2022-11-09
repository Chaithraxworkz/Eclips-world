package com.xworkz.inheritance.child;

import com.xworkz.inheritance.thing.Director;

public class Company extends Director
{
	public String companyName;
	public int started;
	
	public Company(String name, String gender,int started, String companyName)
	{
		super(name, gender);
		this.companyName=companyName;
		this.started=started;
	}
	public void display()
	{
		super.display();
		System.out.println(this.companyName);
		System.out.println(this.started);
	
	}
	
	
}
