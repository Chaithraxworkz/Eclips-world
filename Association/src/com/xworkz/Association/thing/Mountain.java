package com.xworkz.Association.thing;

public class Mountain
{
	public String name;
	public double height;
	public Locations location=new Locations("Isha Foundation","Tamilnadu","Koymattur",562891,"India");
	public Temple temple=new Temple("Shiva_Temple","Shiva","Belive",1000,9.5);
	
	public Mountain(String name,double height)
	{
		this.name=name;
		this.height=height;
	}
	
	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.height);
		location.showOff();
		temple.god.astra.showOff();
	}
	
	
}
