package com.xworkz.association;

import com.xworkz.association.thing.City;
import com.xworkz.association.thing.Precident;

public class Country 
{
	public String name;
	public City[] cities;
	public Precident precident;
	
	public Country(String name)
	{
		this.name=name;
	}
	public void setCities(City[] cities)
	{
		this.cities=cities;
	}
	public void setPrecident(Precident precident)
	{
		this.precident=precident;
	}
	public void display()
	{
		System.out.println("Enter the country details");
		System.out.println(this.name);
		if(cities!=null)
		{
			for (int i = 0; i < cities.length; i++) 
			{
				City city = cities[i];
				System.out.println(city);
				if(city!=null)
				{
					city.display();
				}
				else
				{
					System.out.println("city is not null"+i);
				}
				
				if(this.precident!=null)
				{
					System.out.println(this.precident);
					this.precident.display();
				}
				else
				{
					System.out.println("precident is null");
				}
			}
		}
	}
}
