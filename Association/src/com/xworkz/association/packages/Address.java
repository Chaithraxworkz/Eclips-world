package com.xworkz.association.packages;

public class Address 
{
	public Location location;

	public Address(Location location)
	{
		super();
		this.location = location;
	}
	
	public void showOff()
	{
		System.out.println("location details");
		if(this.location!=null)
		{
			
			location.showOff();
		}
	}
}
