package com.xworkz.association.thing;

public class City 
{
	public Name name;
	public boolean capital;
	public double areaInSquareKilometers;
	
	public City(Name name)
	{
		this.name=name;
	}
	public void setCapital(boolean capital)
	{
		this.capital=capital;
	}
	public void setAreaInSquareKilometers(double areaInSquareKilometers)
	{
		this.areaInSquareKilometers=areaInSquareKilometers;
	}
	
	public void display()
	{
		System.out.println("display city");
		System.out.println(this.capital);
		System.out.println(this.areaInSquareKilometers);
		if(this.name!=null)
		{
			System.out.println(this.name);
			this.name.display();
		}
	}
}
