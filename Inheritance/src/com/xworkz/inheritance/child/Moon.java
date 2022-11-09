package com.xworkz.inheritance.child;

import com.xworkz.inheritance.thing.Satellite;

public class Moon extends Satellite
{
	public double distance;

	public Moon(String c_Name, String launched, double distance) 
	{
		super(c_Name, launched);
		this.distance=distance;
	}
	
	public void display()
	{
		super.display();
		System.out.println(this.distance);
	}
}






