package com.xworkz.Association.thing;

import com.xworkz.Association.Gender;

public class Precident
{
	public String name;
	public int tenure;
	public Gender gender=Gender.MALE;
	
	public Precident(String name)
	{
		this.name=name;
	}
	public void setTenure(int tenure)
	{
		this.tenure=tenure;
	}
	public void display()
	{
		System.out.println("Enter the president details");
		System.out.println(this.name);
		System.out.println(this.tenure);
		System.out.println(this.gender);
	}
}
