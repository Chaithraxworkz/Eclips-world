package com.xworkz.inheritance.child;

import com.xworkz.inheritance.thing.Criminal;

public class Ravi extends Criminal
{
	public int age;
	
	public Ravi(String name, String offence, int age)
	{
		super(name, offence);
		this.age=age;
	}
	public void display()
	{
		super.display();
		System.out.println(this.age);
	}
}
