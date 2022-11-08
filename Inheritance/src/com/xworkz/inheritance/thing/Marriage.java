package com.xworkz.inheritance.thing;

public class Marriage 
{
	public int date;
	public String location;
	public int members;
	
	public Marriage(int date, String location, int members) {
		super();
		this.date = date;
		this.location = location;
		this.members = members;
		System.out.println("Default const for marriage");
	}
	
	
	
}
