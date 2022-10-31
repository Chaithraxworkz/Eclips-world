package com.xworkz.association.packages;

public class Company 
{
	public String name;
	public String ownerName;
	public Address address;
	
	public Company(String name, String ownerName, Address address) 
	{
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.address = address;
	}
	
	public void showOff()
	{
		System.out.println("company details");
		System.out.println(this.name);
		System.out.println(this.ownerName);
		if(this.address!=null)
		{
			
			this.address.showOff();
		}
	}
	
}
