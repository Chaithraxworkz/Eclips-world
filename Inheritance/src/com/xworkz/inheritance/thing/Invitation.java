package com.xworkz.inheritance.thing;

import com.xworkz.inheritance.component.Type;

public class Invitation 
{
	public String name;
	public Type type;
	public double price;
	public double height;
	
	
	public Invitation(String name, Type type, double price, double height) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.height = height;
	}
	
	
}
