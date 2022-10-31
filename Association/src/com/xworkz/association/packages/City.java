package com.xworkz.association.packages;

public class City
{
	public String name;
	public String oldName;
	public boolean capital;
	public String weather;
	
	public City(String name, String oldName, boolean capital, String weather) 
	{
		super();
		this.name = name;
		this.oldName = oldName;
		this.capital = capital;
		this.weather = weather;
	}
	
	public void showOff()
	{
		System.out.println("city details");
		System.out.println(this.name);
		System.out.println(this.oldName);
		System.out.println(this.capital);
		System.out.println(this.weather);
	}
}
