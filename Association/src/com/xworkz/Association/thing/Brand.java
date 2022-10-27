package com.xworkz.Association.thing;

public class Brand 
{
	public String name;
	public long gstNo;
	public int rating;
	public Location location=new Location("Kanataka","Channapatana",562138);
	
	public Brand(String name, long gstNo, int rating) 
	{
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
	}
	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.gstNo);
		System.out.println(this.rating);
	}
	
}
